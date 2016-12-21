package com.example.jasonbrown.foodtruck;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Jason Brown on 3/18/2016.
 */
//This class is shows the food trucks
//as a list in the current tabbed activity
public class FoodTruckOpen extends Activity {
    int count;
    ListView listView;
    Intent intent;
    String foodName;
    DatePicker datePick;
    String[] values = new String[] { "Rusty's Road Trip",
            "Rosie's Rolling Chef",
            "The Displaced Chef",
            "Jeanies Comfort Cuisine",
            "Jera's Heavenly Sweet",
            "Grumpy's On The Go"
    };

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_truck);
        //create a list of food trucks and displays them
        //on the first tab of the app (can be edited to get the trucks
        //from a database instead of manually being set)

        listView = (ListView) findViewById(android.R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        //Purpose of this list view is to show the Food Trucks menu
        //when the Name of the truck is clicked
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                // TODO Auto-generated method stub
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);
                foodName = itemValue.toString();

                //another way to test to see if loading webview onclick works
                if(foodName.equals("Rusty's Road Trip")) {
                    intent = new Intent(FoodTruckOpen.this, RustysRoadTrip.class);
                    startActivity(intent);
                }

                 else if (foodName.equals("Rosie's Rolling Chef")){
                            intent = new Intent(FoodTruckOpen.this, RosiesRollingChef.class);
                            startActivity(intent);
                }

                else if (foodName.equals("The Displaced Chef")){
                    intent = new Intent(FoodTruckOpen.this, TheDisplacedChef.class);
                    startActivity(intent);
                }

                else if (foodName.equals("Jeanies Comfort Cuisine")){
                    intent = new Intent(FoodTruckOpen.this, JeaniesComfortCuisine.class);
                    startActivity(intent);
                }

                else if (foodName.equals("Jera's Heavenly Sweet")){
                    intent = new Intent(FoodTruckOpen.this, JerasHeavenlySweet.class);
                    startActivity(intent);
                }

                else if (foodName.equals("Grumpy's On The Go")){
                    intent = new Intent(FoodTruckOpen.this, GrumpysOnTheGo.class);
                    startActivity(intent);
                }
            }
        });
    }
}

