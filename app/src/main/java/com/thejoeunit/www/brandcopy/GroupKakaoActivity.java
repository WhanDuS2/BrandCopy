package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.ImageView;

import com.emrekose.pinchzoom.Touch;

public class GroupKakaoActivity extends BaseActivity {

    private android.widget.ImageView imageView2;
    private android.widget.ImageView imageView;
    private android.widget.ImageView imageView3;

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
        imageView.setOnTouchListener(new Touch());

    }

    @Override
    public void bindViews() {

        this.imageView3 = (ImageView) findViewById(R.id.imageView3);
        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.imageView2 = (ImageView) findViewById(R.id.imageView2);
    }
}
