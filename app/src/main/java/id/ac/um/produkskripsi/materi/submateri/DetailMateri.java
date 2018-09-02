package id.ac.um.produkskripsi.materi.submateri;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.um.produkskripsi.R;
import id.ac.um.produkskripsi.listdata.VideoYoutube;

public class DetailMateri extends AppCompatActivity {

    TextView title, isi;
    Button view;
    ImageView tumb;
    static MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_materi);

        title = findViewById(R.id.judulTutor);
        tumb = findViewById(R.id.gbrMateri);
        isi = findViewById(R.id.isiTutor);
        view = findViewById(R.id.lihatTutor);

        final Bundle mBundle = getIntent().getExtras();
        title.setText(mBundle.getString("judul"));
//            tumb.setImageResource(mBundle.getInt("gambar"));
        isi.setText(mBundle.getString("isi"));
        tumb.setImageResource(mBundle.getInt("gambar"));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent temp= new Intent(DetailMateri.this, VideoYoutube.class);
                    temp.putExtra(VideoYoutube.VIDEO_ID,mBundle.getString("youtube"));
                startActivity(temp);

            }
        });
    }
}
