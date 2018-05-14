package id.ac.um.produkskripsi.materi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.github.barteksc.pdfviewer.PDFView;

import id.ac.um.produkskripsi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AplikasiBitmap extends android.app.Fragment {

    CardView keterangan;
    TextView judulApl, ketApl;
    ImageView ps, corel, paint, logoApl;
//    PDFView pdfView;

    public AplikasiBitmap() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aplikasi_bitmap, container, false);
        keterangan = view.findViewById(R.id.keterangan);
        ps = view.findViewById(R.id.aplps);
        corel= view.findViewById(R.id.aplcorel);
        paint= view.findViewById(R.id.aplpaint);
        logoApl = view.findViewById(R.id.logoApl);
        judulApl = view.findViewById(R.id.judulApl);
        ketApl = view.findViewById(R.id.penjelasan);
//        pdfView = view.findViewById(R.id.pdfiVew);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keterangan.setVisibility(View.VISIBLE);
                logoApl.setImageResource(R.drawable.ps);
                judulApl.setText("Adobe Photoshop");
                ketApl.setText(" Adobe Photoshop, atau biasa disebut Photoshop, adalah perangkat lunak editor citra buatan Adobe Systems yang dikhususkan untuk pengeditan foto/gambar dan pembuatan efek. Perangkat lunak ini banyak digunakan oleh fotografer digital dan perusahaaniklan sehingga dianggap sebagai pemimpin pasar (market leader) untuk perangkat lunak pengolah gambar/foto, dan, bersama Adobe Acrobat, dianggap sebagai produk terbaik yang pernah diproduksi oleh Adobe Systems.\n" +
                        "Fungsi Tool-tool Photoshop: \n" +
                        "Crop & Slice Tool dalam photoshop digunakan untuk aktivitas memotong-motong gambar atau resize dari sebuah gambar\n" +
                        "Annotation, Measuring & Navigation Tool tool yang digunakan memudahkan pengguna dalam mengelolah sebuah gambar\n" +
                        "Selection Tool digunakan juga menyeleksi konten dalam gambar untuk digabungkan\n" +
                        "dan banyak lagi tool yang terdapat di adobe Photoshop\n\n" +
                        "sumber: www.adobe.com");
//                pdfView.fromAsset("coba.pdf").load();
            }
        });

        corel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keterangan.setVisibility(View.VISIBLE);
                logoApl.setImageResource(R.drawable.corel_pp);
                judulApl.setText("Corel PhotoPoint");
                ketApl.setText("Corel photo Paint adalah program aplikasi komputer berbasis Bitmap. \n " +
                        "Sebelum memulai menggunakan Corel Photo Paint, perlu diketahui pengertian dari istilah-istilah pendukung operasionalnya seperti : Channel, Editable area, Image, lens. Mask, Object, Path dan Thumnail. \n\n" +
                        "Channel dideskripsikan sebagai suatu gambaran skala “abu-abu” 8-bit yang menyimpan warna atau “pelindung” (mask) informasi untuk suatu gambar. \n" +
                        "Editable area adalah wilayah terlindung yang bisa diedit dan bisa menerima “rona warna” (paint) ) dan efek-efek tertentu yang digunakan untuk menyeleksi suatu wilayah atau suatu gambar. \n" +
                        "Image adalah file yang terbuka atau yang dihasilkan pada Corel Photo Paint. \n" +
                        "Lensa (Lens) adalah suatu lapisan yang melindungi satu atau semua bagian gambar ketika pengguna menggunakan warna. \n" +
                        "Mask dideskripsikan sebagai pelindung yang dapat digunakan pada Image ketika image tersebut diedit untuk menggambarkan wilayah yang dilindungi atau wilayah yang dapat diedit.\n" +
                        "Object adalah suatu bitmap bebas yang terletak di atas gambar latar belakang, sedangkan Path adalah segmen urutan garis dan kurva yang dihubungkan oleh noda-noda (Node) dengan objek yang dapat diubah-ubah (adjustable). \n" +
                        "Thumnail adalah suatu miniatur dari suatu versi gambaran yang beresolusi rendah .\n\n" +
                        "sumber: media.neliti.com");
            }
        });
        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keterangan.setVisibility(View.VISIBLE);
                logoApl.setImageResource(R.drawable.paint);
                judulApl.setText("Microsoft Paint");
                ketApl.setText("Fungsi aplikasi Microsoft Paint adalah untuk pengolah gambar sederhana.\n" +
                        "Meskipun aplikasi Paint ini tergolong aplikasi pengolah gambar sederhana, faktanya aplikasi ini banyak sekali penggunanya. Bukan cuma untuk belajar mewarnai bagi anak-anak saja, tapi juga sering digunakan oleh orang-orang dewasa, khususnya untuk melakukan aktivitas seperti Print Screen, dan Cropping gambar.\n" +
                        "Untuk windows 10 fungsi aplikasi Paint ini tidak lagi bisa disebut sebagai pengolah gambar sederhana, karena penambahan fitur 2D dan 3D menjadikan aplikasi Paint ini nantinya setara dengan pengolah gambar canggih lainnya.\n\n" +
                        "Menu MS Paint, terdiri dari:\n" +
                        "Menu Home, berisi kumpulan ikon Cliptboard, Image, Tools, Brushes, Shapes, Pencils, Fill, dan panel Color. dan\n" +
                        "Menu View, berisi kumpulan ikon Zoom in, Zoom out, Ruler, Status Bar, dan Full Screen.\n\n" +
                        "sumber: modulkomputer.com");
            }
        });

        return view;
    }

}
