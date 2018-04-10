package com.example.dagger2example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dagger2example.component.DaggerDataComponent;
import com.example.dagger2example.component.DataComponent;
import com.example.dagger2example.module.DataModule;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    IData iData;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        //DataImplementation dataImplementation = new DataImplementation(1);
        //textView.setText(dataImplementation.get_data() + "");

        DataComponent dataComponent = DaggerDataComponent.builder().dataModule(new DataModule()).build();
        dataComponent.injectData(MainActivity.this);

        textView.setText(new Date(iData.get_data())+"");
    }
}
