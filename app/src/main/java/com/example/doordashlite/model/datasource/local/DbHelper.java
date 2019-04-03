package com.example.doordashlite.model.datasource.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.doordashlite.model.restaurants.Restaurant;

import static com.example.doordashlite.model.datasource.local.DbContract.COL_DELIVERY_FEE;
import static com.example.doordashlite.model.datasource.local.DbContract.COL_DESCRIPTION;
import static com.example.doordashlite.model.datasource.local.DbContract.COL_ID;
import static com.example.doordashlite.model.datasource.local.DbContract.COL_IMG_URL;
import static com.example.doordashlite.model.datasource.local.DbContract.COL_NAME;
import static com.example.doordashlite.model.datasource.local.DbContract.COL_STATUS;
import static com.example.doordashlite.model.datasource.local.DbContract.DB_NAME;
import static com.example.doordashlite.model.datasource.local.DbContract.DB_VERSION;
import static com.example.doordashlite.model.datasource.local.DbContract.TABLE_NAME;
import static com.example.doordashlite.model.datasource.local.DbContract.createQuery;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createQuery());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    public long insertRestaurantIntoDB(Restaurant restaurant) {
        SQLiteDatabase writableDB = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_ID, restaurant.getId());
        contentValues.put(COL_NAME, restaurant.getName());
        contentValues.put(COL_DESCRIPTION, restaurant.getDescription());
        contentValues.put(COL_IMG_URL, restaurant.getCoverImgUrl());
        contentValues.put(COL_STATUS, restaurant.getStatus());
        contentValues.put(COL_DELIVERY_FEE, restaurant.getDeliveryFee());

        return writableDB.insert(TABLE_NAME, null, contentValues);
    }
}
