package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class WritePostingActivity extends BaseActivity {

    private android.widget.ImageView backIMG;
    private android.widget.TextView titleTxt;
    private android.widget.EditText editText;
    private android.widget.ImageView imageView;
    private android.widget.Button upLoadFileBtn;
    private android.widget.Button enterBtn;
    private android.widget.Button cancelBtn;

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

        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.cancelBtn = (Button) findViewById(R.id.cancelBtn);
        this.enterBtn = (Button) findViewById(R.id.enterBtn);
        this.upLoadFileBtn = (Button) findViewById(R.id.upLoadFileBtn);
        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.editText = (EditText) findViewById(R.id.editText);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);

    }
}
