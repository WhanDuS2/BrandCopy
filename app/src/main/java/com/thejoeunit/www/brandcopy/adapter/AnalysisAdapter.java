package com.thejoeunit.www.brandcopy.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.thejoeunit.www.brandcopy.R;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.List;

/**
 * Created by the on 2017-11-21.
 */

public class AnalysisAdapter extends ArrayAdapter<PostingData> {

    Context mContext;
    List<PostingData> mList;
    LayoutInflater inf;

    public AnalysisAdapter(Context context, List<PostingData> list) {
        super(context, R.layout.analysis_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            row = inf.inflate(R.layout.analysis_list_item, null);
        }

//        Photo data = mList.get(position);
//
//        ImageView nailDesignImg = (ImageView) row.findViewById(R.id.nailDesignImg);
//
//        Glide.with(mContext).load(data.getNailPhotoViews()).into(nailDesignImg);
//        Glide.with(mContext).load("https://scontent-atl3-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/c86.0.908.908/18298925_1441385802619927_700897482560765952_n.jpg").into(nailDesignImg);
//        Glide.with(mContext).load("https://scontent.cdninstagram.com/t51.2885-15/s480x480/e35/c135.0.809.809/18809413_230194397478330_3938254353508335616_n.jpg?ig_cache_key=MTUyNTE0NjI1Mjc5MDQwNjk1Mg%3D%3D.2.c").into(nailDesignImg);
///       Glide.with(mContext).load("https://scontent-atl3-1.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/19367550_140730239832370_3000554952889204736_n.jpg").into(nailDesignImg);


        return row;
    }

    @Override
    public int getCount() {
        return 20;
    }
}