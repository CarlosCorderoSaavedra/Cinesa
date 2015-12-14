package com.example.shine.cinesa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * {@link BaseAdapter} para poblar coches en un grid view
 */

public class FilmsAdapter extends BaseAdapter {
    private Context context;

    public FilmsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Films.ITEMS.length;
    }

    @Override
    public Films getItem(int position) {
        return Films.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item_films, viewGroup, false);
        }

        ImageView filmImage = (ImageView) view.findViewById(R.id.film_image);
        TextView filmName = (TextView) view.findViewById(R.id.film_name);

        final Films item = getItem(position);
        filmImage.setImageResource(item.getIdDrawable());
        filmName.setText(item.getName());

        return view;
    }

}