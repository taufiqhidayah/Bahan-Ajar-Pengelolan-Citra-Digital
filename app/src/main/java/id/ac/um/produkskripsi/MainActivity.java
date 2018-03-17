package id.ac.um.produkskripsi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView materi1, materi2, materi3, fitur;
    Intent temp;
    Bundle materi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materi1 = findViewById(R.id.menu1);
        materi2 = findViewById(R.id.menu2);
        materi3 = findViewById(R.id.menu3);
        fitur = findViewById(R.id.menu4);
        materi = new Bundle();
        final String a="satu";
        final String b="dua";
        final String c="tiga";

        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = new Intent(MainActivity.this, CitraBitmap.class);
                 temp.putExtra(CitraBitmap.KEYMENU1,a);
                startActivity(temp);
            }
        });

        materi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp= new Intent(MainActivity.this, CitraBitmap.class);
                    temp.putExtra(CitraBitmap.KEYMENU1,b);
                startActivity(temp);

            }
        });
        materi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = new Intent(getApplicationContext(),CitraBitmap.class);
                startActivity(temp);

            }
        });


    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Yakin ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak",null)
                .show();
    }

}
