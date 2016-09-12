package com.diaby.quakereport;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by abhijitnukalapati on 9/3/16.
 */
public class ReportItemAdapter extends RecyclerView.Adapter<ReportItemHolder> {

    private List<MEarthQuake> items;

    public ReportItemAdapter(List<MEarthQuake> items) {
        this.items = items;
    }

    @Override
    public ReportItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View reportItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.report_item, parent, false);
        return new ReportItemHolder(reportItemView);
    }

    @Override
    public void onBindViewHolder(ReportItemHolder holder, int position) {
        holder.magnitude.setText(items.get(position).mag);
        holder.location.setText(items.get(position).place);
        holder.date.setText(items.get(position).time);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
