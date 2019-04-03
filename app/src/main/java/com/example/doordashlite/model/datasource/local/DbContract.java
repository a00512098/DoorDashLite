package com.example.doordashlite.model.datasource.local;

import java.util.Locale;

public class DbContract {
    public static final String DB_NAME = "Restaurants";
    public static final int DB_VERSION = 1;

    public static final String TABLE_NAME = "restaurants";
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_IMG_URL = "image";
    public static final String COL_STATUS = "status";
    public static final String COL_DELIVERY_FEE = "deliveryfee";

    public static String createQuery() {
        StringBuilder query = new StringBuilder();
        query.append("CREATE TABLE ");
        query.append(TABLE_NAME);
        query.append(" ( ");
        // Because the Restaurant ID comes from the API
        query.append(COL_ID);
        query.append(" TEXT, ");
        query.append(COL_NAME);
        query.append(" TEXT, ");
        query.append(COL_DESCRIPTION);
        query.append(" TEXT, ");
        query.append(COL_IMG_URL);
        query.append(" TEXT, ");
        query.append(COL_STATUS);
        query.append(" TEXT, ");
        query.append(COL_DELIVERY_FEE);
        query.append(" TEXT )");

        return query.toString();
    }

    public static String getAllRestaurantQuery() {
        return "SELECT * FROM " + TABLE_NAME;
    }
}
