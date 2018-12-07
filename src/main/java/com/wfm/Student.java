package com.wfm;

/**
 * @program: JdbcTest
 * @description: test for reflect
 * @author: wfm
 * @create: 2018-11-19 15:46
 **/
public class Student {
    public Student(){
    }
    public Student(String name, int age, char sex, String no) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNum = no;
    }

    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phoneNum=" + phoneNum + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
