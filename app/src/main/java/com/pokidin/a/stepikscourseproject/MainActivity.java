package com.pokidin.a.stepikscourseproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String MESSAGE_KEY = "MESSAGE_KEY";

    private EditText mMessage;
    private Button mPressMe;

    private View.OnClickListener mPressMeOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (isMessageValid()) {
                Intent toSecondActivityIntent = new Intent(MainActivity.this, SecondActivity.class);
                toSecondActivityIntent.putExtra(MESSAGE_KEY, mMessage.getText().toString());
                startActivity(toSecondActivityIntent);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessage = findViewById(R.id.etMessage);
        mPressMe = findViewById(R.id.buttonPressMe);

        mPressMe.setOnClickListener(mPressMeOnClickListener);
    }

    private boolean isMessageValid() {
        return !TextUtils.isEmpty(mMessage.getText());
    }
}
