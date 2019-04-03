package com.example.doordashlite.view.mainactivity;

import com.example.doordashlite.model.restaurants.Restaurant;

import java.util.ArrayList;

public interface MainActivityContract {
    void setRestaurantsList(ArrayList<Restaurant> restaurants);
}
