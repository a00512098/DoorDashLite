package com.example.doordashlite.model.datasource.remote;

import com.example.doordashlite.model.datasource.remote.RestaurantResponseObserver.RestaurantsResponseCallback;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RestaurantsResponseRepository {
    public void getRestaurantsResponse(RestaurantsResponseCallback callback) {
        RetrofitHelper.getRestaurantResponseObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new RestaurantResponseObserver(callback));
    }
}
