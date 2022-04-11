package org.me.gcu.campbell_innes_s2125573;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.LinkedList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<ItemClass> {


    private Context mContext;
    int mResource;

    public ListAdapter(@NonNull Context context, int resource, LinkedList<ItemClass> item) {
        super(context, resource, item);
        mContext = context;
        mResource = resource;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String title = getItem(position).getTitle();
        //Put these here for now will add to listview once it starts working
        String description = getItem(position).getDescription();
        String link = getItem(position).getLink();
        String geoPoint = getItem(position).getGeoPoint();
        String date = getItem(position).getDate();




        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.titleText);
        TextView tvDescription = (TextView) convertView.findViewById(R.id.descriptionText);
        TextView tvLink = (TextView) convertView.findViewById(R.id.linkText);
        TextView tvGeoPoint = (TextView) convertView.findViewById(R.id.geoPointText);
        TextView tvDate = (TextView) convertView.findViewById(R.id.pubDateText);

        tvName.setText(title);
        tvDescription.setText(description);
        tvLink.setText(link);
        tvGeoPoint.setText(geoPoint);
        tvDate.setText(date);

        return convertView;
    }
}
