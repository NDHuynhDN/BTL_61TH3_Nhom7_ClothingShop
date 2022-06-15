package com.example.btl_clothingshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

import com.example.btl_clothingshop.Owner.OwnerLogin;

public class MainActivity extends AppCompatActivity {
    Button openCustomer;
    Button openOwner;

//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//
        openCustomer = (Button) findViewById(R.id.openCustomerLogin);
        openCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCustomerLoginForm();
            }
        });
        openOwner = (Button) findViewById(R.id.openOwnerlogin);
        openOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOwnerLoginForm();
            }
        });
    }
    public void openCustomerLoginForm() {
        Intent intent = new Intent(this, CustomerLogin.class);
        startActivity(intent);
    }

    public void openOwnerLoginForm() {
        Intent i = new Intent(this, OwnerLogin.class);
        startActivity(i);
    }
}