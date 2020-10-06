package com.example.daggerexample.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.daggerexample.viewmodels.ViewModelProvidersFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProvidersFactory modelProvidersFactory);
}
