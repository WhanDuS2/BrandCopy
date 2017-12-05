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
                finish();
            }
        });

        View.OnClickListener viewPagerIntent = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ImageViewPagerActivity.class);
                if (v.getId() == R.id.userGuliePhotoOne) {
                    intent.putExtra("position", 0);
                } else if (v.getId() == R.id.userGuliePhotoTwo) {
                    intent.putExtra("position", 1);
                } else if (v.getId() == R.id.userGuliePhotoThree) {
                    intent.putExtra("position", 2);
                }
                startActivity(intent);
            }
        };


        userGuliePhotoOne.setOnClickListener(viewPagerIntent);

        userGuliePhotoTwo.setOnClickListener(viewPagerIntent);

        userGuliePhotoThree.setOnClickListener(viewPagerIntent);


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
