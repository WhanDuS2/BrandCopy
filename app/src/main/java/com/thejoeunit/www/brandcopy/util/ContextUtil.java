package com.thejoeunit.www.brandcopy.util;

/**
 * Created by the on 2017-11-29.
 */

import android.content.Context;
import android.content.SharedPreferences;

import com.thejoeunit.www.brandcopy.data.UserData;


/**
 * Created by user on 2017-08-31.
 */

public class ContextUtil {

    private static UserData loginUser = null;

    private static final String prefName = "LecturePref";

//    1. 사용자 숫자 ID
//    2. 사용자 폰번

    private static final String ID = "ID";
    private static final String USER_ID = "USER_ID";
    private static final String USER_NICK_NAME = "USER_NICK_NAME";
    private static final String USER_E_MAIL = "USER_E_MAIL";


    public static void logout(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        pref.edit().putInt(ID, 0).commit();
        pref.edit().putString(USER_ID, "").commit();
        pref.edit().putString(USER_NICK_NAME, "").commit();
        pref.edit().putString(USER_E_MAIL, "").commit();

    }

    public static void login(Context context, UserData loginUser) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        pref.edit().putInt(ID, loginUser.getUserId()).commit();
        pref.edit().putString(USER_NICK_NAME, loginUser.getNickName()).commit();
        pref.edit().putString(USER_E_MAIL, loginUser.getEmail()).commit();


    }

    public static UserData getLoginUser(Context context) {
        SharedPreferences pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE);

        if (pref.getString(USER_ID, "").equals("")) {
//            로그인이 안된 상태
            loginUser = null;
        }
        else {
            loginUser = new UserData();
            loginUser.setUserId(pref.getInt(ID, 0));
            loginUser.setNickName(pref.getString(USER_NICK_NAME, ""));

        }


        return loginUser;
    }

}