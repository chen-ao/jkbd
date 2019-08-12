package com.qf.dao;

import com.qf.bean.VipQuestionBank;

import java.util.List;

public interface VipQuestionBankMapper {
    int deleteByPrimaryKey(Integer iid);

    int insert(VipQuestionBank record);

    int insertSelective(VipQuestionBank record);

    VipQuestionBank selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(VipQuestionBank record);

    int updateByPrimaryKey(VipQuestionBank record);

    List<VipQuestionBank> findAll();

    List<VipQuestionBank> selectVipForRandom();
}