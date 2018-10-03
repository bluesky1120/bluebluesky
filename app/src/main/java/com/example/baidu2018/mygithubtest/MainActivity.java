package com.example.baidu2018.mygithubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"这是Clone的版本",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"这是 master本地 的版本",Toast.LENGTH_SHORT).show();
    }
}
