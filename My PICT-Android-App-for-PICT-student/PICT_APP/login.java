package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kosalgeek.asynctask.AsyncResponse;

public class login extends AppCompatActivity implements AsyncResponse, View.OnClickListener {


    /*Button bLogin;
    EditText etUsername,etPassword;
    TextView tvRegisterLink;*/

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername=(EditText) findViewById(R.id.etUsername);
        etPassword=(EditText) findViewById(R.id.etPassword);
        tvRegisterLink=(TextView) findViewById(R.id.tvRegisterLink);
        bLogin=(Button) findViewById(R.id.bLogin);
        bLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:

                startActivity(new Intent(this,Home.class));

                break;
            case R.id.tvRegisterLink:

                startActivity(new Intent(this,register.class));



                break;
        }
    }
*/
    Button bLogout;
    EditText etFirst_Name,etLast_Name,etUsername1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst_Name=(EditText) findViewById(R.id.etFirst_Name);
        etLast_Name=(EditText) findViewById(R.id.etLast_Name);
        etUsername1=(EditText) findViewById(R.id.etUsername1);
        bLogout=(Button) findViewById(R.id.bLogout);

        bLogout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bLogout:
                startActivity(new Intent(this,login.class));
                break;
        }

    }
    @Override
    public void processFinish(String s) {

    }
}
