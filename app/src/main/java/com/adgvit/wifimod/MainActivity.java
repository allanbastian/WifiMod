package com.adgvit.wifimod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView WifiUserName, WifiPassWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WifiUserName = (TextView) findViewById(R.id.id);
        WifiPassWord = (TextView) findViewById(R.id.password);

        //GET function
        //Replace both UserName and PassWord using Retrofit
    }
}
