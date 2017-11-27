package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends BaseActivity {

    private android.widget.EditText pwEdt;
    private android.widget.Button loginBtn;
    private android.widget.TextView signUpTxt;
    private android.widget.TextView forgetIdPwTxt;
    private android.widget.Button nonMemberBtn;

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

    }
}
