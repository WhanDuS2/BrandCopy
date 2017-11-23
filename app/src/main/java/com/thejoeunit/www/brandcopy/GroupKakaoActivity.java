package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.emrekose.pinchzoom.Touch;

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

        this.layout = (LinearLayout) findViewById(R.id.layout);
        this.imageView3 = (ImageView) findViewById(R.id.imageView3);
        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.imageView2 = (ImageView) findViewById(R.id.imageView2);
    }
}
