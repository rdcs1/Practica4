package com.example.david.practica2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by David on 26/03/2017.
 */

public class AdapterData extends BaseAdapter{

    protected Activity activity;
    protected ArrayList<Data> items;

    public AdapterData(Activity activity, ArrayList<Data> items){
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.list,null);
        }
        Data data = items.get(position);
        Data dir = items.get(position);
        ImageView img = (ImageView)v.findViewById(R.id.img);
        TextView name = (TextView)v.findViewById(R.id.namet);
        TextView price = (TextView)v.findViewById(R.id.price);
        TextView score = (TextView)v.findViewById(R.id.score);

        img.setImageResource(data.getPhoto());
        name.setText(data.getName());
        price.setText(data.getPrice());
        score.setText(data.getScore());

        return v;
    }
}
