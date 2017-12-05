package com.thejoeunit.www.brandcopy.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.github.chrisbanes.photoview.PhotoView;
import com.thejoeunit.www.brandcopy.R;

import java.util.List;

/**
 * Created by JongHwan Choi on 2017-12-05.
 */

public class LargePhotoViewPagerAdapter  extends PagerAdapter {
    Context mContext;
    List<Integer> mList;
    LayoutInflater inf;

    public LargePhotoViewPagerAdapter(Context context, List<Integer> list) {
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (LinearLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View row = inf.inflate(R.layout.activity_user_gulie_one, container, false);

        // 화면에 사진 띄우는 코드
//        String url = mList.get(position);
        PhotoView userGuliePhotoOne = (PhotoView) row.findViewById(R.id.userGuliePhotoOne);
        userGuliePhotoOne.setImageResource(mList.get(position));

        // 만들어낸 row를 container에 붙여줌
        container.addView(row);

        return row;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View)object);
    }
}