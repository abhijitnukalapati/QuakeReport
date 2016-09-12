package com.diaby.quakereport;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by abhijitnukalapati on 9/3/16.
 */
public class ReportItemHolder extends RecyclerView.ViewHolder {
    public TextView magnitude;
    public TextView distance;
    public TextView location;
    public TextView date;
    public TextView time;

    public ReportItemHolder(View itemView) {
        super(itemView);
        magnitude = (TextView) itemView.findViewById(R.id.magnitude);
        distance = (TextView) itemView.findViewById(R.id.distance);
        location = (TextView) itemView.findViewById(R.id.location);
        date = (TextView) itemView.findViewById(R.id.date);
        time = (TextView) itemView.findViewById(R.id.time);
    }

}
