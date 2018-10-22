package com.example.gubei.brantest;

import android.app.Activity;
import android.os.Bundle;

import com.example.gubei.brantest.util.BaseConstants;
import com.example.gubei.brantest.util.LogUtils;

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.debugLog(BaseConstants.TAG_ACTIVITY_BASE,"this is baseActivity");
    }
}
