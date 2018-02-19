package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Faculty1 extends AppCompatActivity implements View.OnClickListener {

    TextView tvfaculty1,tvfaculty2,tvfaculty3,tvfaculty4,tvfaculty5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty1);

        tvfaculty1=(TextView) findViewById(R.id.tvfaculty1);
        tvfaculty2=(TextView) findViewById(R.id.tvfaculty2);
        tvfaculty3=(TextView) findViewById(R.id.tvfaculty3);
        tvfaculty4=(TextView) findViewById(R.id.tvfaculty4);
        tvfaculty5=(TextView) findViewById(R.id.tvfaculty5);

        tvfaculty1.setOnClickListener(this);
        tvfaculty2.setOnClickListener(this);
        tvfaculty3.setOnClickListener(this);
        tvfaculty4.setOnClickListener(this);
        tvfaculty5.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tvfaculty1:
                startActivity(new Intent(this,LabManual.class));
                break;
            case R.id.tvfaculty2:
                startActivity(new Intent(this,LabManual.class));
                break;
            case R.id.tvfaculty3:
                startActivity(new Intent(this,LabManual.class));
                break;
            case R.id.tvfaculty4:
                startActivity(new Intent(this,LabManual.class));
                break;
            case R.id.tvfaculty5:
                startActivity(new Intent(this,LabManual.class));
                break;

        }

    }
}
