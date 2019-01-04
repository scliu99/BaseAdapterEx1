package com.example.cafeburger.baseadapterex1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cafeburger on 2018/1/12.
 */

public class MyBaseAdapter extends BaseAdapter {

    private String[] data;
    private Context mContext;

    public MyBaseAdapter(Context mContext, String[] data) {
        super();
        this.mContext = mContext;
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.item,null);
        final TextView textView = (TextView) view.findViewById(R.id.textView);
        Button button = (Button) view.findViewById(R.id.button);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.ic_launcher);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(textView.getText()+"!");
            }
        });
        textView.setText(data[position]);
        return view;
    }
}
