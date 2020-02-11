package com.example.prak_1_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Home_Activity extends AppCompatActivity {

    private TextView home_name;
    private TextView country;
    private TextView gender;
    private TextView phone;


    private String get_name;
    private String get_country;
    private String get_gender;
    private String get_phone;


    private Button home_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        home_name = findViewById(R.id.home_text1);
        country = findViewById(R.id.country_text1);
        gender  = findViewById(R.id.gender_text1);
        phone = findViewById(R.id.phone_text1);


        home_button = findViewById(R.id.button_home1);


        Intent intent_home = getIntent();
        get_name = intent_home.getStringExtra(MainActivity.Name);
        get_country = intent_home.getStringExtra(MainActivity.Country);
        get_gender = intent_home.getStringExtra(MainActivity.Gender);
        get_phone = intent_home.getStringExtra(MainActivity.Phone);

        home_name.setText("Welcome, "+get_name);
        country.setText("\n Country     : "+get_country);
        gender.setText("\n Gender       : "+get_gender);
        phone.setText("\n Phone Number  : "+get_phone);

        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Activity.this, "Selamat Tinggal", Toast.LENGTH_SHORT).show();
                Intent intent_back = new Intent(Home_Activity.this, MainActivity.class);
                startActivity(intent_back);
            }
        });


    }




}
