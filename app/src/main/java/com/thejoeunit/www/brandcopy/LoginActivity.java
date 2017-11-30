package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.thejoeunit.www.brandcopy.data.UserData;
import com.thejoeunit.www.brandcopy.util.ContextUtil;
import com.thejoeunit.www.brandcopy.util.ServerUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Locale;

public class LoginActivity extends BaseActivity {


    private EditText emailEdt;
    private EditText pwEdt;
    private Button loginBtn;
    private TextView signUpTxt;
    private TextView forgetIdPwTxt;
    private Button nonMemberBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

               nonMemberBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        signUpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, SignUpActivity.class);
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServerUtil.get_sign_in(mContext,
                        emailEdt.getText().toString(),
                        pwEdt.getText().toString(),
                        new ServerUtil.JsonResponseHandler() {
                            @Override
                            public void onResponse(JSONObject json) {
                                try {
                                    JSONArray users = json.getJSONArray("users");


                                    if (users.length() > 0) {
                                        UserData temp = UserData.getUserFromJsonObject(users.getJSONObject(0));


                                        Log.d("이메일주소", temp.getEmail());

                                        String welcomMessageStr = String.format(Locale.KOREA, "%s님이 로그인 했습니다.", temp.getEmail());
                                        Toast.makeText(mContext, welcomMessageStr, Toast.LENGTH_SHORT).show();

                                        ContextUtil.login(mContext, temp);

    //                                        화면을 MainActivity로 이동, 현재 화면 종료

                                        Intent intent = new Intent(mContext, MainActivity.class);
                                        startActivity(intent);
                                        finish();


                                    }
                                    else {
                                        Toast.makeText(mContext, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show();
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        });

            }


            });
    }



        @Override
        public void setValues () {

        }

        @Override
        public void bindViews () {
            this.nonMemberBtn = (Button) findViewById(R.id.nonMemberBtn);
            this.forgetIdPwTxt = (TextView) findViewById(R.id.forgetIdPwTxt);
            this.signUpTxt = (TextView) findViewById(R.id.signUpTxt);
            this.loginBtn = (Button) findViewById(R.id.loginBtn);
            this.pwEdt = (EditText) findViewById(R.id.pwEdt);
            this.emailEdt = (EditText) findViewById(R.id.emailEdt);

        }
    }
