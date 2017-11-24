package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.widget.ListView;

import com.thejoeunit.www.brandcopy.adapter.AnalysisAdapter;
import com.thejoeunit.www.brandcopy.adapter.ServiceCenterAdapter;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.ArrayList;
import java.util.List;

public class ServiceCenterActivity extends BaseActivity {

    ServiceCenterAdapter mAdapter;
    List<PostingData> writerUserList = new ArrayList<>();

    private android.widget.ListView serviceCenterListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_center);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        mAdapter = new ServiceCenterAdapter(mContext, writerUserList);
        serviceCenterListView.setAdapter(mAdapter);
    }

    @Override
    public void bindViews() {
        this.serviceCenterListView = (ListView) findViewById(R.id.serviceCenterListView);

    }
}
