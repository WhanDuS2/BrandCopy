package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.ListView;

import com.thejoeunit.www.brandcopy.adapter.AnalysisAdapter;
import com.thejoeunit.www.brandcopy.adapter.DangerAdapter;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.ArrayList;
import java.util.List;

public class DangerActivity extends BaseActivity {

    private android.widget.ListView dangerListView;

    DangerAdapter mAdapter;
    List<PostingData> writerUserList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danger);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        mAdapter = new DangerAdapter(mContext, writerUserList);
        dangerListView.setAdapter(mAdapter);

    }

    @Override
    public void bindViews() {

        this.dangerListView = (ListView) findViewById(R.id.dangerListView);
    }
}
