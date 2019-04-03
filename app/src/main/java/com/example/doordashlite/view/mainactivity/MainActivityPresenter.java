package com.example.doordashlite.view.mainactivity;

import android.util.Log;

import com.example.doordashlite.model.datasource.remote.RestaurantResponseObserver.RestaurantsResponseCallback;
import com.example.doordashlite.model.datasource.remote.RestaurantsResponseRepository;
import com.example.doordashlite.model.restaurants.Restaurant;

import java.util.ArrayList;

public class MainActivityPresenter implements RestaurantsResponseCallback {
    MainActivityContract contract;
    RestaurantsResponseRepository repository;

    public MainActivityPresenter(MainActivityContract contract) {
        this.contract = contract;
        repository = new RestaurantsResponseRepository();
    }

    public void makeRequest() {
        repository.getRestaurantsResponse(this);
    }

    @Override
    public void onSuccess(ArrayList<Restaurant> restaurants) {
        Log.d("Log.d", "onSucess Presenter");
        contract.setRestaurantsList(restaurants);
    }

    @Override
    public void onError(Throwable e) {
        Log.d("Log.d", "onError Presenter " + e);
    }
}
