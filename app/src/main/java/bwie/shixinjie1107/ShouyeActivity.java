package bwie.shixinjie1107;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

import bwie.Adapter.adapter;
import bwie.bean.Bean;
import bwie.mlibrary.activity_fengzhuang.BaseActivity;
import bwie.utils.XListView;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ShouyeActivity extends BaseActivity {

    private XListView xlv;
    private ArrayList<Bean.ResultBean.DataBean> list;
    private ArrayList<Bean.ResultBean.DataBean> listall;
//    List<Bean.ResultBean.DataBean> list=new ArrayList<>();
//    List<Bean.ResultBean.DataBean> listall=new ArrayList<>();


    @Override
    public int bindLayout() {
        return R.layout.activity_shouye;
    }

    @Override
    public void initData() {
        list=new ArrayList<>();
        listall=new ArrayList<>();
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        //获得控件  上啦加载下拉刷新许可
        xlv=(XListView)findViewById(R.id.xlv);
        xlv.setPullRefreshEnable(true);
        xlv.setPullLoadEnable(true);

        //下拉刷新和上啦加载的监听
        xlv.setXListViewListener(new XListView.IXListViewListener() {
            @Override
            public void onRefresh() {
                String path="http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page="+index+"&pagesize=10&sort=asc&time=1418745237";
                index++;
                getdata(path,1);
                Toast.makeText(ShouyeActivity.this,"刷新成功",Toast.LENGTH_SHORT).show();
                stopxlv();
            }

            @Override
            public void onLoadMore() {
                String path="http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page="+index+"&pagesize=10&sort=asc&time=1418745237";
                getdata(path,2);
                Toast.makeText(ShouyeActivity.this,"加载成功",Toast.LENGTH_SHORT).show();
                stopxlv();
            }
        });
    }

    @Override
    public void loadData() {
        //第一次加载
        getdata("http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page="+index+"&pagesize=10&sort=asc&time=1418745237",0);

    }
    //请求获取网络数据
    public void getdata(final String path, final int tag){
//        new Thread(){
//            @Override
//            public void run() {
               getasyn(path, new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {

                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        //获取json串和tag值 并传给handler
                        String json=response.body().string();
                        Message me=new Message();
                        me.obj=json;
                        me.what=tag;
                        handler.sendMessage(me);
                    }
                });

//            }
//        }.start();

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView();
//
//        //获得控件
//        initview();
//
//
    }

    adapter ad;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            //得到json串并解析
            String json= (String) msg.obj;
            Gson gson=new Gson();
            Bean be=gson.fromJson(json,Bean.class);
            list= (ArrayList<Bean.ResultBean.DataBean>) be.result.data;
            switch (msg.what){
                //第一次加载
                case 0:
                    listall.addAll(list);
                    ad=new adapter(listall,ShouyeActivity.this);
                    xlv.setAdapter(ad);
                    break;
                //下拉刷新时
                case 1:
                    listall.clear();
                    listall.addAll(list);
                    ad.notifyDataSetChanged();
                    break;
                //上啦加载更多时
                case 2:
                    listall.addAll(list);
                    ad.notifyDataSetChanged();
                    break;
            }
            super.handleMessage(msg);
        }
    };

    int index=1;
    private void initview() {
//        //获得控件  上啦加载下拉刷新许可
//        xlv=(XListView)findViewById(R.id.xlv);
//        xlv.setPullRefreshEnable(true);
//        xlv.setPullLoadEnable(true);
//
//        //第一次加载
//        getdata("http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page="+index+"&pagesize=10&sort=asc&time=1418745237",0);
//        //下拉刷新和上啦加载的监听
//        xlv.setXListViewListener(new XListView.IXListViewListener() {
//            @Override
//            public void onRefresh() {
//                String path="http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page="+index+"&pagesize=10&sort=asc&time=1418745237";
//                index++;
//                getdata(path,1);
//                Toast.makeText(ShouyeActivity.this,"刷新成功",Toast.LENGTH_SHORT).show();
//                stopxlv();
//            }
//
//            @Override
//            public void onLoadMore() {
//                String path="http://japi.juhe.cn/joke/content/list.from?key= 874ed931559ba07aade103eee279bb37 &page="+index+"&pagesize=10&sort=asc&time=1418745237";
//                getdata(path,2);
//                Toast.makeText(ShouyeActivity.this,"加载成功",Toast.LENGTH_SHORT).show();
//                stopxlv();
//            }
//        });
    }
    //停止刷新和加载
    public void stopxlv(){
        xlv.stopRefresh();
        xlv.stopLoadMore();
    }


}
