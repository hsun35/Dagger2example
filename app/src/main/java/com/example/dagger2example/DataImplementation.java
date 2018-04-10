package com.example.dagger2example;

import java.util.Date;

/**
 * Created by hefen on 2/27/2018.
 */

public class DataImplementation implements IData {
    long mdata;
    @Override
    public long get_data() {
        return mdata;
    }

    public DataImplementation(long mdata) {
        this.mdata = new Date().getTime();
    }
}
