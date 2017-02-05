package xyz.xyz0z0.coolweather.util;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/1/11 0011.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
//        OkHttpClient client = new OkHttpClient();
        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5,TimeUnit.SECONDS).writeTimeout(5,TimeUnit.SECONDS).build();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);


    }
}
