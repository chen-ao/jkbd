package com.qf.dao;

import com.qf.bean.User;

import java.util.Map;

public interface UserDao {

    User finduser(Map map);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}