package com.qf.dao;

import com.qf.bean.Specialtype;
import com.qf.bean.Subject1;

import java.util.List;
import java.util.Map;

public interface Subject1Dao {

    List<Subject1> findall();

    List<Subject1> unfinishedtest(int userid);

    int collect(Map map);

    List<Subject1> doSTtest(int stid);

    List<Subject1> doerrorSTtest(int stid);

    int deleteByPrimaryKey(Integer subject1Id);

    int insert(Subject1 record);

    int insertSelective(Subject1 record);

    Subject1 selectByPrimaryKey(Integer subject1Id);

    int updateByPrimaryKeySelective(Subject1 record);

    int updateByPrimaryKey(Subject1 record);
}