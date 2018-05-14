package id.ac.um.produkskripsi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.um.produkskripsi.R;

/**
 * Created by PROVIDER on 13/05/2018.
 */

public class ImageAdapter extends BaseAdapter {
    Context context;
    private final String [] title;
    private final int [] mThumbIds;
    View view;
    LayoutInflater layoutInflater;

    public ImageAdapter(Context context, String[] title, int[] mThumbIds) {
        this.context = context;
        this.title = title;
        this.mThumbIds = mThumbIds;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null){
            view = new View(context);
            view = layoutInflater.inflate(R.layout.grid_resource, null);

            ImageView imageView = view.findViewById(R.id.gridImage);
            TextView textView = view.findViewById(R.id.gridText);
            imageView.setImageResource(mThumbIds[i]);
            textView.setText(title[i]);
        }

        return view;
    }
}