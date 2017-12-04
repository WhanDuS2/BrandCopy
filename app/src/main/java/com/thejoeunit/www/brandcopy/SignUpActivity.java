package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends BaseActivity {

    private android.widget.ImageView backIMG;
    private android.widget.EditText pwEdt;
    private android.widget.EditText confirmEdt;
    private android.widget.TextView textView3;
    private android.widget.Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(mContext, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);
                finish();


            }
        });

        backIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.signUpBtn = (Button) findViewById(R.id.signUpBtn);
        this.textView3 = (TextView) findViewById(R.id.textView3);
        this.confirmEdt = (EditText) findViewById(R.id.confirmEdt);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);

    }
}
