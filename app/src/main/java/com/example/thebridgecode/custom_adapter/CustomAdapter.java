package com.example.thebridgecode.custom_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pande on 25-Jul-16.
 */
public class CustomAdapter extends BaseAdapter{
    String[] result;
    Context context;

    int [] imageId;

    private static LayoutInflater inflater = null;

    public CustomAdapter(navigation navigation, String[] personName, int[] personImages){
        result = personName;
        context = navigation;
        imageId = personImages;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder{
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView=inflater.inflate(R.layout.activity_program_list,null);
        holder.tv= (TextView) rowView.findViewById(R.id.textView);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        return rowView;
    }
}
