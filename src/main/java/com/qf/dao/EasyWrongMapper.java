package com.qf.dao;

import com.qf.bean.EasyWrong;

import java.util.List;

public interface EasyWrongMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(EasyWrong record);

    int insertSelective(EasyWrong record);

    EasyWrong selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(EasyWrong record);

    int updateByPrimaryKey(EasyWrong record);

    List<EasyWrong> findall();
}