package com.example.doordashlite.view.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.doordashlite.R;
import com.example.doordashlite.model.restaurants.Restaurant;
import com.example.doordashlite.view.RestaurantsListAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainActivityContract {
    MainActivityPresenter presenter;
    RecyclerView recyclerView;
    RestaurantsListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);
        presenter.makeRequest();

        fillRecyclerView();
    }

    private void fillRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        listAdapter = new RestaurantsListAdapter(this);
        recyclerView.setAdapter(listAdapter);
    }

    @Override
    public void setRestaurantsList(ArrayList<Restaurant> restaurants) {
        listAdapter.setRestaurants(restaurants);
    }
}
