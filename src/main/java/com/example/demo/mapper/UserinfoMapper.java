package com.example.demo.mapper;

import com.example.demo.entity.Userinfo;

import java.util.List;

public interface UserinfoMapper {

    int insertUserinfo(Userinfo userinfo);

    int deleteUserinfo(Integer id);

    List<Userinfo> queryAllUserinfo();

    int updateUserinfoById(Userinfo userinfo);
}
