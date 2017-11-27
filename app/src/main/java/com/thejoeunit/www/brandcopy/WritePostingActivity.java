package com.thejoeunit.www.brandcopy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class WritePostingActivity extends BaseActivity {

    private android.widget.ImageView backIMG;
    private android.widget.TextView titleTxt;
    private android.widget.EditText editText;
    private android.widget.ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_posting);

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

    }

    @Override
    public void bindViews() {
        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.editText = (EditText) findViewById(R.id.editText);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);

    }
}
