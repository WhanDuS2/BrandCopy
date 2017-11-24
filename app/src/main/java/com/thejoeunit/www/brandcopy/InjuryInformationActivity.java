package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.ListView;

import com.thejoeunit.www.brandcopy.adapter.AnalysisAdapter;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.ArrayList;
import java.util.List;

public class InjuryInformationActivity extends BaseActivity {

    private android.widget.ListView injuryListView;

    AnalysisAdapter mAdapter;
    List<PostingData> writerUserList = new ArrayList<>();
    private android.widget.ListView analysisLisTView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injury_information);
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        mAdapter = new AnalysisAdapter(mContext, writerUserList);
        analysisLisTView.setAdapter(mAdapter);
    }

    @Override
    public void bindViews() {
        this.injuryListView = (ListView) findViewById(R.id.injuryListView);

    }
}
