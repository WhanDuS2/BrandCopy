package com.thejoeunit.www.brandcopy.data;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by the on 2017-11-23.
 */

public class UserData implements Serializable {

    private String email;
    private String nickName;
    private int userId;
    private boolean isManager; // 매니저모드인지 아닌지,

    public static UserData getUserFromJsonObject(JSONObject json) {
//        매번 파싱하기 매우 귀찮다.
        UserData user = new UserData();
//        json을 파싱해서, tempUser의 내용물로 채워주기.
        try {
            user.setUserId(json.getInt("id"));
            user.setNickName(json.getString("nickname"));
                user.setEmail(json.getString("e_mail"));

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return user;

    }


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

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}