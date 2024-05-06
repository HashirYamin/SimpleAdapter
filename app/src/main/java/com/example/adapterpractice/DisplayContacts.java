package com.example.adapterpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayContacts extends AppCompatActivity {
    TextView Contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contacts);
        Contact=findViewById(R.id.contact);
        Intent it = getIntent();
        String contackclick = it.getStringExtra("text1");

    }
}