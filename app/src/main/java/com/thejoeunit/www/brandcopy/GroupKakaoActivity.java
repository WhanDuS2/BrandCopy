package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class GroupKakaoActivity extends BaseActivity {

    private android.widget.ImageView imageView2;
    private android.widget.ImageView imageView;
    private android.widget.ImageView imageView3;
    private android.widget.LinearLayout layout;
    private ImageView backIMG;
    private com.github.chrisbanes.photoview.PhotoView kakaofamilyIMG;

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

        backIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void setValues() {
    }

    @Override
    public void bindViews() {
        this.kakaofamilyIMG = (PhotoView) findViewById(R.id.kakaofamilyIMG);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);

    }
}
