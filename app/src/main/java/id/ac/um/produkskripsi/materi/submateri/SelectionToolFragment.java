package id.ac.um.produkskripsi.materi.submateri;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.adapter.ImageAdapter;
import id.ac.um.produkskripsi.listdata.VideoYoutube;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectionToolFragment extends Fragment {

    GridView gridView;
    Button youtube;

    String[] title = {
            "Rectangular Marquee tool",
            "Elliptical Marquee tool",
            "Lasso tool",
            "Polygonal Lasso tool",
            "Magnetic Lasso tool",
            "Magic Wand tool",
            "Quick Selection tool",
            "Selection Brush tool",
            "Smart Brush tool"
    };

    String[] deskripsi = {
            "Menggambar batas seleksi persegi atau persegi panjang.",
            "Menggambar batas seleksi bulat atau elips.",
            "Menggambar batas pemilihan tangan bebas, yang terbaik untuk presisi.",
            "Menggambar beberapa segmen bermata lurus dari batas seleksi.",
            "Menggambar batas seleksi yang secara otomatis terkunci ke tepi saat Anda menyeret ke dalam foto.",
            "Memilih piksel dengan warna yang sama dengan satu klik",
            "Secara cepat dan otomatis membuat pemilihan berdasarkan warna dan tekstur saat anda mengeklik atau mengeklik-seret suatu area.",
            "Secara otomatis memilih atau membatalkan pilihan area yang Anda cat, tergantung pada apakah Anda berada dalam mode Sselection atau Mask.",
            "Menerapkan warna dan penyesuaian warna dan efek ke pilihan. Alat ini secara otomatis membuat lapisan penyesuaian untuk pengeditan non-destruktif."
    };

    int[] mThumbIds = {
            R.drawable.se1,
            R.drawable.se2,
            R.drawable.se3,
            R.drawable.se4,
            R.drawable.se5,
            R.drawable.se6,
            R.drawable.se7,
            R.drawable.se8,
            R.drawable.se9
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_selection_tool,container,false);

        gridView = view.findViewById(R.id.gridView);
        ImageAdapter imageAdapter = new ImageAdapter(getActivity(), title, mThumbIds);

        gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                showDialog(title[position], mThumbIds[position], deskripsi[position]);
            }
        });

        youtube = view.findViewById(R.id.viewVideo);

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VideoYoutube.class);
                intent.putExtra(VideoYoutube.VIDEO_ID,"ODVJ8mjnxBI");
                getActivity().startActivity(intent);

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
