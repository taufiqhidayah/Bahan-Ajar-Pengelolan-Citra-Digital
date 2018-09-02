package id.ac.um.produkskripsi.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.um.produkskripsi.listdata.DataList;
import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.materi.ProsesGabung;

/**
 * Created by PROVIDER on 16/03/2018.
 */

public class ListAdapter extends ArrayAdapter<String> {

    String[] judul;
    int[] img;
    Context mContext;

    public ListAdapter (Context context, String[] Title, int[] Image) {
        super(context, R.layout.template_list);
        this.judul = Title;
        this.img= Image;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return judul.length;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.template_list, parent, false);
            mViewHolder.mFlag = (ImageView) convertView.findViewById(R.id.gambarMateri);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.judulMateri);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.mFlag.setImageResource(img[position]);
        mViewHolder.mName.setText(judul[position]);

        return convertView;
    }

    static class ViewHolder {
        ImageView mFlag;
        TextView mName;
    }
}
