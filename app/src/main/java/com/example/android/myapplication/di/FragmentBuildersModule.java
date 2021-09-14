package com.example.android.myapplication.di;

//import com.example.android.myapplication.HomeFragment;
import com.example.android.myapplication.HomeFragment;
import com.example.android.myapplication.SettingFragment;
import com.example.android.myapplication.WeekFragment;
import com.google.android.datatransport.runtime.dagger.Module;

@Module
public abstract class FragmentBuildersModule {


    abstract HomeFragment contributeTodayFragment();


    abstract WeekFragment contributeWeeklyFragment();


    abstract SettingFragment contributeSettingsFragment();
}