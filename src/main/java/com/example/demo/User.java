package com.example.demo;

public class User {
    private int age;
    private String pwd;
    private String phone;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
