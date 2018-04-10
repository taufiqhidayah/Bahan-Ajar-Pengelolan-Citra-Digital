package id.ac.um.produkskripsi.materiActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.um.produkskripsi.R;

public class AplikasiBitmap extends AppCompatActivity {

    CardView keterangan;
    TextView ketps;
    ImageView ps, corel, paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplikasi_bitmap);
        keterangan = findViewById(R.id.keterangan);
        ketps = findViewById(R.id.penjelasan);
        ps = findViewById(R.id.aplps);
        corel= findViewById(R.id.aplcorel);
        paint= findViewById(R.id.aplpaint);

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keterangan.setVisibility(View.VISIBLE);
            }
        });
    }
}
