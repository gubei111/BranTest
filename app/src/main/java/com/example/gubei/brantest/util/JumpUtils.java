package com.example.gubei.brantest.util;

import android.app.Activity;
import android.content.Intent;

/**
 * 跳转工具类
 */
public class JumpUtils {

     private static JumpUtils mJumpInstance = null;

     private JumpUtils(){ }

     public synchronized static JumpUtils getJumpInstance(){
          if (null == mJumpInstance){
               mJumpInstance = new JumpUtils();
          }

          return mJumpInstance;
     }

     public void jumpToActivity(Activity activity,Class<? extends Activity> cls){
          Intent intent = new Intent(activity,cls);
          activity.startActivity(intent);
     }

}
