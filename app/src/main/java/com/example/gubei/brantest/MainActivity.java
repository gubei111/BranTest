package com.example.gubei.brantest;

import android.os.Bundle;
import android.view.View;

import com.example.gubei.brantest.longConnect.LongConnectActivity;
import com.example.gubei.brantest.util.BaseConstants;
import com.example.gubei.brantest.util.JumpUtils;
import com.example.gubei.brantest.util.LogUtils;

public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.debugLog(BaseConstants.TAG_ACTIVITY_MAIN,"this is mainActivity");
        initView();
    }

    private void initView(){
        findViewById(R.id.main_activity_long_connect_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JumpUtils.getJumpInstance().jumpToActivity(MainActivity.this,LongConnectActivity.class);
            }
        });
    }
}
