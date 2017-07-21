package com.directions.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by rtyJa on 21/07/2017.
 */

class MyListener implements View.OnClickListener{

    Context context;

    public MyListener(Context c) {
        context = c;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, "You have click me", Toast.LENGTH_SHORT).show();
    }
}