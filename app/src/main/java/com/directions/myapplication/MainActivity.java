package com.directions.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/*public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myFirstButton = (Button) findViewById(R.id.button);
        myFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "123", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        switch(b.getId()) {
            case R.id.button:
                Toast.makeText(this, "asdasd", Toast.LENGTH_SHORT).show();
                break;
        }
    }*/


    public class MainActivity extends AppCompatActivity {
        MyListener listener;
        Button b = null;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            listener = new MyListener(this);

            b = (Button) findViewById(R.id.button);
            b.setOnClickListener(new MyListener(this));
//            listener.onClick(b);
//        new MyListener(MainActivity.this).onClick(b);
        }
    }
