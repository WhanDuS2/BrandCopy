package com.thejoeunit.www.brandcopy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.thejoeunit.www.brandcopy.util.ContextUtil;
import com.thejoeunit.www.brandcopy.util.ServerUtil;

import org.json.JSONObject;

public class WritePostingActivity extends BaseActivity {

    private android.widget.ImageView backIMG;
    private android.widget.TextView titleTxt;
    private android.widget.EditText editText;
    private android.widget.Button upLoadFileBtn;
    private android.widget.Button enterBtn;
    private android.widget.Button cancelBtn;
    private android.widget.Spinner postClassificationSpinner;
    private EditText contentEdt;
    private EditText titleEdt;
    private android.widget.CheckBox isNoticeCheckBox;
    private ImageView noticeIMG;
    private ImageView fmIMG;

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

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        backIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        enterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String notice = "";

                if (isNoticeCheckBox.isChecked()) {
                    notice = "1";
                } else {
                    notice = "0";
                }

                ServerUtil.get_new_admin_post(mContext, ContextUtil.getLoginUser(mContext).getUserId(), postClassificationSpinner.getSelectedItemPosition(), 150, contentEdt.getText().toString(), "", titleEdt.getText().toString(), notice,
                        new ServerUtil.JsonResponseHandler() {
                            @Override
                            public void onResponse(JSONObject json) {
                                Toast.makeText(mContext, "게시글이 등록되었습니다.", Toast.LENGTH_SHORT).show();
                            }
                        });

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
        this.isNoticeCheckBox = (CheckBox) findViewById(R.id.isNoticeCheckBox);
        this.fmIMG = (ImageView) findViewById(R.id.fmIMG);
        this.noticeIMG = (ImageView) findViewById(R.id.noticeIMG);
        this.contentEdt = (EditText) findViewById(R.id.contentEdt);
        this.titleEdt = (EditText) findViewById(R.id.titleEdt);
        this.postClassificationSpinner = (Spinner) findViewById(R.id.postClassificationSpinner);
        this.titleTxt = (TextView) findViewById(R.id.titleTxt);
        this.backIMG = (ImageView) findViewById(R.id.backIMG);

    }
}
