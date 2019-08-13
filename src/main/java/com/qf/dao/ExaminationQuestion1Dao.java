package com.qf.dao;

import com.qf.bean.ExaminationQuestion1;
import com.qf.bean.Subject1;

import java.util.List;

public interface ExaminationQuestion1Dao {

    List<Subject1> viptest();

    int deleteByPrimaryKey(Integer id);

    int insert(ExaminationQuestion1 record);

    int insertSelective(ExaminationQuestion1 record);

    ExaminationQuestion1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExaminationQuestion1 record);

    int updateByPrimaryKey(ExaminationQuestion1 record);
}