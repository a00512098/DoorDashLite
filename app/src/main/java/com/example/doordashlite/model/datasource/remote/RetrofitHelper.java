package com.example.doordashlite.model.datasource.remote;

import com.example.doordashlite.model.restaurants.Restaurant;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.example.doordashlite.model.datasource.remote.Utils.API_PATH;
import static com.example.doordashlite.model.datasource.remote.Utils.LAT;
import static com.example.doordashlite.model.datasource.remote.Utils.LATITUDE;
import static com.example.doordashlite.model.datasource.remote.Utils.LIMIT;
import static com.example.doordashlite.model.datasource.remote.Utils.LIMIT_C;
import static com.example.doordashlite.model.datasource.remote.Utils.LNG;
import static com.example.doordashlite.model.datasource.remote.Utils.LONGITUDE;
import static com.example.doordashlite.model.datasource.remote.Utils.OFFSET;
import static com.example.doordashlite.model.datasource.remote.Utils.OFFSET_C;

public class RetrofitHelper {
    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Utils.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private static ObservableInterface createRestaurantResponseInterface() {
        return getRetrofit().create(ObservableInterface.class);
    }

    public static Observable<ArrayList<Restaurant>> getRestaurantResponseObservable() {
        return createRestaurantResponseInterface()
                .getRestaurantObservable(
                        LATITUDE,
                        LONGITUDE,
                        OFFSET_C,
                        LIMIT_C
                );
    }

    public interface ObservableInterface {
        @GET(API_PATH)
        Observable<ArrayList<Restaurant>> getRestaurantObservable(
                @Query(LAT) String latitude,
                @Query(LNG) String longitude,
                @Query(OFFSET) int offset,
                @Query(LIMIT) int limit
        );
    }
}
