package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GroupKakaoActivity extends BaseActivity {

    private android.widget.ImageView imageView2;
    private android.widget.ImageView imageView;
    private android.widget.ImageView imageView3;
    private android.widget.LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_kakao);

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


    }
}
