package com.example.demo.entity;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Userinfo {
    private Integer id;

    @NotBlank//用户名非空效验
    private String username;

    @NotBlank//密码非空效验
    private String password;

    private Integer phone;

    private String sex;

    private Date createtime;

    private Date lasttime;

    private Integer loginCount;

    private String question;

    private String answer;

    public Userinfo(Integer id, String username, String password, Integer phone, String sex, Date createtime, Date lasttime, Integer loginCount, String question, String answer) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.createtime = createtime;
        this.lasttime = lasttime;
        this.loginCount = loginCount;
        this.question = question;
        this.answer = answer;
    }

    public Userinfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
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

    @Override
    public String toString() {
        return "Userinfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", sex='" + sex + '\'' +
                ", createtime=" + createtime +
                ", lasttime=" + lasttime +
                ", loginCount=" + loginCount +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}