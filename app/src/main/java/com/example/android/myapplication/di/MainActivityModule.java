package com.example.android.myapplication.di;

import com.example.android.myapplication.MainActivity;
import com.google.android.datatransport.runtime.dagger.Module;

@Module
public abstract class MainActivityModule {
//    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract MainActivity contributeMainActivity();
}
