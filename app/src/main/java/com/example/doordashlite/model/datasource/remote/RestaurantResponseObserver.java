package com.example.doordashlite.model.datasource.remote;

import android.util.Log;
import android.widget.ListView;

import com.example.doordashlite.model.restaurants.Restaurant;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RestaurantResponseObserver implements Observer<ArrayList<Restaurant>> {
    private ArrayList<Restaurant> restaurants;
    private Restaurant restaurant;
    private RestaurantsResponseCallback callback;
    int count = 0;

    public RestaurantResponseObserver(RestaurantsResponseCallback callback) {
        this.callback = callback;
        this.restaurants = new ArrayList<>();
    }

    @Override
    public void onSubscribe(Disposable d) {
    }

    @Override
    public void onNext(ArrayList<Restaurant> restaurant) {
//        this.restaurant = restaurant;
        count++;
        Log.d("Log.d", "onNext: " + count);
//        restaurants.add(restaurant);
        restaurants = restaurant;
    }

    @Override
    public void onError(Throwable e) {
        callback.onError(e);
    }

    @Override
    public void onComplete() {
        callback.onSuccess(restaurants);
    }

    public interface RestaurantsResponseCallback {
        void onSuccess(ArrayList<Restaurant> restaurants);
//        void onSuccess(Restaurant restaurant);

        void onError(Throwable e);
    }
}
