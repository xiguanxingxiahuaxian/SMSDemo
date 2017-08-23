package com.example.maw.sms;

import android.app.Application;

import com.mob.MobSDK;

/**
 * Created by Administrator on 2017/8/22.
 */

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this,"205dbb426717b","b25dd354a597cdbc61c9c38102e2aab3");
    }
}
