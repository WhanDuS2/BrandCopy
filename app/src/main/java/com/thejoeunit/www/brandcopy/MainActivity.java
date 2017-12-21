package com.thejoeunit.www.brandcopy;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.thejoeunit.www.brandcopy.util.ServerUtil;

import org.json.JSONObject;

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

//    TODO 리스트뷰 데이터삽입 , 푸쉬 설정 ,

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

        serviceCenterIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, WritePostingActivity.class);
                startActivity(intent);
            }
        });

        offIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder offNotice = new AlertDialog.Builder(MainActivity.this);
                offNotice.setTitle(" 종료 ");
                offNotice.setMessage(" 앱을 종료하시겠습니까? ");
                offNotice.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                offNotice.setNegativeButton("취소", null);

                offNotice.show();

            }
        });

        setIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, PushSettingActivity.class);
                startActivity(intent);
            }
        });


        loginIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
            }
        });

        serviceCenterIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(mContext, ServiceCenterActivity.class);
                Intent intent = new Intent(mContext, WebViewActivity.class);
                intent.putExtra("intent", "6");
                startActivity(intent);
            }
        });

        gulieIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, GuideActivity.class);
                startActivity(intent);
            }
        });


        injuryIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(mContext, InjuryInformationActivity.class);
                Intent intent = new Intent(mContext, WebViewActivity.class);
                intent.putExtra("intent", "5");
                startActivity(intent);
            }
        });


        groupKakaoIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, GroupKakaoActivity.class);
//                Intent intent = new Intent(mContext, WebViewActivity.class);
//                intent.putExtra("intent", "4");
                startActivity(intent);
            }
        });


        dangerIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(mContext, DangerActivity.class);
                Intent intent = new Intent(mContext, WebViewActivity.class);
                intent.putExtra("intent", "3");
                startActivity(intent);
            }
        });


        analysisIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(mContext, AnalysisActivity.class);
                Intent intent = new Intent(mContext, WebViewActivity.class);
                intent.putExtra("intent", "1");
                startActivity(intent);
            }
        });


        noticeIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(mContext, NoticeActivity.class);
                Intent intent = new Intent(mContext, WebViewActivity.class);
                intent.putExtra("intent", "2");
                startActivity(intent);
            }
        });

        loginIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(mContext, LoginActivity.class);
                Intent intent = new Intent(mContext, LoginWebViewActivity.class);
                startActivity(intent);
            }
        });

        totalScoreIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.flashscore.com/"));
                startActivity(intent);
            }
        });


    }

    @Override
    public void setValues() {

        Glide.with(mContext).load(R.drawable.analysis_icon).into(analysisIMG);
        Glide.with(mContext).load(R.drawable.notice_iconn).into(noticeIMG);
        Glide.with(mContext).load(R.drawable.score_icon).into(totalScoreIMG);
        Glide.with(mContext).load(R.drawable.danger_iconn).into(dangerIMG);
        Glide.with(mContext).load(R.drawable.family_icon).into(groupKakaoIMG);
        Glide.with(mContext).load(R.drawable.injury_iconn).into(injuryIMG);
        Glide.with(mContext).load(R.drawable.guliedance_cion).into(gulieIMG);
        Glide.with(mContext).load(R.drawable.question_icon).into(kakaoQuestionIMG);
        Glide.with(mContext).load(R.drawable.service_icon).into(serviceCenterIMG);

    }

    @Override
    public void bindViews() {
        this.offIMG = (ImageView) findViewById(R.id.offIMG);
        this.setIMG = (ImageView) findViewById(R.id.setIMG);
        this.loginIMG = (ImageView) findViewById(R.id.loginIMG);
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
