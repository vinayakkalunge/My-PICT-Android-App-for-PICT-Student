package com.example.tejassangani.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kosalgeek.asynctask.*;


import java.util.HashMap;

public class register extends AppCompatActivity implements AsyncResponse, View.OnClickListener {

    Button bRegister;
    EditText etName,etUsername2,etPassword,etVerify_Password,etSemister,etYearofAdmission;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName=(EditText) findViewById(R.id.etName);
        etUsername2=(EditText) findViewById(R.id.etUsername2);
        etPassword=(EditText) findViewById(R.id.etPassword);
        etVerify_Password=(EditText) findViewById(R.id.etVerify_Password);
        etSemister=(EditText) findViewById(R.id.etSemister);
        etYearofAdmission=(EditText) findViewById(R.id.etYearofAdmission);
        bRegister=(Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bRegister:
                HashMap postData = new HashMap();
                postData.put("mobile", "android");
                postData.put("txtName", etName.getText().toString());
                postData.put("txtUsername2", etUsername2.getText().toString());
                postData.put("txtPassword", etPassword.getText().toString());
                postData.put("txtPassword2", etVerify_Password.getText().toString());
                postData.put("txtSemister", etSemister.getText().toString());
                postData.put("txtYearofAdmission", etYearofAdmission.getText().toString());
                PostResponseAsyncTask task = new PostResponseAsyncTask(this, postData);
                task.execute("http://10.0.2.2/app/register.php/");
                break;
        }
    }

    @Override
    public void processFinish(String result) {
        if (result.equals("mismatch")){
            Toast.makeText(this, " Password Mismatch", Toast.LENGTH_LONG).show();
        }
        if (result.equals("exist")){
            Toast.makeText(this, " Username Already Exists.", Toast.LENGTH_LONG).show();
        }
        if (result.equals("required")){
            Toast.makeText(this, " Please Fill All the Fields.", Toast.LENGTH_LONG).show();
        }
        if (result.equals("success")){
            Toast.makeText(this, " Registered", Toast.LENGTH_LONG).show();
            Intent in = new Intent(this, MainActivity.class);
            startActivity(in);
            finish();
        }
        else
        {
            Toast.makeText(this, "Registeration failed", Toast.LENGTH_LONG).show();
        }
    }
}
