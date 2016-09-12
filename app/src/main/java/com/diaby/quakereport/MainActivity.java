package com.diaby.quakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView vRecylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vRecylerView = (RecyclerView) findViewById(R.id.report_list);
        vRecylerView.setAdapter(new ReportItemAdapter(buildDummyData()));
        vRecylerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private List<MEarthQuake> buildDummyData() {
        List<MEarthQuake> earthquakes  = new ArrayList<>();
        earthquakes.add(new MEarthQuake("San Francisco", "Feb 2, 2016", "7.2"));
        earthquakes.add(new MEarthQuake("London", "July 20, 2015", "6.1"));
        earthquakes.add(new MEarthQuake("Tokyo", "Nov 10, 2014", "3.9"));
        earthquakes.add(new MEarthQuake("Mexico City", "May 3, 2014", "5.4"));
        earthquakes.add(new MEarthQuake("Moscow", "Jan 31, 2013", "2.8"));
        earthquakes.add(new MEarthQuake("Rio de Janeiro", "Aug 19, 2012", "4.9"));
        earthquakes.add(new MEarthQuake("Paris", "Oct 30, 2011", "1.6"));
        return earthquakes;
    }
}
