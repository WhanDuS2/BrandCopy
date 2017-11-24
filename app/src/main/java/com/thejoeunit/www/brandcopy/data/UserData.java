package com.thejoeunit.www.brandcopy.data;

import java.io.Serializable;

/**
 * Created by the on 2017-11-23.
 */

public class UserData implements Serializable {

    private String email;
    private String nickName;
    private int userId;
    private String password;
    private boolean isManager; // 매니저모드인지 아닌지,

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}