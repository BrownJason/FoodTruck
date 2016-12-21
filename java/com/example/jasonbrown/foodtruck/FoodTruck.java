package com.example.jasonbrown.foodtruck;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class FoodTruck extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_truck);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec foodTruck = tabHost.newTabSpec("Food Trucks"); //declare first tab
        TabHost.TabSpec mapPage = tabHost.newTabSpec("Map"); //declare second tab
        TabHost.TabSpec accountPage = tabHost.newTabSpec("Account"); //declare third tab

        //calls the food truck activity to display the open
        //food trucks on the first tab (will be selectable)
        foodTruck.setIndicator("Food Trucks");
        foodTruck.setContent(new Intent(this, FoodTruckOpen.class));

        //calls the map activity and displays the navigable map on the
        //second tab
        mapPage.setIndicator("Map");
        mapPage.setContent(new Intent(this, MapsViewActivity.class));

        //calls the account activity and displays it on the third tab
        accountPage.setIndicator("Account");
        accountPage.setContent(new Intent(this, AccountActivity.class));

        //add each tab to the host to make them visible
        // to the user of the app
        tabHost.addTab(foodTruck);
        tabHost.addTab(mapPage);
        tabHost.addTab(accountPage);

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
}
