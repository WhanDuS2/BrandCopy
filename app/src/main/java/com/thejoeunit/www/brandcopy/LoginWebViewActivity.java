package com.thejoeunit.www.brandcopy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoginWebViewActivity extends BaseActivity {
    private WebView mWebView; //웹뷰
    private WebSettings mWebSettings; //웹뷰세팅

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_web_view);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        mWebView.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
//        mWebView.setInitialScale(100);
        mWebSettings = mWebView.getSettings(); //세부 세팅 등록
        mWebSettings.setJavaScriptEnabled(true);
//        mWebView.addJavascriptInterface(new WebViewActivity.WebAppInterface(this), "Android");
//        mWebSettings.setSupportZoom(true);
//        mWebSettings.setBuiltInZoomControls(true);
//        mWebSettings.setDisplayZoomControls(false);
        mWebSettings.setPluginState(WebSettings.PluginState.ON_DEMAND); // 플러그인을 사용할 수 있도록 설정
        mWebSettings.setLoadsImagesAutomatically(true); // 웹뷰가 앱에 등록되어 있는 이미지 리소스를 자동으로 로드하도록 설정
        mWebView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
//                Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
                return super.onJsAlert(view, url, message, result);
            }
        });

        mWebView.loadUrl("http://hyuni106.dothome.co.kr/g5/bbs/login.php");

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.mWebView = (WebView) findViewById(R.id.webView);
    }
}
