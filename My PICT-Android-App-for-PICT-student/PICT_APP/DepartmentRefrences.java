package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DepartmentRefrences extends AppCompatActivity implements View.OnClickListener {

    TextView tvtoc,tvosd,tvdmsa,tvcfca,tvdcwsn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_refrences);

        tvtoc=(TextView) findViewById(R.id.tvtoc);
        tvosd=(TextView) findViewById(R.id.tvosd);
        tvdmsa=(TextView) findViewById(R.id.tvdmsa);
        tvcfca=(TextView) findViewById(R.id.tvcfca);
        tvdcwsn=(TextView) findViewById(R.id.tvdcwsn);

        tvtoc.setOnClickListener(this);
        tvosd.setOnClickListener(this);
        tvdmsa.setOnClickListener(this);
        tvcfca.setOnClickListener(this);
        tvdcwsn.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tvtoc:
                startActivity(new Intent(this,TocRefrences.class));
                break;
            case R.id.tvosd:
                startActivity(new Intent(this,OsdRefrences.class));
                break;
            case R.id.tvdmsa:
                startActivity(new Intent(this,DmsaRefrences.class));
                break;
            case R.id.tvcfca:
                startActivity(new Intent(this,CfcaRefrences.class));
                break;
            case R.id.tvdcwsn:
                startActivity(new Intent(this,DcwsnRefrences.class));
                break;
        }
    }
}
