package xyz.xyz0z0.coolweather;

import android.app.Application;
import android.content.Context;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.crashreport.CrashReport;

import org.litepal.LitePalApplication;

/**
 * Created by Administrator on 2017/2/10 0010.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
        //初始化 bugly
//        CrashReport.initCrashReport(context, "5013817760", true);
        Bugly.init(context, "5013817760", true);
    }

    public static Context getContext(){
        return context;
    }
}
