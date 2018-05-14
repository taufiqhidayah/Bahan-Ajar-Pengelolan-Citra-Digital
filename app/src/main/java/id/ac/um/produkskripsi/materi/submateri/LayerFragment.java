package id.ac.um.produkskripsi.materi.submateri;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

//import com.ami.fundapter.BindDictionary;
//import com.ami.fundapter.FunDapter;
//import com.ami.fundapter.extractors.StringExtractor;

import java.util.ArrayList;

import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.listdata.VideoYoutube;

/**
 * A simple {@link Fragment} subclass.
 */
public class LayerFragment extends Fragment {


    Button youtube;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_layer,container,false);

        youtube = view.findViewById(R.id.lihatvideo);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VideoYoutube.class);
                intent.putExtra(VideoYoutube.VIDEO_ID,"t-Tq3HyXSbA");
                getActivity().startActivity(intent);

            }
        });


        return view;
    }

}
