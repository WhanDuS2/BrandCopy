package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.thejoeunit.www.brandcopy.adapter.AnalysisAdapter;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.ArrayList;
import java.util.List;

public class AnalysisActivity extends BaseActivity {

    AnalysisAdapter mAdapter;
    List<PostingData> writerUserList = new ArrayList<>();
    private android.widget.ListView analysisLisTView;
    private android.widget.Button goWrtieBtn;
    private Button wrtieBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);



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
        analysisLisTView.setAdapter(mAdapter);

    }

    @Override
    public void bindViews() {
        this.analysisLisTView = (ListView) findViewById(R.id.analysisLisTView);
        this.goWrtieBtn = (Button) findViewById(R.id.goWrtieBtn);


    }
}
