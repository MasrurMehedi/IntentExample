package com.example.masror_mehedi.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button Declare
    Button btnClickMe,btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link java to xml button
        btnClickMe = (Button)findViewById(R.id.btn_clickme);
        btnGoogle = (Button)findViewById(R.id.btn_google);


        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //source to destination
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Click Me", Toast.LENGTH_SHORT).show();
            }
        });

        //set click listener to button google
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(i);
                Toast.makeText(MainActivity.this, "Google", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
