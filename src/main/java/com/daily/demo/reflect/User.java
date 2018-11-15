package com.daily.demo.reflect;

/**
 * @author fanzhengjie
 * @create 2018/11/15 下午4:39
 * @description
 */
public class User {

    private Long userId;

    private String userName;

    private Integer age;

    private String sex;

    public Double grade;

    public User(){}

    public User(Long userId, String userName, Integer age,String sex, double grade){
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.sex = sex;
        this.grade = grade;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", grade='" + grade + '\'' +
            '}';
    }
}
