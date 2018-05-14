package id.ac.um.produkskripsi.materi;


import android.opengl.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.github.chrisbanes.photoview.PhotoView;

import id.ac.um.produkskripsi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CiriBitmap extends android.app.Fragment {

    PhotoView gambar;
    private RadioGroup ciri;

    public CiriBitmap() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_ciri_bitmap, container, false);
        gambar = view.findViewById(R.id.imageciri);
        ciri = view.findViewById(R.id.ciribitmap);

        ciri.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.ciri1:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri1);
                        break;
                    case R.id.ciri2:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri2);
                        break;
                    case R.id.ciri3:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri3);
                        break;
                    case R.id.ciri4:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri4n5);
                        break;
                    case R.id.ciri5:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri4n5);
                        break;
                    case R.id.ciri6:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri6);
                        break;
                    case R.id.ciri7:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri7);
                        break;
                    case R.id.ciri8:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri8);
                        break;
                    case R.id.ciri9:
                        gambar.setVisibility(View.VISIBLE);
                        gambar.setImageResource(R.drawable.ciri9);
                        break;
                }
            }
        });

        return view;
    }

}
