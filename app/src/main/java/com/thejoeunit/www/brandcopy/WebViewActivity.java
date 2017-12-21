package com.thejoeunit.www.brandcopy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewActivity extends BaseActivity {

    private WebView mWebView; //웹뷰
    private WebSettings mWebSettings; //웹뷰세팅

    String intentInfo = "";
    String url = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        intentInfo = getIntent().getStringExtra("intent");
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        mWebView.setWebViewClient(new WebViewClient()); // 클릭시 새창 안뜨게
//        mWebView.setInitialScale(100);
        mWebSettings = mWebView.getSettings(); //세부 세팅 등록
        mWebSettings.setJavaScriptEnabled(true);
        mWebView.addJavascriptInterface(new WebAppInterface(this), "Android");
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

        if (intentInfo.equals("1")) {
            url = "http://hyuni106.dothome.co.kr/g5/bbs/board.php?bo_table=analysis";
        } else if (intentInfo.equals("2")) {
            url = "http://hyuni106.dothome.co.kr/g5/bbs/board.php?bo_table=test1";
        } else if (intentInfo.equals("3")) {
            url = "http://hyuni106.dothome.co.kr/g5/bbs/board.php?bo_table=danger";
        } else if (intentInfo.equals("4")) {
            url = "http://hyuni106.dothome.co.kr/g5/bbs/board.php?bo_table=group";
        } else if (intentInfo.equals("5")) {
            url = "http://hyuni106.dothome.co.kr/g5/bbs/board.php?bo_table=injury";
        } else if (intentInfo.equals("6")) {
            url = "http://hyuni106.dothome.co.kr/g5/bbs/board.php?bo_table=service";
        }

        mWebView.loadUrl(url);
    }

    public class WebAppInterface {
        Context mContext;

        /**
         * Instantiate the interface and set the context
         */
        WebAppInterface(Context c) {
            mContext = c;
        }

        /**
         * Show a toast from the web page
         */
        @JavascriptInterface
        public void showToast(String toast) {
//            Log.d("웹", toast);
            Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    @Override
    public void bindViews() {
        this.mWebView = (WebView) findViewById(R.id.webView);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack() ){
            mWebView.goBack();
            return true;
        }

        //백할 페이가 없다면
        if ((keyCode == KeyEvent.KEYCODE_BACK) && (mWebView.canGoBack() == false)){
            finish();
//            Toast.makeText(this, "버튼 클릭 이벤트", Toast.LENGTH_SHORT).show();
//
//            //다이아로그박스 출력
//            new AlertDialog.Builder(this)
//                    .setTitle("프로그램 종료")
//                    .setMessage("프로그램을 종료하시겠습니까?")
//                    .setPositiveButton("예", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            android.os.Process.killProcess(android.os.Process.myPid());
//                        }
//                    })
//                    .setNegativeButton("아니오",  null).show();
        }

        return super.onKeyDown(keyCode, event);
    }

}
