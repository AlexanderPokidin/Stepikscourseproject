package com.pokidin.a.stepikscourseproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mShowView;
    private Button mJustButton;

    private View.OnClickListener mSecButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mShowView = findViewById(R.id.tvShow);
        mJustButton = findViewById(R.id.buttonSecond);

        mShowView.setText(getIntent().getStringExtra(MainActivity.MESSAGE_KEY));

        mJustButton.setOnClickListener(mSecButtonOnClickListener);
    }
}
