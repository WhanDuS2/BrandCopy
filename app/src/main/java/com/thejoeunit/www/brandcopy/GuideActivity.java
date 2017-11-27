package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.thejoeunit.www.brandcopy.usergulie_activity.UserGulieActivityOne;
import com.thejoeunit.www.brandcopy.usergulie_activity.UserGulieActivityThree;
import com.thejoeunit.www.brandcopy.usergulie_activity.UserGulieActivityTwo;

public class GuideActivity extends BaseActivity {

    private android.widget.ImageView userGuliePhotoOne;
    private android.widget.ImageView userGuliePhotoTwo;
    private android.widget.ImageView userGuliePhotoThree;
    private ImageView backIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

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


        userGuliePhotoOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, UserGulieActivityOne.class);
                startActivity(intent);
            }
        });

        userGuliePhotoTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, UserGulieActivityTwo.class);
                startActivity(intent);
            }
        });

        userGuliePhotoThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, UserGulieActivityThree.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void setValues() {

        Glide.with(mContext).load(R.drawable.usergulie_one).into(userGuliePhotoOne);
        Glide.with(mContext).load(R.drawable.usergulie_two).into(userGuliePhotoTwo);
        Glide.with(mContext).load(R.drawable.usergulie_three).into(userGuliePhotoThree);

    }

    @Override
    public void bindViews() {
        this.userGuliePhotoThree = (ImageView) findViewById(R.id.userGuliePhotoThree);
        this.userGuliePhotoTwo = (ImageView) findViewById(R.id.userGuliePhotoTwo);
        this.userGuliePhotoOne = (ImageView) findViewById(R.id.userGuliePhotoOne);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);
    }
}
