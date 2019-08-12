package com.qf.service;

import com.qf.bean.VipQuestionBank;

import java.util.List;

/**
 * 鸡你太美
 */

public interface VipQuestionBankService {
    int deleteByPrimaryKey(Integer iid);

    int insert(VipQuestionBank record);

    int insertSelective(VipQuestionBank record);

    VipQuestionBank selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(VipQuestionBank record);

    int updateByPrimaryKey(VipQuestionBank record);

    List<VipQuestionBank> findAll();

    List<VipQuestionBank> selectVipForRandom();
}

