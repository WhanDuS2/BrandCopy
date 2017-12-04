package com.thejoeunit.www.brandcopy.util;

/**
 * Created by the on 2017-11-29.
 */

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by KJ_Studio on 2015-12-24.
 */
public class ServerUtil {

    private static final String TAG = ServerUtil.class.getSimpleName();
    private final static String BASE_URL = "http://192.168.100.105:8080/"; // 라이브서버
//    private final static String BASE_URL = "http://share-tdd.com/"; // 개발서버

    public interface JsonResponseHandler {
        void onResponse(JSONObject json);
    }


    //  관리자 게시물 기능
    public static void insert_new_post(final Context context, int userId, int postClassification, int views, String content,
                                       String profileURL, String title, final JsonResponseHandler handler) {
        String url = BASE_URL + "fmpic/insert_new_post";
//        		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", userId + "");
        data.put("postClassification", postClassification + "");
        data.put("views", views + "");
        data.put("content", content);
        data.put("profileURL", profileURL);
        data.put("title", title);

        AsyncHttpRequest.post(context, url, data, true, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


    // 회원가입 기능
    public static void insert_new_user(final Context context, String nickname, String e_mail, String password, final JsonResponseHandler handler) {
        String url = BASE_URL + "fmpic/insert_new_user";
//        		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_nickname", nickname);
        data.put("user_e_mail", e_mail);
        data.put("password", password);

        AsyncHttpRequest.post(context, url, data, true, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


    // 로그인 기능
    public static void get_sign_in(final Context context, String email, String pw, final JsonResponseHandler handler) {
        String url = BASE_URL + "fmpic/get_sign_in";
//        		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_e_mail", email);
        data.put("password", pw);

        AsyncHttpRequest.post(context, url, data, true, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


    // 테스트용 모든 사용자 가져오기
    public static void getAllusers(final Context context, final JsonResponseHandler handler) {
        String url = BASE_URL + "fmpic/getAllusers";
//        		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();

        AsyncHttpRequest.post(context, url, data, true, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                System.out.println(response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


}
