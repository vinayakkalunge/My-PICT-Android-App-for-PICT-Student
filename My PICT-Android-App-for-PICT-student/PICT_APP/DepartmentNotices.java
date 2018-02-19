package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DepartmentNotices extends AppCompatActivity implements View.OnClickListener {

    TextView tvcommon,tvse,tvte,tvbe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_notices);

        tvcommon=(TextView)findViewById(R.id.tvcommonnotice);
        tvse=(TextView)findViewById(R.id.tvsenotices);
        tvte=(TextView)findViewById(R.id.tvtenotices);
        tvbe=(TextView)findViewById(R.id.tvbenotices);

        tvcommon.setOnClickListener(this);
        tvse.setOnClickListener(this);
        tvte.setOnClickListener(this);
        tvbe.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tvcommonnotice:
                startActivity(new Intent(this,commondepartmentnotice.class));
                break;
            case R.id.tvsenotices:
                startActivity(new Intent(this,senotice.class));
                break;
            case R.id.tvtenotices:
                startActivity(new Intent(this,tenotice.class));
                break;
            case R.id.tvbenotices:
                startActivity(new Intent(this,benotice.class));
                break;
        }
    }
}
