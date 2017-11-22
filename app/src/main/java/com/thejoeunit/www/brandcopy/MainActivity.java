package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private android.widget.ImageView analysisIMG;
    private android.widget.ImageView noticeIMG;
    private android.widget.ImageView totalScoreIMG;
    private android.widget.ImageView dangerIMG;
    private android.widget.ImageView groupKakaoIMG;
    private android.widget.ImageView InjuryIMG;
    private android.widget.ImageView gulieIMG;
    private android.widget.ImageView kakaoQuestionIMG;
    private android.widget.ImageView serviceCenterIMG;
    private android.widget.ImageView backIMG;
    private android.widget.ImageView homeIMG;
    private android.widget.ImageView refreshIMG;
    private android.widget.ImageView loginIMG;
    private android.widget.ImageView setIMG;
    private android.widget.ImageView offIMG;
    private android.widget.TextView textView2;
    private ImageView injuryIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        loginIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });

        totalScoreIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.setData(Uri.parse("https://www.flashscore.co.kr/"));
                startActivity(intent);
            }
        });


    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.offIMG = (ImageView) findViewById(R.id.offIMG);
        this.setIMG = (ImageView) findViewById(R.id.setIMG);
        this.loginIMG = (ImageView) findViewById(R.id.loginIMG);
        this.refreshIMG = (ImageView) findViewById(R.id.refreshIMG);
        this.homeIMG = (ImageView) findViewById(R.id.homeIMG);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);
        this.serviceCenterIMG = (ImageView) findViewById(R.id.serviceCenterIMG);
        this.kakaoQuestionIMG = (ImageView) findViewById(R.id.kakaoQuestionIMG);
        this.gulieIMG = (ImageView) findViewById(R.id.gulieIMG);
        this.injuryIMG = (ImageView) findViewById(R.id.injuryIMG);
        this.groupKakaoIMG = (ImageView) findViewById(R.id.groupKakaoIMG);
        this.dangerIMG = (ImageView) findViewById(R.id.dangerIMG);
        this.textView2 = (TextView) findViewById(R.id.textView2);
        this.totalScoreIMG = (ImageView) findViewById(R.id.totalScoreIMG);
        this.noticeIMG = (ImageView) findViewById(R.id.noticeIMG);
        this.analysisIMG = (ImageView) findViewById(R.id.analysisIMG);

    }
}