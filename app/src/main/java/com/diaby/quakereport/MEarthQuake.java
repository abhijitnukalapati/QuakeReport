package com.diaby.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by abhijitnukalapati on 9/3/16.
 */
public class MEarthQuake {
    private String place;
    private long time;
    private double mag;

    public MEarthQuake(String place, long time, double mag) {
        this.place = place;
        this.time = time;
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    /**
     * Returns a formatted date string (i.e. "Mar 12, 1989")
     */
    public String getHumanReadableTime() {
        SimpleDateFormat format = new SimpleDateFormat("LLL dd, yyyy", Locale.getDefault());
        return format.format(new Date(time));
    }

    public double getMag() {
        return mag;
    }

}
