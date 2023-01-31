package org.techtown.viewchange;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity_main);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        //int age = Integer.parseInt(intent.getExtras().getString("age"));

        TextView text = findViewById(R.id.textView);
        text.setText(name);

        Log.v("check", name);
//        System.out.println(intent.getExtras().getString("name")+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");


    }
}