package com.xa.subany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by XA on 4/8/2017.
 */

public class Signin_Activity extends AppCompatActivity implements View.OnClickListener {


    private EditText userName;
//    private EditText password;
    private Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("subang");
        setContentView(R.layout.activity_signin);
        userName = (EditText) findViewById(R.id.id_userName);
//        password = (EditText) findViewById(R.id.id_password);
        submit = (Button) findViewById(R.id.id_submit);

        submit.setOnClickListener( this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.id_submit:
                startSignin();
                break;
        }
    }


    //注册
    private void startSignin() {
        Toast.makeText(this, "注册成功！", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this, ViewActivity.class);
        intent.putExtra("userName", userName.getText().toString());
        startActivity(intent);
    }
}

