package com.thejoeunit.www.brandcopy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.thejoeunit.www.brandcopy.R;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.List;

/**
 * Created by the on 2017-11-21.
 */

public class DangerAdapter extends ArrayAdapter<PostingData> {

    Context mContext;
    List<PostingData> mList;
    LayoutInflater inf;

    public DangerAdapter(Context context, List<PostingData> list) {
        super(context, R.layout.danger_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.danger_list_item, null);
        }

        PostingData data = mList.get(position);

        ImageView mainIMG = (ImageView) row.findViewById(R.id.mainIMG);
        ImageView noticeImageVIew = (ImageView) row.findViewById(R.id.noticeImageVIew);
        ImageView newImageView = (ImageView) row.findViewById(R.id.newImageView);



        if (data.isNotice()) {
            noticeImageVIew.setVisibility(View.VISIBLE);
        } else {
            noticeImageVIew.setVisibility(View.GONE);
        }
        Glide.with(mContext).load(R.drawable.fm_logo_post).into(mainIMG);



        return row;
    }

}
