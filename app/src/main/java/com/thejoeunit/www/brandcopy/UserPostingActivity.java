package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class UserPostingActivity extends BaseActivity {

    private android.widget.ImageView backIMG;
    private android.widget.TextView titleTxt;
    private android.widget.EditText titleEdt;
    private android.widget.EditText contentEdt;
    private android.widget.Button enterBtn;
    private android.widget.Button cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_posting);

        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.cancelBtn = (Button) findViewById(R.id.cancelBtn);
        this.enterBtn = (Button) findViewById(R.id.enterBtn);
        this.contentEdt = (EditText) findViewById(R.id.contentEdt);
        this.titleEdt = (EditText) findViewById(R.id.titleEdt);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);

    }
}
