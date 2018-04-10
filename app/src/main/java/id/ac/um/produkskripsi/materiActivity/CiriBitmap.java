package id.ac.um.produkskripsi.materiActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

import id.ac.um.produkskripsi.R;

public class CiriBitmap extends AppCompatActivity {

    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciri_bitmap);
        gambar = findViewById(R.id.imageciri);

    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ciri1:
                if (checked)
                    gambar.setVisibility(View.VISIBLE);
                break;
        }
    }

}
