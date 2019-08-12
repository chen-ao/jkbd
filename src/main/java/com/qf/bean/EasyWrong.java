package com.qf.bean;

public class EasyWrong {
    private Integer iid;

    private Integer id;

    private Integer bankno;

    private String question;

    private String answer;

    private String item1;

    private String item2;

    private String item3;

    private String item4;

    private String explains;

    private String url;

    private Integer wrongnumber;

    private Integer iswrong;

    private Integer iscollected;

    private Integer isanswered;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankno() {
        return bankno;
    }

    public void setBankno(Integer bankno) {
        this.bankno = bankno;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1 == null ? null : item1.trim();
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2 == null ? null : item2.trim();
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3 == null ? null : item3.trim();
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4 == null ? null : item4.trim();
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains == null ? null : explains.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getWrongnumber() {
        return wrongnumber;
    }

    public void setWrongnumber(Integer wrongnumber) {
        this.wrongnumber = wrongnumber;
    }

    public Integer getIswrong() {
        return iswrong;
    }

    public void setIswrong(Integer iswrong) {
        this.iswrong = iswrong;
    }

    public Integer getIscollected() {
        return iscollected;
    }

    public void setIscollected(Integer iscollected) {
        this.iscollected = iscollected;
    }

    public Integer getIsanswered() {
        return isanswered;
    }

    public void setIsanswered(Integer isanswered) {
        this.isanswered = isanswered;
    }
}