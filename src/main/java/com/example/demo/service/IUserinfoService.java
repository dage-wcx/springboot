package com.example.demo.service;

import com.example.demo.entity.Userinfo;

import java.util.List;

public interface IUserinfoService {

    /**
     * 添加用户
     * @param userinfo
     * @return
     */
    boolean addUserinfo(Userinfo userinfo);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUserinfo(Integer id);

    /**
     * 获取所有用户
     * @return
     */
    List<Userinfo> queryAllUserinfo();

    /**
     * 更新用户
     * @param userinfo
     * @return
     */
    boolean updateUserinfoById(Userinfo userinfo);
}
