package com.qf.dao;

import com.qf.bean.Specialtype;
import com.qf.bean.Subject1;

import java.util.List;

public interface SpecialtypeDao {
    List<Specialtype> specialtypetest();

    List<Specialtype> errorSTtest();

    int insert(Specialtype record);

    int insertSelective(Specialtype record);

}