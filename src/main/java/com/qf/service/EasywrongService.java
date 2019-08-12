package com.qf.service;

import com.qf.bean.EasyWrong;

import java.util.List;

public interface EasywrongService {
    int deleteByPrimaryKey(Integer iid);

    int insert(EasyWrong record);

    int insertSelective(EasyWrong record);

    EasyWrong selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(EasyWrong record);

    int updateByPrimaryKey(EasyWrong record);

    List<EasyWrong> getall();
}
