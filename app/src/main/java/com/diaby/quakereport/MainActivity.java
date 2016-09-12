package com.diaby.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.report_list);
        recyclerView.setAdapter(new ReportItemAdapter(buildDummyData()));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<MEarthQuake> buildDummyData() {
        List<MEarthQuake> earthquakes  = new ArrayList<>();
        earthquakes.add(new MEarthQuake("San Francisco", 1473502099610L, 7.20));
        earthquakes.add(new MEarthQuake("London", 1473371180090L, 6.1));
        earthquakes.add(new MEarthQuake("Tokyo", 1473371180090L,3.9));
        earthquakes.add(new MEarthQuake("Mexico City", 1473116044850L, 5.4));
        earthquakes.add(new MEarthQuake("Moscow", 1472747877790L, 2.8));
        earthquakes.add(new MEarthQuake("Rio de Janeiro", 1472613096060L, 4.9));
        earthquakes.add(new MEarthQuake("Paris", 1472444997880L, 1.4));
        return earthquakes;
    }
}
