package com.example.tejassangani.loginregister;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class OsdRefrences extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toc_course);

        list=(ListView)findViewById(R.id.tocsyllubas);
        list.setAdapter(new tocadapter(this));

    }
    class SingleRow{
        String title;
        String description;

        public SingleRow(String title, String description) {
            this.title = title;
            this.description = description;
        }
    }
    class tocadapter extends BaseAdapter {

        ArrayList<SingleRow> list;
        Context context;
        tocadapter(Context c){
            context=c;
            list=new ArrayList<SingleRow>();
            Resources res=c.getResources();
            String[] titles=res.getStringArray(R.array.titlesrefosd);
            String[] descriptions=res.getStringArray(R.array.descriptionrefosd);
            for (int i=0;i<6;i++)
            {
                list.add(new SingleRow(titles[i],descriptions[i]));
            }
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
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row=inflater.inflate(R.layout.single_row,viewGroup,false);
            TextView title=(TextView) row.findViewById(R.id.tvtitle);
            TextView description=(TextView) row.findViewById(R.id.tvdescription);

            SingleRow temp=list.get(i);
            title.setText(temp.title);
            description.setText(temp.description);

            return row;
        }
    }
}
