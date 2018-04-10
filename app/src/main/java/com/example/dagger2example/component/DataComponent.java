package com.example.dagger2example.component;

import com.example.dagger2example.MainActivity;
import com.example.dagger2example.module.DataModule;

import dagger.Component;

/**
 * Created by hefen on 2/27/2018.
 */
@Component(modules = {DataModule.class})
public interface DataComponent {//specify the modules to dagger2
    void injectData(MainActivity mainActivity);//take DataImplementation and inject into MainActivity
}
