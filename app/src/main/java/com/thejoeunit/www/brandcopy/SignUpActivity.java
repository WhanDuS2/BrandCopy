package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends BaseActivity {


    private boolean isIdOk = false;
    private boolean isPwOk = false;
    private boolean isNickNameOk = false;
    private TextView checkEmailTxt;
    private ImageView backIMG;
    private EditText emailAddressEdt;
    private EditText pwEdt;
    private EditText confirmEdt;
    private TextView checkPwTxt;
    private EditText nickNameEdt;
    private Spinner pwHintSpinner;
    private Button signUpBtn;

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


//                if (!isIdOk) {
//                    Toast.makeText(mContext, "아이디를 확인해주세요.", Toast.LENGTH_SHORT).show();
//                    return;
//                }

                if (!isPwOk) {
                    Toast.makeText(mContext, "비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

//                if (!isNickNameOk) {
//                    Toast.makeText(mContext, "닉네임을 확인해주세요.", Toast.LENGTH_SHORT).show();
//                    return;
//                }

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

        confirmEdt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkPwTxt.setVisibility(View.VISIBLE);
                if (pwEdt.getText().toString().equals(s.toString())) {
                    checkPwTxt.setText("비밀번호가 일치합니다.");
                    isPwOk = true;
                } else {
                    checkPwTxt.setText("비밀번호가 일치하지않습니다.");
                    isPwOk = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        pwEdt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                checkPwTxt.setVisibility(View.VISIBLE);
                if (confirmEdt.getText().toString().equals(s.toString())) {
                    checkPwTxt.setText("비밀번호가 일치합니다.");
                    isPwOk = true;
                } else {
                    checkPwTxt.setText("비밀번호가 일치하지않습니다.");
                    isPwOk = false;
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.signUpBtn = (Button) findViewById(R.id.signUpBtn);
        this.pwHintSpinner = (Spinner) findViewById(R.id.pwHintSpinner);
        this.nickNameEdt = (EditText) findViewById(R.id.nickNameEdt);
        this.checkPwTxt = (TextView) findViewById(R.id.checkPwTxt);
        this.confirmEdt = (EditText) findViewById(R.id.confirmEdt);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.checkEmailTxt = (TextView) findViewById(R.id.checkEmailTxt);
        this.emailAddressEdt = (EditText) findViewById(R.id.emailAddressEdt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);

    }
}
