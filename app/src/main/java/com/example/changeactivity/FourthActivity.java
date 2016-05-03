package com.example.changeactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    Button previousActivity;
    Button nextActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        previousActivity = (Button)findViewById(R.id.previousactivity);
        nextActivity = (Button)findViewById(R.id.nextactivity);

        previousActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthActivity.this, ThirdActivity.class);

                startActivity(intent);
            }
        });

        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthActivity.this, FifthActivity.class);
                startActivity(intent);
            }
        });


    }
}
