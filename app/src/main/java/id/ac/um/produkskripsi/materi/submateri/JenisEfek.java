package id.ac.um.produkskripsi.materi.submateri;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.adapter.ImageAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class JenisEfek extends android.app.Fragment {

    LinearLayout sub1,sub2,sub3,sub4,sub5,sub6,sub7;
    Button menu1,menu2,menu3,menu4,menu5,menu6,menu7,
            blur1,blur2,blur3,blur4,
            dis1,dis2,dis3,dis4,
            nois3,nois2,nois1,
            pix1,pix2,pix3,pix4,
            ren1,ren2,
            shar1, shar2,
            style1,style2,style3,style4;
    TextView teks;
    String[] title =
            {"Blur Average", //0
            "Box Blur", //1
            "Lens Blur", //2
            "Motion Blur", //3
            "Distort Displace", //4
            "Distort Glass", //5
            "Distort Pinch", //6
            "Distort Ripple", //7
            "Noise Despeckle", //8
            "Noise Median", //9
            "Reduce Noise", //10
            "Pixelate Facet", //11
            "Pixelate Mezzotint", //12
            "Pixelate Mosaic", //13
            "Pixelate Pointillize", //14
            "Render - Clouds", //15
            "Render - Fibers", //16
            "Sharpen and Sharpen More", //17
            "Smart Sharpen", //18
            "Stylize Diffuse", //19
            "Stylize Emboss", //20
            "Stylize Find Edges", //21
            "Stylize Wind" //22
            };
    int[] img =
            {
                    R.drawable.efek_average, //0
                    0, //1
                    R.drawable.efek_lensblur, //2
                    R.drawable.efek_motionblur, //3
                    0, //4
                    0, //5
                    R.drawable.efek_pinch, //6
                    R.drawable.efek_ripple, //7
                    R.drawable.efek_despeckle, //8
                    R.drawable.efek_median, //9
                    R.drawable.efek_reduce, //10
                    0, //11
                    R.drawable.efek_mezzotint, //12
                    R.drawable.efek_mosaic, //13
                    R.drawable.efek_pointilize, //14
                    R.drawable.efek_clouds, //15
                    R.drawable.efek_fiber, //16
                    0, //17
                    R.drawable.efek_smartsharpen, //18
                    R.drawable.efek_diffuse, //19
                    R.drawable.efek_embos, //20
                    R.drawable.efek_findedges, //21
                    R.drawable.efek_wind //22
            };
    String[] desk =
            {
                    "Menemukan warna rata-rata dari suatu gambar atau seleksi, dan kemudian mengisi gambar atau seleksi dengan warna untuk menciptakan tampilan yang halus. Misalnya, jika Anda memilih area rumput, filter akan mengubah area tersebut menjadi tambalan hijau yang homogen.", //0
                    "Mengaburkan gambar berdasarkan nilai warna rata-rata dari piksel yang berdekatan. Filter ini berguna untuk menciptakan efek khusus. Anda dapat menyesuaikan ukuran area yang digunakan untuk menghitung nilai rata-rata untuk piksel yang diberikan; radius yang lebih besar menghasilkan buram yang lebih besar", //1
                    "Menambahkan buram ke gambar untuk memberikan efek kedalaman bidang yang lebih sempit sehingga beberapa objek dalam gambar tetap fokus dan area lain menjadi buram.", //2
                    "Mengaburkan dalam arah yang ditentukan (dari –360º hingga + 360º) dan pada intensitas yang ditentukan (dari 1 hingga 999). Efek filter ini analog dengan mengambil gambar objek bergerak dengan waktu pencahayaan tetap", //3
                    "Menggunakan gambar, yang disebut displacement map , untuk menentukan cara mendistorsi pilihan. Misalnya, dengan menggunakan peta perpindahan berbentuk parabola, Anda dapat membuat gambar yang tampak dicetak pada kain yang dipegang sudut-sudutnya.", //4
                    "Membuat gambar tampak seolah-olah dilihat melalui berbagai jenis kaca. Anda dapat memilih efek kaca atau membuat permukaan kaca Anda sendiri sebagai file Photoshop dan menerapkannya. Anda dapat menyesuaikan pengaturan skala, distorsi, dan kelancaran.", //5
                    "Memeras pilihan seleksi. Nilai positif hingga 100% menggeser seleksi ke pusatnya; nilai negatif hingga - 100% menggeser keluar seleksi.", //6
                    "Menciptakan pola bergelombang pada pilihan, seperti riak (ripple) di permukaan kolam. Untuk kontrol yang lebih besar, gunakan filter Wave. Pilihan mencakup jumlah dan ukuran riak.", //7
                    "Mendeteksi ujung-ujungnya dalam gambar (area di mana perubahan warna yang signifikan terjadi) dan mengaburkan semua seleksi kecuali sisi-sisinya. Pengaburan ini menghilangkan kebisingan sambil menjaga detail.",//8
                    "Mengurangi noise pada gambar dengan memadukan kecerahan piksel dalam pilihan. Filter mencari radius seleksi piksel untuk piksel dengan kecerahan yang sama, membuang piksel yang sangat berbeda dari piksel yang berdekatan, dan menggantikan piksel pusat dengan nilai kecerahan median dari piksel yang ditelusuri. Filter ini berguna untuk menghilangkan atau mengurangi efek gerakan pada suatu gambar.", //9
                    "Mengurangi kebisingan sambil mempertahankan tepi berdasarkan pengaturan pengguna yang mempengaruhi gambar keseluruhan atau saluran individual.", //10
                    "Gumpalan piksel warna solid atau serupa ke dalam blok piksel likecolored. Anda dapat menggunakan filter ini untuk membuat gambar yang dipindai tampak dilukis dengan tangan atau untuk membuat gambar yang realistis menyerupai lukisan abstrak.", //11
                    "Mengonversi gambar ke pola acak dari area hitam dan putih atau warna yang sepenuhnya jenuh dalam gambar warna. Untuk menggunakan filter, pilih pola titik dari menu Jenis di kotak dialog Mezzotint.", //12
                    "Gumpalan piksel ke dalam blok persegi. Piksel di blok yang diberikan adalah warna yang sama, dan warna blok mewakili warna dalam pemilihan.", //13
                    "Memecah warna dalam gambar menjadi titik-titik yang ditempatkan secara acak, seperti pada lukisan pointillist, dan menggunakan warna latar belakang sebagai area kanvas di antara titik-titik.", //14
                    "Menghasilkan pola awan lunak menggunakan nilai acak yang bervariasi antara latar depan dan warna latar belakang", //15
                    "Menciptakan tampilan serat tenunan menggunakan warna latar depan dan latar belakang. Anda menggunakan slider Variance untuk mengontrol bagaimana warna bervariasi (nilai yang rendah menghasilkan garis warna yang panjang, dan nilai yang tinggi menghasilkan serat yang sangat pendek dengan distribusi warna yang lebih bervariasi).", //16
                    "Fokuskan pilihan dan tingkatkan kejelasannya. Filter Sharpen More menerapkan efek penajaman yang lebih kuat daripada filter Sharpen.", //17
                    "Pertajam gambar dengan memungkinkan Anda mengatur algoritme penajaman atau mengontrol jumlah penajaman yang terjadi dalam bayangan dan sorotan. Ini adalah cara yang disarankan untuk mempertajam jika Anda tidak memiliki filter penajaman khusus dalam pikiran.", //18
                    "Mengocok piksel dalam seleksi untuk melunakkan fokus sesuai dengan pilihan yang dipilih: Normal memindahkan piksel secara acak (mengabaikan nilai warna), Darken Only menggantikan piksel cahaya dengan yang lebih gelap, dan Lighten Only menggantikan piksel gelap dengan piksel yang lebih terang. Anisotropic mengocok piksel ke arah perubahan warna yang paling sedikit", //19
                    "Membuat pilihan tampak menonjol atau dicap dengan mengubah warna isiannya menjadi abu-abu dan menjiplak ujung-ujungnya dengan warna isian asli. Pilihan termasuk sudut embossing (dari –360 ° ke permukaan reses, hingga + 360 ° untuk menaikkan permukaan), tinggi, dan persentase (1% hingga 500%) untuk jumlah warna dalam pemilihan. Untuk mempertahankan warna dan detail saat embossing, gunakan perintah Fade setelah menerapkan filter Emboss.", //20
                    "Identifikasi area gambar dengan transisi signifikan dan tekankan ujungnya. Seperti filter Trace Counter, Find Edges menguraikan tepi gambar dengan garis-garis gelap dengan latar belakang putih dan berguna untuk membuat perbatasan di sekitar gambar.", //21
                    "Menempatkan garis-garis horizontal kecil di gambar untuk menciptakan efek tertiup angin. Metode termasuk Angin; Ledakan, untuk efek angin yang lebih dramatis; dan Stagger, yang mengimbangi garis pada gambar." //21
            };

    public JenisEfek() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jenis_efek,container,false);

        menu1 = view.findViewById(R.id.blur);
        menu2 = view.findViewById(R.id.distort);
        menu3 = view.findViewById(R.id.noise);
        menu4 = view.findViewById(R.id.pixelate);
        menu5 = view.findViewById(R.id.render);
        menu6 = view.findViewById(R.id.sharpen);
        menu7 = view.findViewById(R.id.stylize);
        sub1 = view.findViewById(R.id.subBlur);
        sub2 = view.findViewById(R.id.subDistort);
        sub3 = view.findViewById(R.id.subNoise);
        sub4 = view.findViewById(R.id.subPixelate);
        sub5 = view.findViewById(R.id.subRender);
        sub6 = view.findViewById(R.id.subSharpen);
        sub7 = view.findViewById(R.id.subStyle);
        teks = view.findViewById(R.id.filterPengantar);

        //Definisi Sub Menu

        blur1 = view.findViewById(R.id.blurAverage);
        blur2 = view.findViewById(R.id.blurBoxBlur);
        blur3 = view.findViewById(R.id.blurLensBlur);
        blur4 = view.findViewById(R.id.blurMotionBlur);

        dis1 = view.findViewById(R.id.distortDisplace);
        dis2 = view.findViewById(R.id.distortGlass);
        dis3 = view.findViewById(R.id.distortPinch);
        dis4 = view.findViewById(R.id.distortRipple);

        nois1 = view.findViewById(R.id.noiseDespeckle);
        nois2 = view.findViewById(R.id.noiseMedian);
        nois3 = view.findViewById(R.id.noiseReduceNoise);

        pix1 = view.findViewById(R.id.pixelateFacet);
        pix2 = view.findViewById(R.id.pixelateMezzotint);
        pix3 = view.findViewById(R.id.pixelateMosaic);
        pix4 = view.findViewById(R.id.pixelatePointillize);

        ren1 = view.findViewById(R.id.renderClouds);
        ren2 = view.findViewById(R.id.renderFibers);

        shar1 = view.findViewById(R.id.sharpenSharpenandSharpenMore);
        shar2 = view.findViewById(R.id.sharpenSmartSharpen);

        style1 = view.findViewById(R.id.stylizeDiffuse);
        style2 = view.findViewById(R.id.stylizeEmboss);
        style3 = view.findViewById(R.id.stylizeFindEdges);
        style4 = view.findViewById(R.id.stylizeWind);


        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks.setText("FILTER BLUR\n" +
                        "      Filter Blur mempermudah pemilihan atau seluruh gambar, dan berguna untuk retouching. Mereka memuluskan transisi dengan rata-rata piksel di samping tepi keras garis yang ditentukan dan area yang diarsir dalam gambar. Beberapa jenis filter didalamnya antara lain:");
                sub1.setVisibility(View.VISIBLE);
                sub2.setVisibility(View.GONE);
                sub3.setVisibility(View.GONE);
                sub4.setVisibility(View.GONE);
                sub5.setVisibility(View.GONE);
                sub6.setVisibility(View.GONE);
                sub7.setVisibility(View.GONE);

            }
        });
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks.setText("FILTER DISTORT" +
                        "\n        Distort menyaring secara geometris mendistorsi gambar, menciptakan efek pembentukan ulang 3D atau lainnya. Beberapa jenis filter didalamnya antara lain:");
                sub1.setVisibility(View.GONE);
                sub2.setVisibility(View.VISIBLE);
                sub3.setVisibility(View.GONE);
                sub4.setVisibility(View.GONE);
                sub5.setVisibility(View.GONE);
                sub6.setVisibility(View.GONE);
                sub7.setVisibility(View.GONE);

            }
        });
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks.setText("FITLER NOISE" +
                        "\n         Filter Noise menambahkan atau menghilangkan noise , atau piksel dengan tingkat warna terdistribusi secara acak. Ini membantu memadukan seleksi ke piksel sekitarnya. Filter noise dapat membuat tekstur yang tidak biasa atau menghilangkan area masalah, seperti debu dan goresan. Beberapa jenis filter didalamnya antara lain:");
                sub1.setVisibility(View.GONE);
                sub2.setVisibility(View.GONE);
                sub3.setVisibility(View.VISIBLE);
                sub4.setVisibility(View.GONE);
                sub5.setVisibility(View.GONE);
                sub6.setVisibility(View.GONE);
                sub7.setVisibility(View.GONE);

            }
        });
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks.setText("FILTER PIXELATE" +
                        "\n         Beberapa jenis filter didalamnya antara lain:");
                sub1.setVisibility(View.GONE);
                sub2.setVisibility(View.GONE);
                sub3.setVisibility(View.GONE);
                sub4.setVisibility(View.VISIBLE);
                sub5.setVisibility(View.GONE);
                sub6.setVisibility(View.GONE);
                sub7.setVisibility(View.GONE);

            }
        });
        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks.setText("FILTER RENDER" +
                        "\n         Filter Render membuat bentuk 3D, pola awan, pola pembiasan, dan pantulan cahaya yang disimulasikan dalam sebuah gambar. Anda juga dapat memanipulasi objek dalam ruang 3D, membuat objek 3D (kubus, bola, dan silinder), dan membuat tekstur mengisi dari file grayscale untuk menghasilkan efek seperti 3D untuk pencahayaan.Beberapa jenis filter didalamnya antara lain:");
                sub1.setVisibility(View.GONE);
                sub2.setVisibility(View.GONE);
                sub3.setVisibility(View.GONE);
                sub4.setVisibility(View.GONE);
                sub5.setVisibility(View.VISIBLE);
                sub6.setVisibility(View.GONE);
                sub7.setVisibility(View.GONE);

            }
        });
        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks.setText("FILTER SHARPEN" +
                        "\n         Filter Sharpen fokus memfokuskan gambar dengan meningkatkan kontras piksel yang berdekatan. Beberapa jenis filter didalamnya antara lain:");
                sub1.setVisibility(View.GONE);
                sub2.setVisibility(View.GONE);
                sub3.setVisibility(View.GONE);
                sub4.setVisibility(View.GONE);
                sub5.setVisibility(View.GONE);
                sub6.setVisibility(View.VISIBLE);
                sub7.setVisibility(View.GONE);

            }
        });
        menu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teks.setText("FILTER STYLIZE" +
                        "\n         Filter Stylize menghasilkan efek dicat atau impresionistik pada pilihan dengan menggusur piksel dan dengan mencari dan mempertinggi kontras pada gambar. Setelah menggunakan filter seperti Find Edges dan Trace Contour yang menyorot ujungnya, Anda dapat menerapkan perintah Invert untuk menguraikan tepi gambar warna dengan garis berwarna atau untuk menguraikan tepi gambar grayscale dengan garis putih. Beberapa jenis filter didalamnya antara lain:");
                sub1.setVisibility(View.GONE);
                sub2.setVisibility(View.GONE);
                sub3.setVisibility(View.GONE);
                sub4.setVisibility(View.GONE);
                sub5.setVisibility(View.GONE);
                sub6.setVisibility(View.GONE);
                sub7.setVisibility(View.VISIBLE);

            }
        });

        blur1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[0], img[0], desk[0]);

            }
        });
        blur2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[1], img[1], desk[1]);

            }
        });
        blur3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[2], img[2], desk[2]);

            }
        });
        blur4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[3], img[3], desk[3]);

            }
        });
        dis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[4], img[4], desk[4]);

            }
        });
        dis2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[5], img[5], desk[5]);

            }
        });
        dis3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[6], img[6], desk[6]);

            }
        });
        dis4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[7], img[7], desk[7]);

            }
        });
       nois1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[8], img[8], desk[8]);

            }
        });
       nois2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[9], img[9], desk[9]);

            }
        });
       nois3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[10], img[10], desk[10]);

            }
        });
       pix1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[11], img[11], desk[11]);

            }
        });
       pix2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[12], img[12], desk[12]);

            }
        });
       pix3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[13], img[13], desk[13]);

            }
        });
       pix4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[14], img[14], desk[14]);

            }
        });
       ren1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[15], img[15], desk[15]);

            }
        });
       ren2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[16], img[16], desk[16]);

            }
        });
       shar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[17], img[17], desk[17]);

            }
        });
       shar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[18], img[18], desk[18]);

            }
        });
       style1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[19], img[19], desk[19]);

            }
        });
       style2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[20], img[20], desk[20]);

            }
        });
       style3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[21], img[21], desk[21]);

            }
        });
       style4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(title[22], img[22], desk[22]);

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
