package id.ac.um.produkskripsi.materi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import id.ac.um.produkskripsi.R;

public class ProsesGabung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proses_gabung);
        Intent b = getIntent();
        String a="a";
        String judul = b.getStringExtra("k");
        String img = b.getStringExtra("a");
        Toast.makeText(this, judul, Toast.LENGTH_SHORT).show();


    }
}
