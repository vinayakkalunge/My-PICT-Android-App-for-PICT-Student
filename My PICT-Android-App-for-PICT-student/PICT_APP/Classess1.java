package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Classess1 extends AppCompatActivity implements View.OnClickListener {

    TextView tvse,tvte,tvbe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classess);

        tvse=(TextView) findViewById(R.id.tvse);
        tvte=(TextView) findViewById(R.id.tvte);
        tvbe=(TextView) findViewById(R.id.tvbe);

        tvse.setOnClickListener(this);
        tvte.setOnClickListener(this);
        tvbe.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tvse:
                startActivity(new Intent(this,Semister.class));
                break;
            case R.id.tvte:
                startActivity(new Intent(this,Semister.class));
                break;
            case R.id.tvbe:
                startActivity(new Intent(this,Semister.class));
                break;
        }
    }
}


