package com.zoran.taigilearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView numbers_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAllView();
        numbers_text_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickToNumbersActivity();
            }
        });
    }


    public void getAllView(){
        numbers_text_view = (TextView)findViewById(R.id.numbers);
    }

    public void clickToNumbersActivity(){
        /**   Explicit intent
         Intent numberIntent = new Intent(this,NumbersActivity.class);
         startActivity(numberIntent);
         **/


        Intent numberIntent = new Intent(Intent.ACTION_VIEW);
        numberIntent.setClass(this,NumbersActivity.class);
        startActivity(numberIntent);
    }
}
