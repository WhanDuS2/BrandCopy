package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.thejoeunit.www.brandcopy.adapter.DangerAdapter;
import com.thejoeunit.www.brandcopy.data.PostingData;

import java.util.ArrayList;
import java.util.List;

public class DangerActivity extends BaseActivity {


    DangerAdapter mAdapter;
    List<PostingData> writerUserList = new ArrayList<>();
    private android.widget.Button writeBtn;
    private ListView dangerListView;
    private android.widget.Spinner spinner;
    private android.widget.EditText contentEdt;
    private android.widget.TextView searchTxt;
    private android.widget.ImageView backIMG;

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

        backIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    @Override
    public void setValues() {

        mAdapter = new DangerAdapter(mContext, writerUserList);
        dangerListView.setAdapter(mAdapter);

    }

    @Override
    public void bindViews() {
        this.searchTxt = (TextView) findViewById(R.id.searchTxt);
        this.contentEdt = (EditText) findViewById(R.id.contentEdt);
        this.spinner = (Spinner) findViewById(R.id.spinner);
        this.dangerListView = (ListView) findViewById(R.id.dangerListView);
        this.writeBtn = (Button) findViewById(R.id.writeBtn);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);


    }
}
