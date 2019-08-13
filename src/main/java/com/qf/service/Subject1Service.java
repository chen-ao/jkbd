package com.qf.service;

import com.qf.bean.Specialtype;
import com.qf.bean.Subject1;

import java.util.List;

/**
 * @auther 费龙衍
 * @date 2019/7/30 21:28
 * 面向对象面向君,不负代码不负卿
 */
public interface Subject1Service {

    List<Subject1> findall(int index);

    List<Subject1> viptest();

    List<Subject1> unfinishedtest(int userid);

    int collect(int questionid, int userid);

    List<Specialtype> specialtypetest();
    List<Subject1> doSTtest(int specialtypeid);

    List<Specialtype> errorSTtest();
    List<Subject1> doerrorSTtest(int specialtypeid);

    public List<Subject1> randomtest();
}
