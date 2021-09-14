package com.example.android.myapplication.di;

import android.app.Application;

import androidx.room.Room;

import com.example.android.myapplication.api.WeatherService;
import com.example.android.myapplication.db.ForecastDao;
import com.example.android.myapplication.db.WeatherDB;
import com.example.android.myapplication.util.Constants;
import com.example.android.myapplication.util.LiveDataCallAdapterFactory;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

import javax.inject.Singleton;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

;

@Module(includes = ViewModelModule.class)
class AppModule {
    @Singleton
    @Provides
    WeatherService provideWeatherService() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .client(httpClient.build())
                .build();

        return retrofit.create(WeatherService.class);
    }

    @Singleton @Provides
    WeatherDB provideDb(Application app) {
        return Room.databaseBuilder(app, WeatherDB.class,"weather.db")
                .fallbackToDestructiveMigration()
                .build();
    }

    @Singleton @Provides
    ForecastDao provideForecastDao(WeatherDB db) {

        return db.forecastDao();
    }
}