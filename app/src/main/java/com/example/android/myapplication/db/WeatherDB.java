package com.example.android.myapplication.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.android.myapplication.model.SavedDailyForecast;
import com.example.android.myapplication.model.UviDb;

@Database(entities = {SavedDailyForecast.class, UviDb.class},
        version = 1,
        exportSchema = false)

public abstract class WeatherDB extends RoomDatabase {
//    abstract public ForecastDao forecastDao();
}