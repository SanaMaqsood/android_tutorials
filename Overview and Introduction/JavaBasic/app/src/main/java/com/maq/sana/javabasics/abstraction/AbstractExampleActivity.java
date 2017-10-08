package com.maq.sana.javabasics.abstraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maq.sana.javabasics.R;

public class AbstractExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract);
    }
}
