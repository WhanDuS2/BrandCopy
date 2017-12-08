package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.thejoeunit.www.brandcopy.util.ContextUtil;
import com.thejoeunit.www.brandcopy.util.ServerUtil;

import org.json.JSONObject;

public class UserWritePostingActivity extends BaseActivity {

    private android.widget.ImageView backIMG;
    private android.widget.TextView titleTxt;
    private android.widget.EditText editText;
    private android.widget.Button enterBtn;
    private android.widget.Button cancelBtn;
    private EditText pwEdt;
    private EditText contentEdt;
    private EditText nickNameEdt;
    private EditText titleEdt;
    private EditText userPwEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_write_posting);

        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ServerUtil.get_new_user_post(mContext, ContextUtil.getLoginUser(mContext).getUserId(), 150, contentEdt.getText().toString(), titleEdt.getText().toString(), nickNameEdt.getText().toString(), userPwEdt.getText().toString(),
                        new ServerUtil.JsonResponseHandler() {
                            @Override
                            public void onResponse(JSONObject json) {
                                Toast.makeText(mContext, "게시글이 등록되었습니다.", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        });
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
        this.cancelBtn = (Button) findViewById(R.id.cancelBtn);
        this.enterBtn = (Button) findViewById(R.id.enterBtn);
        this.userPwEdt = (EditText) findViewById(R.id.userPwEdt);
        this.nickNameEdt = (EditText) findViewById(R.id.nickNameEdt);
        this.contentEdt = (EditText) findViewById(R.id.contentEdt);
        this.titleEdt = (EditText) findViewById(R.id.titleEdt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);
    }
}
