package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

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
    private ListView analysisListView;
    private android.widget.Spinner spinner;
    private android.widget.EditText editText3;

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
        this.editText3 = (EditText) findViewById(R.id.editText3);
        this.spinner = (Spinner) findViewById(R.id.spinner);
        this.analysisListView = (ListView) findViewById(R.id.analysisListView);


    }
}
