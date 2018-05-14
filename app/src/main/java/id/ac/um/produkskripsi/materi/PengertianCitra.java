package id.ac.um.produkskripsi.materi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import id.ac.um.produkskripsi.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PengertianCitra extends android.app.Fragment {
    Spinner bit;
    String[] jmlbit;
    RadioGroup radioGroup;
    TextView bitwarna, ekstensi;

    private RadioGroup mFirstGroup;
    private RadioGroup mSecondGroup;
    private boolean isChecking = true;


    public PengertianCitra() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pengertian_citra, container, false);
        bit = view.findViewById(R.id.spinner);
        bitwarna = view.findViewById(R.id.bitw);
        ekstensi = view.findViewById(R.id.ekstensi);
        radioGroup = view.findViewById(R.id.eks);
        mFirstGroup = view.findViewById(R.id.eks);
        mSecondGroup = view.findViewById(R.id.eks2);

        jmlbit = getResources().getStringArray(R.array.bit);
        bit.setPrompt("Pilih jumlah bit");
        bit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                long jml = Integer.parseInt(jmlbit[i]);
                bitwarna.setText("Maksimum warna = "+Math.pow(2,jml));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                bitwarna.setText("Pilih Jumlah Bit");

            }
        });

        mFirstGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mSecondGroup.clearCheck();
                }
                isChecking = true;

                switch (checkedId) {
                    case R.id.bmp:
                        ekstensi.setText("Bitmap adalah representasi dari citra grafis yang terdiri dari susunan titik (pixel) yang tersimpan di memori komputer. Nilai setiap titik diawali oleh satu bit data (untuk gambar hitam putih) atau lebih (untuk gambar berwarna). Kerapatan titik-titik tersebut dinamakan resolusi, yang menunjukkan seberapa tajam gambar ini ditampilkan, ditunjukkan dengan jumlah baris dan kolom (contoh 1024×768).\n\n" +
                                "Gambar bitmap sangat bergantung pada resolusi. Jika gambar diperbesar maka gambar akan tampak kurang halus atau pecah, sehingga mengurangi detailnya. Selain itu gambar bitmap akan mempunyai ukuran file yang lebih besar. Semakin besar resolusi gambar akan semakin besar pula ukuran filenya.");
                        break;
                    case R.id.jpg:
                        ekstensi.setText("JPG adalah jenis data yang dikembangkan oleh Joint Photographic Experts Assemble (JPEG) yang dijadikan standar untuk para fotografer profesional. Seperti metode yang digunakan oleh format ZIP yang digunakan untuk menemukan pengulangan (redundancy) dalam data untuk kemudian dikompresi, JPG mengompresi data gambar dengan cara mengurangi bagian-bagian dari gambar untuk memblok pixel dalam gambar tersebut. Kompresi JPG mempunyai kekurangan yang bersifat permanen, namun teknologi ini hanya digunakan untuk menyimpan data yang besar di media penyimpanan yang terbatas, bukan untuk manipulasi foto.\n\n" +
                                "JPG mendukung 24-bit RGB dan CMYK, dan 8-bit Grayscale. Tidak disarankan untuk Anda menggunakan palet CMYK dalam format JPG. Perlu dicatat juga bahwa Grayscale tidak banyak dikompres jika dibandingkan dengan versi berwarnanya.");
                        break;
                    case R.id.gif:
                        ekstensi.setText("GIF (Graphics Interchange Format) secara alami adalah gambar dengan 8-bit warna, berarti mereka dibatasi oleh palet sebanyak 256 jenis warna, yang dapat dipilih dari model RGB dan disimpan ke Color Look Up Tablet (CLUT), atau sederhananya “Color Table“. Mereka itu sejatinya adalah palet warna standar, seperti palet “Web Safe“.\n" +
                                "GIF merupakan format grafis yang sering digunakan pada desain web. GIF memiliki kombinasi warna lebih sedikit dibanding JPEG, tetapi mampu menyimpan grafis dengan latar belakang transparan ataupun dalam bentuk animasi sederhana.\n\n" +
                                "File GIF cocok digunakan untuk gambar dengan jumlah warna sedikit (dibawah 256), gambar yang memerlukan perbedaan warna yang tegas seperti logo tanpa gradien, gambar animasi sederhana seperti banner-banner iklan, header, dan sebagainya. Tidak cocok digunakan untuk gambar yang memiliki banyak warna seperti pemandangan, gambar yang didalamnya terdapat warna gradien atau semburat.");
                        break;

                }
            }
        });

        mSecondGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId != -1 && isChecking) {
                    isChecking = false;
                    mFirstGroup.clearCheck();
                }
                isChecking = true;

                switch (checkedId) {
                    case R.id.pcx:
                            ekstensi.setText("Sebuah file PCX adalah format file berbentuk raster; kepala filenya menyimpan informasi tentang perangkat keras monitor (resolusi layar, kedalaman warna, informasi palet, jumlah bit dst.) secara terpisah dari gambarnya. Hal ini membuat sebuah file PCX dapat dipindahkan dan dibuka di perangkat komputer lain dengan perangkat keras yang berbeda. Sebuah file PCX biasanya dapat menyimpan gambar-gambar dengan indeks palet 2 hingga 4 bit dan 16 hingga 256 warna, namun sekarang telah ditambah untuk menyimpan gambar-gambar true color (24-bit).");
                        break;
                    case R.id.png:
                            ekstensi.setText("PNG adalah kepanjangan dari Portable Network Graphics atau bisa diplesetkan menjadi “PNG-Nοt-GIF“. Dikembangkan sebagai alternatif lain untuk GIF, yang menggunakan paten dari LZW–algoritma kompresi. PNG adalah format gambar yang sangat baik untuk grafis internet, karena mendukung transparansi didalam perambah (browser) dan memiliki keindahan tersendiri yang tidak bisa diberikan GIF atau bahkan JPG. Bisa disebut sebagai salah satu format yang merupakan gabungan dari format JPG dan GIF. Untuk tipe ini mampu untuk gradiasi warna.\n\n" +
                                    "Karena sifat transparannya yang tidak pecah-pecah, PNG yang masuk kelas 24-bit ini cocok untuk membuat screenshoot.\n" +
                                    "Kelebihan file PNG adalah adanya warna transparan dan alpha. Warna alpha memungkinkan sebuah gambar transparan, tetapi gambar tersebut masih dapat dilihat mata seperti samar-samar atau bening. File PNG dapat diatur jumlah warnanya hingga 64 bit (true color + alpha) sampai indexed color 1 bit. Dengan jumlah warna yang sama, kompresi file PNG lebih baik daripada GIF, tetapi memiliki ukuran file yang lebih besar daripada JPG. Kekurangan tipe PNG adalah belum populer sehingga sebagian browser tidak mendukungnya.");
                        break;
                    case R.id.tiff:
                            ekstensi.setText("TIFF merupakan format gambar terbaik dengan pengertian bahwa semua data dan informasi (data RGB, data CMYK, dan lainnya) yang berkaitan dengan koreksi atau manipulasi terhadap gambar tersebut tidak hilang. Format TIFF biasa digunakan untuk kebutuhan pencetakan dengan kualitas gambar yang sangat tinggi sehingga ukuran berkas untuk format ini biasanya sangat besar, karena dalam file ini gambar tidak dikompresi. Format ini mampu menyimpan gambar dengan kualitas hingga 32 bit. \n" +
                                    "Format berkas TIFF juga dapat digunakan untuk keperluan pertukaran antar platform (PC, Macintosh, dan Silicom Graphic). \n" +
                                    "Format ini juga mudah digunakan untuk transfer antar program.");
                        break;
                }
            }
        });
        return view;
    }

}
