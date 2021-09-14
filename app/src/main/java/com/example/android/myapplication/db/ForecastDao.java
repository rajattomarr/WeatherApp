package com.example.android.myapplication.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import com.example.android.myapplication.model.SavedDailyForecast;
import com.example.android.myapplication.model.UviDb;

import java.util.List;

import retrofit2.http.Query;

@Dao
public interface ForecastDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertForecastList(List<SavedDailyForecast> savedDailyForecasts);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUvi(UviDb uviDb);

    LiveData<List<SavedDailyForecast>> loadForecast();

    LiveData<UviDb> loadUvi();

    void deleteNewsTable();

    void deleteUvi();
}
