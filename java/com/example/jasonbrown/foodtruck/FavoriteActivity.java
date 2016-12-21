package com.example.jasonbrown.foodtruck;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jason Brown on 3/19/2016.
 */
public class FavoriteActivity extends Activity {

    private static Button b;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_layout);

        TextView tv = (TextView)findViewById(R.id.favorite);
        tv.setText(R.string.favorite);
    }
}
