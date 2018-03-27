package id.ac.um.produkskripsi.materiActivity;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.um.produkskripsi.R;

public class PengertianCitra extends AppCompatActivity {
    Spinner bit;
    String[] jmlbit;
    RadioGroup radioGroup;
    TextView bitwarna, ekstensi;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengertian_citra);

        bit = findViewById(R.id.spinner);
        bitwarna = findViewById(R.id.bitw);
        ekstensi = findViewById(R.id.ekstensi);
        radioGroup = findViewById(R.id.eks);
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
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.bmp:
                if (checked)
                    ekstensi.setText("Bitmap adalah representasi dari citra grafis yang terdiri dari susunan titik (pixel) yang tersimpan di memori komputer. Nilai setiap titik diawali oleh satu bit data (untuk gambar hitam putih) atau lebih (untuk gambar berwarna). Kerapatan titik-titik tersebut dinamakan resolusi, yang menunjukkan seberapa tajam gambar ini ditampilkan, ditunjukkan dengan jumlah baris dan kolom (contoh 1024×768).\n\n" +
                            "Gambar bitmap sangat bergantung pada resolusi. Jika gambar diperbesar maka gambar akan tampak kurang halus atau pecah, sehingga mengurangi detailnya. Selain itu gambar bitmap akan mempunyai ukuran file yang lebih besar. Semakin besar resolusi gambar akan semakin besar pula ukuran filenya.");
                break;
            case R.id.jpg:
            if (checked) {
                ekstensi.setText("JPG adalah jenis data yang dikembangkan oleh Joint Photographic Experts Assemble (JPEG) yang dijadikan standar untuk para fotografer profesional. Seperti metode yang digunakan oleh format ZIP yang digunakan untuk menemukan pengulangan (redundancy) dalam data untuk kemudian dikompresi, JPG mengompresi data gambar dengan cara mengurangi bagian-bagian dari gambar untuk memblok pixel dalam gambar tersebut. Kompresi JPG mempunyai kekurangan yang bersifat permanen, namun teknologi ini hanya digunakan untuk menyimpan data yang besar di media penyimpanan yang terbatas, bukan untuk manipulasi foto.\n\n" +
                            "JPG mendukung 24-bit RGB dan CMYK, dan 8-bit Grayscale. Tidak disarankan untuk Anda menggunakan palet CMYK dalam format JPG. Perlu dicatat juga bahwa Grayscale tidak banyak dikompres jika dibandingkan dengan versi berwarnanya.");
                }
            break;
            case R.id.gif:
                if (checked) {
                    ekstensi.setText("GIF (Graphics Interchange Format) secara alami adalah gambar dengan 8-bit warna, berarti mereka dibatasi oleh palet sebanyak 256 jenis warna, yang dapat dipilih dari model RGB dan disimpan ke Color Look Up Tablet (CLUT), atau sederhananya “Color Table“. Mereka itu sejatinya adalah palet warna standar, seperti palet “Web Safe“.\n" +
                            "GIF merupakan format grafis yang sering digunakan pada desain web. GIF memiliki kombinasi warna lebih sedikit dibanding JPEG, tetapi mampu menyimpan grafis dengan latar belakang transparan ataupun dalam bentuk animasi sederhana.\n\n" +
                            "File GIF cocok digunakan untuk gambar dengan jumlah warna sedikit (dibawah 256), gambar yang memerlukan perbedaan warna yang tegas seperti logo tanpa gradien, gambar animasi sederhana seperti banner-banner iklan, header, dan sebagainya. Tidak cocok digunakan untuk gambar yang memiliki banyak warna seperti pemandangan, gambar yang didalamnya terdapat warna gradien atau semburat.");
                }
                break;
            case R.id.pcx:
                if (checked) {
                    ekstensi.setText("Sebuah file PCX adalah format file berbentuk raster; kepala filenya menyimpan informasi tentang perangkat keras monitor (resolusi layar, kedalaman warna, informasi palet, jumlah bit dst.) secara terpisah dari gambarnya. Hal ini membuat sebuah file PCX dapat dipindahkan dan dibuka di perangkat komputer lain dengan perangkat keras yang berbeda. Sebuah file PCX biasanya dapat menyimpan gambar-gambar dengan indeks palet 2 hingga 4 bit dan 16 hingga 256 warna, namun sekarang telah ditambah untuk menyimpan gambar-gambar true color (24-bit).");
                }
                break;
            case R.id.png:
            if (checked) {
                ekstensi.setText("PNG adalah kepanjangan dari Portable Network Graphics atau bisa diplesetkan menjadi “PNG-Nοt-GIF“. Dikembangkan sebagai alternatif lain untuk GIF, yang menggunakan paten dari LZW–algoritma kompresi. PNG adalah format gambar yang sangat baik untuk grafis internet, karena mendukung transparansi didalam perambah (browser) dan memiliki keindahan tersendiri yang tidak bisa diberikan GIF atau bahkan JPG. Bisa disebut sebagai salah satu format yang merupakan gabungan dari format JPG dan GIF. Untuk tipe ini mampu untuk gradiasi warna.\n\n" +
                            "Karena sifat transparannya yang tidak pecah-pecah, PNG yang masuk kelas 24-bit ini cocok untuk membuat screenshoot.\n" +
                            "Kelebihan file PNG adalah adanya warna transparan dan alpha. Warna alpha memungkinkan sebuah gambar transparan, tetapi gambar tersebut masih dapat dilihat mata seperti samar-samar atau bening. File PNG dapat diatur jumlah warnanya hingga 64 bit (true color + alpha) sampai indexed color 1 bit. Dengan jumlah warna yang sama, kompresi file PNG lebih baik daripada GIF, tetapi memiliki ukuran file yang lebih besar daripada JPG. Kekurangan tipe PNG adalah belum populer sehingga sebagian browser tidak mendukungnya.");
            }
            break;
            case R.id.tiff:
            if (checked) {
                ekstensi.setText("TIFF merupakan format gambar terbaik dengan pengertian bahwa semua data dan informasi (data RGB, data CMYK, dan lainnya) yang berkaitan dengan koreksi atau manipulasi terhadap gambar tersebut tidak hilang. Format TIFF biasa digunakan untuk kebutuhan pencetakan dengan kualitas gambar yang sangat tinggi sehingga ukuran berkas untuk format ini biasanya sangat besar, karena dalam file ini gambar tidak dikompresi. Format ini mampu menyimpan gambar dengan kualitas hingga 32 bit. \n" +
                        "Format berkas TIFF juga dapat digunakan untuk keperluan pertukaran antar platform (PC, Macintosh, dan Silicom Graphic). \n" +
                        "Format ini juga mudah digunakan untuk transfer antar program.");
            }
            break;
        }
    }
}
