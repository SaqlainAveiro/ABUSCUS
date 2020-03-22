package com.example.xetabyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_2 extends AppCompatActivity implements View.OnClickListener
{
    Button nextPageButton;

    TextView userIdTextView;

    EditText desCityEditText,anotherCityEditText;

    String userName;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        userIdTextView = (TextView) findViewById(R.id.userIdText);

        desCityEditText = (EditText) findViewById(R.id.destinationText);

        anotherCityEditText = (EditText) findViewById(R.id.anotherText);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null)
        {
            userName = bundle.getString("User");
        }

        Toast.makeText(MainActivity_2.this , "Welcome "+userName , Toast.LENGTH_SHORT).show();

        nextPageButton = (Button) findViewById(R.id.enterButton1);

        nextPageButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        String destination_cityText = desCityEditText.getText().toString();

        String another_cityText = anotherCityEditText.getText().toString();

        Intent NextPageIntent = new Intent(MainActivity_2.this, MainActivity_3.class);

        NextPageIntent.putExtra("Destination_City",destination_cityText);

        NextPageIntent.putExtra("Another_City",another_cityText);

        startActivity(NextPageIntent);
    }
}
