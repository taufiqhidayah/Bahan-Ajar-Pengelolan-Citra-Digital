package id.ac.um.produkskripsi.materi.evaluasi;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.um.produkskripsi.CitraBitmap;
import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.kuis.Quiz;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShowEval extends android.app.Fragment {

    Button eval, uji;
    Intent temp;
    String[] title ={"Uji Kemampuan Pikiran"};
    int[] img ={R.drawable.pikir};
    String[] desk = {"Silahkan Anda Buat Sebuah Gambar Bitmap Menggunakan Aplikasi Pengolah Bitmap sesuai dengan Kreativitas anda"};


    public ShowEval() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_show_eval, container, false);
        eval = view.findViewById(R.id.Eval);
        uji = view.findViewById(R.id.Uji);

        uji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[0], img[0], desk[0]);
            }
        });

        eval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= new Intent(getActivity(), Quiz.class);
                startActivity(temp);

            }
        });
        return view;
    }

    protected void showDialog(String jdl, int img, String desk){

        Dialog dialog = new Dialog(getActivity());
        dialog.setCancelable(true);

        View view  = getActivity().getLayoutInflater().inflate(R.layout.grid_dialog, null);
        dialog.setContentView(view);

        TextView title = view.findViewById(R.id.titleGrid);
        TextView deskripsi = view.findViewById(R.id.deskripsGrid);
        ImageView gambar = view.findViewById(R.id.imageGrid);
        title.setText(jdl);
        gambar.setImageResource(img);
        deskripsi.setText(desk);

        dialog.show();
    };

}
