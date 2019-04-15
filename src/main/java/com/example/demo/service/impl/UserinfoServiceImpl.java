package com.example.demo.service.impl;

import com.example.demo.entity.Userinfo;
import com.example.demo.mapper.UserinfoMapper;
import com.example.demo.service.IUserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserinfoServiceImpl implements IUserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    @Transactional
    public boolean addUserinfo(Userinfo userinfo) {
        userinfo.setCreatetime(new Date());
        int i = userinfoMapper.insertUserinfo(userinfo);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUserinfo(Integer id) {
        int i = userinfoMapper.deleteUserinfo(id);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    @Cacheable(value = "userinfo")
    public List<Userinfo> queryAllUserinfo() {
        List<Userinfo> list = userinfoMapper.queryAllUserinfo();
        return list;
    }

    @Override
    public boolean updateUserinfoById(Userinfo userinfo) {
        int i = userinfoMapper.updateUserinfoById(userinfo);
        if(i>0){
            return true;
        }
        return false;
    }

    @Override
    @Cacheable(value = "userinfo")
    public Userinfo queryUserinfoById(Integer id) {
        Userinfo u = userinfoMapper.queryUserinfoById(id);
        return u;
    }

    @Override
    @Cacheable(value = "userinfo")
    @CacheEvict(value = "userinfo",allEntries = true)
    public Userinfo queryUserinfoById1(Integer id) {
        Userinfo u = userinfoMapper.queryUserinfoById(id);
        return u;
    }
}
