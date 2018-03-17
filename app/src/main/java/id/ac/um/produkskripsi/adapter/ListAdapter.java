package id.ac.um.produkskripsi.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.um.produkskripsi.listdata.DataList;
import id.ac.um.produkskripsi.R;

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
        return DataList.judul.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mJudul;
        private ImageView mGambar;

        public ListViewHolder(View itemView){
            super (itemView);

            mJudul = itemView.findViewById(R.id.judulMateri);
            mGambar = itemView.findViewById(R.id.gambarMateri);
            itemView.setOnClickListener(this);
        }

        public void bindView (int position){
            mJudul.setText(DataList.judul[position]);
            mGambar.setImageResource(DataList.gambar[position]);
        }

        public void onClick (View view){

        }
    }
}
