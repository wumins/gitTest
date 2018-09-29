package com.example.demo.vo;

import java.util.Objects;

public class UserInfo {

    //用户id
    private long id;

    //登录名
    private String loginName;

    //密码
    private String password;

    //用户名
    private String name;

    public UserInfo() {

    }

    public UserInfo(long id, String loginName, String password, String name) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInfo)) return false;
        UserInfo userInfo = (UserInfo) o;
        return id == userInfo.id &&
                Objects.equals(loginName, userInfo.loginName) &&
                Objects.equals(password, userInfo.password) &&
                Objects.equals(name, userInfo.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, loginName, password, name);
    }
}
