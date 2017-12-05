package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.thejoeunit.www.brandcopy.adapter.LargePhotoViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ImageViewPagerActivity extends BaseActivity {

    private android.support.v4.view.ViewPager photoViewPager;
    List<Integer> imageList = new ArrayList<>();
//    int[] imageList = new int[] {R.drawable.usergulie_one, R.drawable.usergulie_two, R.drawable.usergulie_three};
    int mPosition = 0;
    LargePhotoViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_pager);
        mPosition = getIntent().getIntExtra("position", 0);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        imageList.clear();
        imageList.add(R.drawable.usergulie_one);
        imageList.add(R.drawable.usergulie_two);
        imageList.add(R.drawable.usergulie_three);
        mAdapter = new LargePhotoViewPagerAdapter(mContext, imageList);
        photoViewPager.setAdapter(mAdapter);
        photoViewPager.setCurrentItem(mPosition, false);
    }

    @Override
    public void bindViews() {
        this.photoViewPager = (ViewPager) findViewById(R.id.photoViewPager);
    }
}
