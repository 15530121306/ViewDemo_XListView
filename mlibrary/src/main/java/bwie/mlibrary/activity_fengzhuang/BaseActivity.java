package bwie.mlibrary.activity_fengzhuang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import bwie.mlibrary.myutils.OkHttpUtils;
import okhttp3.Callback;

/**
 * Created by Shixj on 2016/11/8.
 */
public abstract class BaseActivity extends AppCompatActivity implements IOnCreate {

    private View mRootview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(bindLayout()!=0){
            mRootview= View.inflate(this,bindLayout(),null);
            setContentView(bindLayout());
            initData();
            initView(savedInstanceState);
            loadData();
        }else{
            Log.e("Activity","bindLayout return 0!");
        }
    }

    //mRootview的get方法
    public View getmRootview() {
        return mRootview;
    }
    //请求网络数据回调
    public void getasyn(String path,Callback callback){
        OkHttpUtils.get(path, callback);
    }
}
