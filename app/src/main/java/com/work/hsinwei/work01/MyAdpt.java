package com.work.hsinwei.work01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hsinwei on 2016/7/28.
 */
public class MyAdpt extends BaseAdapter{
    Context context;
    ArrayList<Showitem> data;
    public MyAdpt(Context c,ArrayList<Showitem> list)
    {
        context = c;
        data=list;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);//選擇目前要顯示在哪一個畫面主體

        View v = inflater.inflate(R.layout.listitem,null); //將自訂的Layout 讀出 listitem是檔案名稱
        //View = Layout內所有 View 元件
        // 這個layout有三個元件 ImageView TextView TextView
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        img.setImageResource(data.get(position).photoID);

        TextView tv1= (TextView)v.findViewById(R.id.textView);
        tv1.setText(data.get(position).name);

        TextView tv2= (TextView)v.findViewById(R.id.textView2);
        tv2.setText(data.get(position).phone);

        return v;
    }
}
