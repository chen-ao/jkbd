package com.qf.bean;

public class Specialtype {
    private Integer specialtypeid;

    private String specialtypename;

    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSpecialtypeid() {
        return specialtypeid;
    }

    public void setSpecialtypeid(Integer specialtypeid) {
        this.specialtypeid = specialtypeid;
    }

    public String getSpecialtypename() {
        return specialtypename;
    }

    public void setSpecialtypename(String specialtypename) {
        this.specialtypename = specialtypename == null ? null : specialtypename.trim();
    }
}