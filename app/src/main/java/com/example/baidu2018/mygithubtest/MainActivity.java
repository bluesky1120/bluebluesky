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
        Toast.makeText(this,"这是 111master1本地 的重新修改版本333333314446666dafadfsdf",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"这是 master2本地 123",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"这是 branch2 的版本重新修改232323点点滴滴333337777399999333333",Toast.LENGTH_SHORT).show();
    }
}
