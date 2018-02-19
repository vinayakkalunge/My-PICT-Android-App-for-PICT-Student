package com.example.tejassangani.loginregister;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TEJAS SANGANI on 9/22/2016.
 */
public class osdcourseaadapter extends BaseAdapter  {
    private Context mContext;
    private List<OsdCourse> mosdcourselist;

    public osdcourseaadapter(Context mContext, List<OsdCourse> mosdcourselist) {
        this.mContext = mContext;
        this.mosdcourselist = mosdcourselist;
    }

    @Override
    public int getCount() {
        return mosdcourselist.size();
    }

    @Override
    public Object getItem(int position) {
        return mosdcourselist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=View.inflate(mContext,R.layout.item_osd_list,null);
        TextView tvUnit = (TextView)v.findViewById(R.id.units);
        TextView tvDescription = (TextView)v.findViewById(R.id.description1);
        tvUnit.setText(mosdcourselist.get(position).getClass().getName());
        tvDescription.setText(mosdcourselist.get(position).getClass().getName());

        v.setTag(mosdcourselist.get(position).getTaskId());
        return v;
    }
}
