package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.ListView;

import com.thejoeunit.www.brandcopy.adapter.AnalysisAdapter;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.ArrayList;
import java.util.List;

public class NoticeActivity extends BaseActivity {

    AnalysisAdapter mAdapter;
    List<PostingData> writerUserList = new ArrayList<>();

    private android.widget.ListView noticeListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        mAdapter = new AnalysisAdapter(mContext, writerUserList);
        noticeListView.setAdapter(mAdapter);

    }

    @Override
    public void bindViews() {
        this.noticeListView = (ListView) findViewById(R.id.noticeListView);

    }
}
