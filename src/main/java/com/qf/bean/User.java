package com.qf.bean;

public class User {
    private Integer userId;

    private String userName;

    private Integer userGender;

    private Integer userStatus;

    private String userArea;

    private String userIntroduction;

    private Integer userTotalAnswers;

    private Double userAvgScore;

    private Double userAccuracy;

    private Integer userExamTimes;

    private Integer userPasstime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserArea() {
        return userArea;
    }

    public void setUserArea(String userArea) {
        this.userArea = userArea == null ? null : userArea.trim();
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction == null ? null : userIntroduction.trim();
    }

    public Integer getUserTotalAnswers() {
        return userTotalAnswers;
    }

    public void setUserTotalAnswers(Integer userTotalAnswers) {
        this.userTotalAnswers = userTotalAnswers;
    }

    public Double getUserAvgScore() {
        return userAvgScore;
    }

    public void setUserAvgScore(Double userAvgScore) {
        this.userAvgScore = userAvgScore;
    }

    public Double getUserAccuracy() {
        return userAccuracy;
    }

    public void setUserAccuracy(Double userAccuracy) {
        this.userAccuracy = userAccuracy;
    }

    public Integer getUserExamTimes() {
        return userExamTimes;
    }

    public void setUserExamTimes(Integer userExamTimes) {
        this.userExamTimes = userExamTimes;
    }

    public Integer getUserPasstime() {
        return userPasstime;
    }

    public void setUserPasstime(Integer userPasstime) {
        this.userPasstime = userPasstime;
    }
}