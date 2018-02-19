package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SemisterLabmanual extends AppCompatActivity implements View.OnClickListener {

    TextView tvsem1,tvsem2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semister);

        tvsem1=(TextView) findViewById(R.id.tvsemister1);
        tvsem2=(TextView) findViewById(R.id.tvsemister2);

        tvsem1.setOnClickListener(this);
        tvsem2.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tvsemister1:
                startActivity(new Intent(this,LabmanualTesemister1.class));
                break;
            case R.id.tvsemister2:
                startActivity(new Intent(this,LabmanualTesemister1.class));
                break;
        }
    }
}
