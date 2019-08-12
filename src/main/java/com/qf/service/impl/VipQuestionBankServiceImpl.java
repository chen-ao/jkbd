package com.qf.service.impl;

import com.qf.bean.VipQuestionBank;
import com.qf.dao.VipQuestionBankMapper;
import com.qf.service.VipQuestionBankService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 鸡你太美
 */

@Service
public class VipQuestionBankServiceImpl implements VipQuestionBankService {

    @Resource
    private VipQuestionBankMapper vipQuestionBankMapper;

    @Override
    public int deleteByPrimaryKey(Integer iid) {
        return 0;
    }

    @Override
    public int insert(VipQuestionBank record) {
        return 0;
    }

    @Override
    public int insertSelective(VipQuestionBank record) {
        return 0;
    }

    @Override
    public VipQuestionBank selectByPrimaryKey(Integer iid) {
        return vipQuestionBankMapper.selectByPrimaryKey(iid);
    }

    @Override
    public int updateByPrimaryKeySelective(VipQuestionBank record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(VipQuestionBank record) {
        return 0;
    }

    @Override
    public List<VipQuestionBank> findAll() {
        return vipQuestionBankMapper.findAll();
    }

    @Override
    public List<VipQuestionBank> selectVipForRandom() {
        return vipQuestionBankMapper.selectVipForRandom();
    }


}
