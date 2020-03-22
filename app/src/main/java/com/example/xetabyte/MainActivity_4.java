package com.example.xetabyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity_4 extends AppCompatActivity implements View.OnClickListener{

    private ImageView bus1,bus2,bus3,bus4;
    private Button selectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);

        bus1 = (ImageView) findViewById(R.id.bus1id);
        bus2 = (ImageView) findViewById(R.id.bus2id);


        selectButton = (Button) findViewById(R.id.selectButton);

        bus1.setOnClickListener(this);
        bus2.setOnClickListener(this);
        selectButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bus1id)
        {
            bus1.setVisibility(v.GONE);
            bus2.setVisibility(v.VISIBLE);
        }

        else if(v.getId()==R.id.bus2id)
        {
            bus2.setVisibility(v.GONE);
            bus1.setVisibility(v.VISIBLE);
        }
        else if(v.getId()==R.id.selectButton)
        {
            Intent NextPageIntent = new Intent(MainActivity_4.this, MainActivity.class);

            Toast.makeText(MainActivity_4.this , "Confirmed" , Toast.LENGTH_SHORT).show();

            startActivity(NextPageIntent);
        }

    }
}
