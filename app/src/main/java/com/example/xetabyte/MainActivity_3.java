package com.example.xetabyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity_3 extends AppCompatActivity{

    Button chooseButton;

    String destination_cityString,another_cityString;

    TextView current_cityTextView , destination_cityTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_3);

        Bundle bundle = getIntent().getExtras();

        current_cityTextView = (TextView) findViewById(R.id.showtheCurrCity);

        destination_cityTextView = (TextView) findViewById(R.id.showDesCity);

        if(bundle!=null)
        {
            another_cityString = bundle.getString("Another_City");

            destination_cityString = bundle.getString("Destination_City");

            current_cityTextView.setText(another_cityString);

            destination_cityTextView.setText(destination_cityString);
        }

        chooseButton = (Button) findViewById(R.id.confirmbutton);


        chooseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent NextPageIntent = new Intent(MainActivity_3.this, MainActivity_4.class);

                startActivity(NextPageIntent);

            }
        });
    }


}
