package com.qf.service.impl;

import com.qf.bean.EasyWrong;
import com.qf.dao.EasyWrongMapper;
import com.qf.service.EasywrongService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 鸡你太美
 */
@Service
public class EasywrongServiceImpl implements EasywrongService {
    @Resource
    private EasyWrongMapper easyWrongMapper;
    @Override
    public int deleteByPrimaryKey(Integer iid) {
        return 0;
    }

    @Override
    public int insert(EasyWrong record) {
        return 0;
    }

    @Override
    public int insertSelective(EasyWrong record) {
        return 0;
    }

    @Override
    public EasyWrong selectByPrimaryKey(Integer iid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(EasyWrong record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(EasyWrong record) {
        return 0;
    }

    @Override
    public List<EasyWrong> getall() {
        return easyWrongMapper.findall();
    }
}
