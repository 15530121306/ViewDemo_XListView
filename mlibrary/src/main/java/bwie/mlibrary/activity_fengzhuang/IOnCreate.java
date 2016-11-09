package bwie.mlibrary.activity_fengzhuang;

import android.os.Bundle;

/**
 * Created by Shixj on 2016/11/8.
 */
public interface IOnCreate {

    /**
     * 返回布局文件
     * @return
     */

    int bindLayout();
    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化控件
     */
    void initView(Bundle savedInstanceState);

    /**
     * 加载网络数据 oncreate方法自动调用
     */
    void loadData();
}
