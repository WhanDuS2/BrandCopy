package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.thejoeunit.www.brandcopy.data.UserData;
import com.thejoeunit.www.brandcopy.util.ServerUtil;

import org.json.JSONObject;

public class LoginActivity extends BaseActivity {

    private android.widget.EditText pwEdt;
    private android.widget.Button loginBtn;
    private android.widget.TextView signUpTxt;
    private android.widget.TextView forgetIdPwTxt;
    private android.widget.Button nonMemberBtn;
    private EditText emailEdt;

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

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ServerUtil.sign_in(mContext,
                        emailEdt.getText().toString(),
                        pwEdt.getText().toString(),
                        new ServerUtil.JsonResponseHandler() {
                            @Override
                            public void onResponse(JSONObject json) {
                                Log.d("로그인JSON", json.toString());
                                try {
                                    if (json.getBoolean("result")) {
                                        UserData temp = UserData.getUserFromJsonObject(json.getJSONObject("user"));

                                        Toast.makeText(mContext, temp.getProfileURL(), Toast.LENGTH_SHORT).show();

                                        Log.d("사진경로", temp.getProfileURL());

                                        String welcomMessageStr = String.format(Locale.KOREA, "%s님이 로그인 했습니다.", temp.getName());
                                        Toast.makeText(mContext, welcomMessageStr, Toast.LENGTH_SHORT).show();

                                        ContextUtil.login(mContext, temp);

//                                        화면을 MainActivity로 이동, 현재 화면 종료

                                        Intent intent = new Intent(mContext, MainActivity.class);
                                        startActivity(intent);
                                        finish();


                                    }

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

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.nonMemberBtn = (Button) findViewById(R.id.nonMemberBtn);
        this.forgetIdPwTxt = (TextView) findViewById(R.id.forgetIdPwTxt);
        this.signUpTxt = (TextView) findViewById(R.id.signUpTxt);
        this.loginBtn = (Button) findViewById(R.id.loginBtn);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.emailEdt = (EditText) findViewById(R.id.emailEdt);
    }
}
