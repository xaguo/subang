package com.xa.subany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText userName;
    private EditText password;
    private Button login;
    private Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("subang");
        setContentView(R.layout.activity_main);
        userName = (EditText) findViewById(R.id.id_userName);
        password = (EditText) findViewById(R.id.id_password);
        login = (Button) findViewById(R.id.id_login);
        signin = (Button) findViewById(R.id.id_signin);
        login.setOnClickListener( this);
        signin.setOnClickListener( this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.id_login:
                startLogin();
                break;
            case R.id.id_signin:
                startSignin();
                break;
        }
    }

    //登录
    private void startLogin() {

        Intent intent=new Intent(this, ViewActivity.class);
        intent.putExtra("userName", userName.getText().toString());
        startActivity(intent);
    }

    //注册
    private void startSignin() {
        Intent intent=new Intent(this, Signin_Activity.class);
//        intent.putExtra("userName", userName.getText().toString());
        startActivity(intent);
    }
}
