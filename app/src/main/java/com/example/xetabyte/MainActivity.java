package com.example.xetabyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button LoginActivityButton;

    EditText SendingUserIdText;

    String UserIDStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LoginActivityButton = (Button) findViewById(R.id.loginButton);

        SendingUserIdText = (EditText) findViewById(R.id.userIdText);

        LoginActivityButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

            UserIDStr = SendingUserIdText.getText().toString();

            Intent LoginIntent = new Intent(MainActivity.this, MainActivity_2.class);

            LoginIntent.putExtra("User", UserIDStr);

            startActivity(LoginIntent);

        }
}
