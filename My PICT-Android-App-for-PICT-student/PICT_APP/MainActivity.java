package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements AsyncResponse, View.OnClickListener {

    EditText etUsername, etPassword;
    Button bLogin;
    TextView tvRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        bLogin.setOnClickListener(this);
        tvRegisterLink=(TextView) findViewById(R.id.tvRegisterLink);
        tvRegisterLink.setOnClickListener(this);
    }

    @Override
    public void processFinish(String result) {
        if (result.equals("success")){
            Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show();
            Intent in = new Intent(this, Home.class);
            startActivity(in);
            finish();
        }
        else
        {
            Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show();
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bLogin:
                HashMap postData = new HashMap();
                postData.put("mobile", "android");
                postData.put("txtUsername", etUsername.getText().toString());
                postData.put("txtPassword", etPassword.getText().toString());
                PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData);
                task.execute("http://192.168.43.248/app/login.php/");
                break;

            case R.id.tvRegisterLink:
                startActivity(new Intent(this,register.class));
                break;
        }

    }

}
