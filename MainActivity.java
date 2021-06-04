package com.example.myfirstapplication;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupHyperlink();
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.activity_main_link_one);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView1 = findViewById(R.id.activity_main_link_two);
        linkTextView1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView2 = findViewById(R.id.activity_main_link_three);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextView3 = findViewById(R.id.activity_main_link_four);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
