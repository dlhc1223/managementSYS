package com.cxl.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private String userName;
    private String loginNmae;
    private String password;
    private Integer status;
    private Date creatDate;

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginNmae() {
        return loginNmae;
    }

    public void setLoginNmae(String loginNmae) {
        this.loginNmae = loginNmae;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", loginNmae='" + loginNmae + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", creatDate=" + creatDate +
                '}';
    }
}
