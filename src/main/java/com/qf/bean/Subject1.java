package com.qf.bean;

public class Subject1 {
    private Integer subject1Id;

    private String subject1Question;

    private Integer subject1Answer;

    private String subject1Item1;

    private String subject1Item2;

    private String subject1Item3;

    private String subject1Item4;

    private String subject1Explains;

    private String subject1Url;

    private Integer subject1Chapter;

    private Integer stid;

    private Specialtype specialtype;

    public Specialtype getSpecialtype() {
        return specialtype;
    }

    public void setSpecialtype(Specialtype specialtype) {
        this.specialtype = specialtype;
    }

    public Integer getSubject1Id() {
        return subject1Id;
    }

    public void setSubject1Id(Integer subject1Id) {
        this.subject1Id = subject1Id;
    }

    public String getSubject1Question() {
        return subject1Question;
    }

    public void setSubject1Question(String subject1Question) {
        this.subject1Question = subject1Question == null ? null : subject1Question.trim();
    }

    public Integer getSubject1Answer() {
        return subject1Answer;
    }

    public void setSubject1Answer(Integer subject1Answer) {
        this.subject1Answer = subject1Answer;
    }

    public String getSubject1Item1() {
        return subject1Item1;
    }

    public void setSubject1Item1(String subject1Item1) {
        this.subject1Item1 = subject1Item1 == null ? null : subject1Item1.trim();
    }

    public String getSubject1Item2() {
        return subject1Item2;
    }

    public void setSubject1Item2(String subject1Item2) {
        this.subject1Item2 = subject1Item2 == null ? null : subject1Item2.trim();
    }

    public String getSubject1Item3() {
        return subject1Item3;
    }

    public void setSubject1Item3(String subject1Item3) {
        this.subject1Item3 = subject1Item3 == null ? null : subject1Item3.trim();
    }

    public String getSubject1Item4() {
        return subject1Item4;
    }

    public void setSubject1Item4(String subject1Item4) {
        this.subject1Item4 = subject1Item4 == null ? null : subject1Item4.trim();
    }

    public String getSubject1Explains() {
        return subject1Explains;
    }

    public void setSubject1Explains(String subject1Explains) {
        this.subject1Explains = subject1Explains == null ? null : subject1Explains.trim();
    }

    public String getSubject1Url() {
        return subject1Url;
    }

    public void setSubject1Url(String subject1Url) {
        this.subject1Url = subject1Url == null ? null : subject1Url.trim();
    }

    public Integer getSubject1Chapter() {
        return subject1Chapter;
    }

    public void setSubject1Chapter(Integer subject1Chapter) {
        this.subject1Chapter = subject1Chapter;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }
}