package com.example.prak_1_register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mregist;
    private EditText mUsername;
    private EditText mPass;
    private EditText mCountry;
    private EditText mGender;
    private EditText mPhone;

    private String mString_name;
    private String mString_Country;
    private String mString_Gender;
    private String mString_Phone;
    private String mString_Pass;

    public static final String Name = "name" ;
    public static final String Country = "country";
    public static final String Gender = "gender";
    public static final String Phone = "phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_main);
        mregist = findViewById(R.id.button_text1);
        mUsername = findViewById(R.id.username_edit_text1);
        mPass = findViewById(R.id.password_edit_text1);
        mCountry = findViewById(R.id.country_edit_text1);
        mGender = findViewById(R.id.gender_edit_text1);
        mPhone = findViewById(R.id.phone_edit_text1);


        mregist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mString_name = mUsername.getText().toString();
                mString_Country = mCountry.getText().toString();
                mString_Gender = mGender.getText().toString();
                mString_Phone = mPhone.getText().toString();
                mString_Pass = mPass.getText().toString();


                if (mString_name.equals("User")&& mString_Pass.equals("root")&& (mString_Gender.equals("Male")||mString_Gender.equals("Female"))){
                    Toast.makeText(MainActivity.this, "Selamat Datang " + mString_name, Toast.LENGTH_SHORT).show();
                    Intent intent_1 = new Intent(MainActivity.this, Home_Activity.class);
                    intent_1.putExtra(Name, mString_name);
                    intent_1.putExtra(Country, mString_Country);
                    intent_1.putExtra(Gender, mString_Gender);
                    intent_1.putExtra(Phone,mString_Phone);

                    startActivity(intent_1);

                }
                else{
                    Toast.makeText(MainActivity.this,"Harap isi bagian yang kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }



}
