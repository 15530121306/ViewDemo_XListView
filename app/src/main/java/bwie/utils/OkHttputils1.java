package bwie.utils;

import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by Shixj on 2016/11/7.
 */
public class OkHttputils1 {

    private static OkHttpClient mClient;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private OkHttputils1(){}


    public static OkHttpClient getOkHttpClient(){
        if(mClient==null) {
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            mClient = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .build();
        }
        return mClient;
    }
    public static void get(String url, Callback callback){

        Request request =new Request.Builder()
                .url(url)
                .build();
        getOkHttpClient().newCall(request).enqueue(callback);

    }
}
