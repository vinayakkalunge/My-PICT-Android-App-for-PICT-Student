package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LabmanualTesemister1 extends AppCompatActivity implements View.OnClickListener {

    TextView tvpl1,tvpl2,tvesdl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labmanual_tesemister1);

        tvpl1=(TextView) findViewById(R.id.tvlabmanualpl1);
        tvpl2=(TextView) findViewById(R.id.tvlabmanualpl2);
        tvesdl=(TextView) findViewById(R.id.tvlabmanualesdl);

        tvpl1.setOnClickListener(this);
        tvpl2.setOnClickListener(this);
        tvesdl.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tvlabmanualpl1:
//                startActivity(new Intent(this,DepartmentRefrences.class));
                break;
            case R.id.tvlabmanualpl2:
//                startActivity(new Intent(this,DepartmentRefrences.class));
                break;
            case R.id.tvlabmanualesdl:
//                startActivity(new Intent(this,DepartmentRefrences.class));
                break;
        }
    }
}
