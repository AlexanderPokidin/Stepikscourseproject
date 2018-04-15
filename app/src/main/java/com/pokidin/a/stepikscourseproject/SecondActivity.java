package com.pokidin.a.stepikscourseproject;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mShowView;
    private Button mSearchButton;

    private View.OnClickListener mSecButtonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String keyWord = getIntent().getStringExtra(MainActivity.MESSAGE_KEY);
            Intent toSearchIntent = new Intent(Intent.ACTION_WEB_SEARCH);
            toSearchIntent.putExtra(SearchManager.QUERY, keyWord);
            startActivity(toSearchIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mShowView = findViewById(R.id.tvShow);
        mSearchButton = findViewById(R.id.buttonSearch);

        mShowView.setText(getIntent().getStringExtra(MainActivity.MESSAGE_KEY));

        mSearchButton.setOnClickListener(mSecButtonOnClickListener);
    }
}
