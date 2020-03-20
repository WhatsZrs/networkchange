package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.zrs.networkchange.NetWorkState;
import com.zrs.networkchange.RnetWork;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @RnetWork
    public void onNetWorkChange(NetWorkState state){
        Toast.makeText(this, state.name(),Toast.LENGTH_LONG ).show();

    }
}
