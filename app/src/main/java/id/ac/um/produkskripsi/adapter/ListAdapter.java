package id.ac.um.produkskripsi.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.um.produkskripsi.listdata.DataList;
import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.materi.ProsesGabung;

/**
 * Created by PROVIDER on 16/03/2018.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.template_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return DataList.judulGabung.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mJudul;
        private ImageView mGambar;
        private CardView mLink;

        public ListViewHolder(View itemView){
            super (itemView);

            mJudul = itemView.findViewById(R.id.judulMateri);
            mGambar = itemView.findViewById(R.id.gambarMateri);
            mLink = itemView.findViewById(R.id.link);
            itemView.setOnClickListener(this);
        }
        public void bindView (int position){
            final String tempJudul = DataList.judulGabung[position];
            final int tempGambar = DataList.gambarGabung[position];

            mJudul.setText(DataList.judulGabung[position]);
            mGambar.setImageResource(DataList.gambarGabung[position]);
            mLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   Intent i = new Intent(view.getContext(),ProsesGabung.class);
                    i.putExtra("k", tempJudul);
                    i.putExtra("a", tempGambar);
                   view.getContext().startActivity(i);
                }
            });
        }

        public void onClick (View view){

        }
    }
}
