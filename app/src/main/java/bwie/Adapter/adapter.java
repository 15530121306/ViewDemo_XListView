package bwie.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import bwie.bean.Bean;
import bwie.shixinjie1107.R;

/**
 * Created by Shixj on 2016/11/7.
 */
public class adapter extends BaseAdapter{
    List<Bean.ResultBean.DataBean> list;
    Context context;

    public adapter(List<Bean.ResultBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        Bean.ResultBean.DataBean db=list.get(i);
        ViewHolder vh;
        if(convertview==null){
            vh=new ViewHolder();
            convertview= View.inflate(context, R.layout.son,null);
            vh.updatetime=(TextView)convertview.findViewById(R.id.updatetime);
            vh.content=(TextView)convertview.findViewById(R.id.content);
            convertview.setTag(vh);
        }else{
            vh= (ViewHolder) convertview.getTag();
        }
        vh.updatetime.setText(db.updatetime);
        vh.content.setText(db.content);
        return convertview;
    }
    class ViewHolder{
        TextView updatetime;
        TextView content;
    }
}
