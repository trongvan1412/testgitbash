package com.example.foodlistview;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Activity activity;
    int layout;
    ArrayList<Food> listFood;

    public CustomAdapter(Activity activity, int layout, ArrayList<Food> listFood) {
        this.activity = activity;
        this.layout = layout;
        this.listFood = listFood;
    }

    @Override
    public int getCount() {
        return listFood.size();
    }

    @Override
    public Object getItem(int position) {
        return listFood.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(layout,null);
            holder = new ViewHolder();
            //anh xa
            holder.iv_preview = (ImageView) convertView.findViewById(R.id.iv_preview);
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_price = (TextView) convertView.findViewById(R.id.tv_price);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        //code
        holder.tv_name.setText(listFood.get(position).getNameFood());
        holder.tv_price.setText(listFood.get(position).getPrice());
        holder.iv_preview.setImageResource(listFood.get(position).getImage_preview());

        return convertView;
    }

    private class ViewHolder{
        TextView tv_name;
        TextView tv_price;
        ImageView iv_preview;
    }
}
