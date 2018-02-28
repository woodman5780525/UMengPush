package com.woodman.pushdemo;

import android.app.Application;
import android.util.Log;

import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * Created by $woodman on 2018/2/28.
 * 功能:
 * 修改时间：
 * 修改备注：
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PushAgent mPushAgent = PushAgent.getInstance(this);
        //注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回device token
                Log.d("xxx","注册成功" + deviceToken);
            }

            @Override
            public void onFailure(String s, String s1) {
                Log.d("xxx","注册失败" + s + "\n" + s1);
            }
        });
        //AmF7lw3RtU_idDxZy0a5xr3NKs7zHGEzgU3XOewJlej1
    }
}
