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

public class compvm extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collegevm);

        list=(ListView)findViewById(R.id.lvvision);
        list.setAdapter(new tocadapter(this));

    }
    class SingleRow{
        String vision;
        String descriptionvm;

        public SingleRow(String vision,String descriptionvm) {
            this.vision = vision;
            this.descriptionvm = descriptionvm;
        }
    }
    class tocadapter extends BaseAdapter {

        ArrayList<SingleRow> list;
        Context context;
        tocadapter(Context c){
            context=c;
            list=new ArrayList<SingleRow>();
            Resources res=c.getResources();
            String[] titlesv=res.getStringArray(R.array.visioncomp);
            String[] descriptionsv=res.getStringArray(R.array.descriptionvisioncomp);
            for (int i=0;i<2;i++) {
                list.add(new SingleRow( titlesv[i],descriptionsv[i]));
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
            View row=inflater.inflate(R.layout.single_row_vm,viewGroup,false);
            TextView title=(TextView) row.findViewById(R.id.tvvision);
            TextView description=(TextView) row.findViewById(R.id.tvvisiondescription);

            SingleRow temp=list.get(i);
            title.setText(temp.vision);
            description.setText(temp.descriptionvm);

            return row;
        }
    }
}
