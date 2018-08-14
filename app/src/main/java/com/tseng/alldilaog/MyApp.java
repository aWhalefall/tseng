package com.tseng.alldilaog;

import android.app.Application;
import android.content.Context;

import com.tseng.alldilaog.dialog.DialogObservable;
import com.tseng.alldilaog.dialog.GlobalService;

/**
 * Author: yangweichao
 * Date:   2018/8/14 下午3:41
 * Description:
 */


public class MyApp extends Application {

    private static Context mContext;
    private static DialogObservable dialogObservable;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = getApplicationContext();
        dialogObservable = new DialogObservable();
        dialogObservable.addObserver(new GlobalService());

    }

    public static Context  getmContext() {
        return mContext;
    }

    public static void showDialog(String msg) {
        dialogObservable.showDialog(msg);

    }
}
