package id.ac.um.produkskripsi.materi.submateri;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.um.produkskripsi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PengantarGabung extends Fragment {


    public PengantarGabung() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengantar_gabung, container, false);
    }

}
