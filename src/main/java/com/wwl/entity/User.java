package com.wwl.entity;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by Administrator on 2015/11/19.
 */
public class User {

    private int uId;

    private String uUsername;

    private String uRelname;

    private String uPassword;

    private BigDecimal uRoleId;

    private BigDecimal uStatus;

    private Date uCreatetime;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    public String getuRelname() {
        return uRelname;
    }

    public void setuRelname(String uRelname) {
        this.uRelname = uRelname;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public BigDecimal getuRoleId() {
        return uRoleId;
    }

    public void setuRoleId(BigDecimal uRoleId) {
        this.uRoleId = uRoleId;
    }

    public BigDecimal getuStatus() {
        return uStatus;
    }

    public void setuStatus(BigDecimal uStatus) {
        this.uStatus = uStatus;
    }

    public Date getuCreatetime() {
        return uCreatetime;
    }

    public void setuCreatetime(Date uCreatetime) {
        this.uCreatetime = uCreatetime;
    }
}
