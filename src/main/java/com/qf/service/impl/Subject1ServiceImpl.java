package com.qf.service.impl;

import com.qf.bean.ExaminationQuestion1;
import com.qf.bean.Specialtype;
import com.qf.bean.Subject1;
import com.qf.dao.ExaminationQuestion1Dao;
import com.qf.dao.SpecialtypeDao;
import com.qf.dao.Subject1Dao;
import com.qf.service.Subject1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Subject1ServiceImpl implements Subject1Service {

    @Resource
    private Subject1Dao subject1Dao;

    @Resource
    private SpecialtypeDao specialtypeDao;

    @Resource
    private ExaminationQuestion1Dao examinationQuestion1Dao;

    //顺序练习
    @Override
    public List<Subject1> findall(int index) {
        List<Subject1> list=subject1Dao.findall();
        if(index==1) {
            return list;
        }else {
            return getRandom(list);
        }
    }

    List<Subject1> getRandom(List<Subject1> list){
        List<Subject1> subject1s=new ArrayList<>();
        for(int i=0;i<100;i++) {
            for (Subject1 subject1 : list) {
                if(subject1.getSubject1Id()!=null&&subject1.getSubject1Id()==(Math.random() * (3333 - 3133) + 3133)){
                    subject1s.add(subject1);
                }
            }
        }
        return subject1s;
    }

    //VIP课堂
    @Override
    public List<Subject1> viptest() {
        return examinationQuestion1Dao.viptest();
    }

    //优先未做题模拟
    @Override
    public List<Subject1> unfinishedtest(int userid) {
        List<Subject1> list1=subject1Dao.findall();
        List<Subject1> list2=subject1Dao.unfinishedtest(userid);
        List<Subject1> list3=new ArrayList<>();
        if(list2!=null&&list2.size()>0) {
            for (Subject1 subject1 : list2) {
                for (Subject1 subject12 : list1) {
                    if (subject12.getSubject1Id() != subject1.getSubject1Id()) {
                        list3.add(subject12);
                    }
                }
            }
            if(list3.size()<100){
                for (Subject1 subject1 : list2) {
                    list3.add(subject1);
                    if(list3.size()>=100){
                        break;
                    }
                }
            }
            return list3;
        }else {
            return list1;
        }
    }

    //收藏题
    @Override
    @Transactional
    public int collect(int qid, int uid) {
        Map map=new HashMap();
        map.put("qid",qid);
        map.put("uid",uid);
        int k=subject1Dao.collect(map);
        return k;
    }

    //专项练习_获取练习项
    @Override
    public List<Specialtype> specialtypetest() {
        return specialtypeDao.specialtypetest();
    }
    //专项练习_开始练习
    @Override
    public List<Subject1> doSTtest(int specialtypeid) {
        return subject1Dao.doSTtest(specialtypeid);
    }

    //错题练习_获取练习项
    @Override
    public List<Specialtype> errorSTtest() {
        return specialtypeDao.errorSTtest();
    }
    //错题练习_开始练习错题
    @Override
    public List<Subject1> doerrorSTtest(int specialtypeid) {
        return subject1Dao.doerrorSTtest(specialtypeid);
    }

    //随机练习
    @Override
    public List<Subject1> randomtest(){
        List<Subject1> list=subject1Dao.findall();
        List<Subject1> subject1s=new ArrayList<>();
        for (Subject1 subject1 : list) {
            if(subject1.getSubject1Id()!=null&&subject1.getSubject1Id()==(Math.random() * (3333 - 3133) + 3133)){
                subject1s.add(subject1);
            }
        }
        return subject1s;
    }
}
