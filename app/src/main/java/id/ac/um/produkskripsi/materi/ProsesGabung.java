package id.ac.um.produkskripsi.materi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import id.ac.um.produkskripsi.MainActivity;
import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.materi.submateri.DetailMateri;

public class ProsesGabung extends AppCompatActivity {
    String judul[] = new String[]{"Pergantian Background","Apel Bermulut Singa", "Membuat Kartu Nama"};
    String key[] = new String[]{"_J-pqK3g4v0","apel singa","kartu nama" };
    String isi[] = new String[]{
            "Ada beberapa cara untuk mengganti backround foto menggunakan photoshop. \n" +
                    "Langkah – langkahnya yaitu : \n" +
                    "1.\tCara Pertama : \n" +
                    "\t-\tKlik aplikasi adobe photoshop + Control N ( New )\n" +
                    "\t-\tBuka foto yang akan di edit, pilih file – Open atau Control O. \n" +
                    "\t-\tKlik 2X pada backround yang ada pada layer agar gembok pada layer tersebut hilang.\n" +
                    "\t-\tPilih Pen Tool, tekan P pada keyboard (atau menggunakan selection tool yang lain). -Seleksi atau membuat garis pada objek dengan Pen Toll. \n" +
                    "\t-\tJika selesai diseleksi silakan tekan tombol Delete yang ada pada keyboard. \n" +
                    "\t-\tJika ingin menghilangkan seleksi tersebut , kita bisa mencoba dengan klik Ctrl D (deselect)\n" +
                    "\t-\tSetelah semua selesai silakan masukan background yang kita inginkan. Dengan cara Ctrl O lalu kita Copy ke foto yang sudah kita edit Lalu Ctrl V.\n" +
                    "\t-\tKlik dan drag layer sehingga paling bawah \n" +
                    "\t-\tSudah selesai. \n" +
                    "Dan save dengan tipe jpg \n\n" +
                    "2.\tUntuk Mengubah warna background hampir sama dengan cara diatas cuma perbedaannya terletak di backgroundnya. Kalau cara diatas mengimport background untuk dijadikan background foto maka kalau merubah background menjadi warna solid tinggal diberikan layer baru dengan warna yang diinginkan kemudian taruh layer tersebut dibagian bawah\n",
    };
    int[] tumbnail = new int[]{
            R.drawable.pikir,
            R.drawable.efek_reduce,
            R.drawable.efek_median
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses_gabung);

        ListView listView = findViewById(R.id.listTutor);
        ListAdapter listAdapter = new id.ac.um.produkskripsi.adapter.ListAdapter(this,judul, tumbnail);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(ProsesGabung.this, DetailMateri.class);
                mIntent.putExtra("judul", judul[i]);
                mIntent.putExtra("gambar", tumbnail[i]);
                mIntent.putExtra("youtube", key[i]);
                mIntent.putExtra("isi", isi[i]);
                startActivity(mIntent);
            }
        });

    }
}
