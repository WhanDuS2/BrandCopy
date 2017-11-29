package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UserWritePostingActivity extends BaseActivity {

    private android.widget.ImageView backIMG;
    private android.widget.TextView titleTxt;
    private android.widget.EditText editText;
    private android.widget.Button enterBtn;
    private android.widget.Button cancelBtn;

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
                Toast.makeText(mContext, "등록되었습니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(mContext, ServiceCenterActivity.class);
                startActivity(intent);
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
        this.editText = (EditText) findViewById(R.id.editText);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);
    }
}
