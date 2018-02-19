package com.example.tejassangani.loginregister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.amigold.fundapter.BindDictionary;
import com.amigold.fundapter.FunDapter;
import com.amigold.fundapter.extractors.StringExtractor;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.kosalgeek.android.json.JsonConverter;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class Refsubpage01 extends AppCompatActivity {

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refsubpage01);

        list=(ListView)findViewById(R.id.serefrence);

        String url= "http://192.168.43.248/app/files.php";

        StringRequest stringRequest= new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d(TAG, response);
                ArrayList<files> filelist = new JsonConverter<files>().toArrayList(response, files.class);
                BindDictionary<files> dictionary = new BindDictionary<>();
                dictionary.addStringField(R.id.tvText, new StringExtractor<files>() {

                    @Override
                    public String getStringValue(files file, int position) {
                        return file.heading;
                    }
                });

                FunDapter<files> adapter=new FunDapter<>(getApplicationContext(), filelist, R.layout.file_layout, dictionary);

                list.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Connection Failed", Toast.LENGTH_LONG).show();
            }
        });

        layout.MySingleton.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);

    }
    /*class SingleRow{
        String title;
        String description;

        public SingleRow(String title, String description) {
            this.title = title;
            this.description = description;
        }
    }
    class tocadapter extends BaseAdapter{

        ArrayList<SingleRow> list;
        Context context;
        tocadapter(Context c){
            context=c;
            list=new ArrayList<SingleRow>();
            Resources res=c.getResources();
            String[] titles=res.getStringArray(R.array.titles);
            String[] descriptions=res.getStringArray(R.array.descriptionref);
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
            View row=inflater.inflate(R.layout.single_row_refrences,viewGroup,false);
            TextView title=(TextView) row.findViewById(R.id.tvtitler);
            TextView description=(TextView) row.findViewById(R.id.tvdescriptionr);

            SingleRow temp=list.get(i);
            title.setText(temp.title);
            description.setText(temp.description);

            return row;
        }
    }*/
}
