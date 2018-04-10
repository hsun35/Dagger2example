package com.example.dagger2example.module;

import com.example.dagger2example.DataImplementation;
import com.example.dagger2example.IData;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hefen on 2/27/2018.
 */
//module class
@Module
public class DataModule {
    @Provides
    IData provides_data() {
        return new DataImplementation(1);
    }
}
