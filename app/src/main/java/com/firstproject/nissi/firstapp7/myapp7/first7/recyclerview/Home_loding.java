package com.firstproject.nissi.firstapp7.myapp7.first7.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Home_loding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_loding);
        getSupportActionBar().hide();

        RecyclerView Fooditemview = findViewById(R.id.Fooditemlist);
        Fooditemview.setLayoutManager(new LinearLayoutManager(this));

    }
}