package id.ac.um.produkskripsi.materi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.um.produkskripsi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrinsipGabung extends android.app.Fragment {


    public PrinsipGabung() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_prinsip_gabung,null);
        return v;
    }

}
