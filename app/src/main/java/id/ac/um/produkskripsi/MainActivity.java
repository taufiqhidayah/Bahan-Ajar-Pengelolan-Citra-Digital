package id.ac.um.produkskripsi;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence;
import com.getkeepsafe.taptargetview.TapTargetView;

import id.ac.um.produkskripsi.listdata.VideoYoutube;

public class MainActivity extends AppCompatActivity {

    CardView materi1, materi2, materi3, fitur;
    Intent temp;
    Bundle materi;
    FloatingActionButton about;
    TapTargetSequence sequence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = MediaPlayer.create(this,R.raw.btn);
        materi1 = findViewById(R.id.menu1);
        materi2 = findViewById(R.id.menu2);
        materi3 = findViewById(R.id.menu3);
        fitur = findViewById(R.id.menu4);
        about = findViewById(R.id.info);
        materi = new Bundle();
        final String a="satu";
        final String b="dua";
        final String c="tiga";

        sequence = new TapTargetSequence(this)
                .targets(

                        TapTarget.forView(findViewById(R.id.iconmenu),"Materi","Setiap Materi Terdapat Sub Materi")
                                .outerCircleColor(R.color.LightBlue)
                                .dimColor(R.color.black)
                                .targetCircleColor(R.color.white)
                                .titleTextColor(R.color.white)
                                .titleTextSize(20)
                                .descriptionTextColor(R.color.white)
                                .descriptionTextSize(18)
                                .transparentTarget(true)
                                .targetRadius(25)
                                .id(1),

                        TapTarget.forView(findViewById(R.id.icontambahan),"Referensi","Berguna Untuk Menambah Wawasan")
                                .outerCircleColor(R.color.LightBlue)
                                .dimColor(R.color.black)
                                .targetCircleColor(R.color.white)
                                .titleTextColor(R.color.white)
                                .titleTextSize(20)
                                .descriptionTextColor(R.color.white)
                                .descriptionTextSize(18)
                                .transparentTarget(true)
                                .targetRadius(25)
                                .id(2)

                ).listener(new TapTargetSequence.Listener() {
                    @Override
                    public void onSequenceFinish() {

                    }

                    @Override
                    public void onSequenceStep(TapTarget lastTarget, boolean targetClicked) {

                    }

                    @Override
                    public void onSequenceCanceled(TapTarget lastTarget) {

                    }
                });

        TapTargetView.showFor(this, TapTarget.forView(findViewById(R.id.info), "About", "Untuk Mengetahui Profil dari Creator")
                        .outerCircleColor(R.color.LightBlue)
                        .dimColor(R.color.black)
                        .targetCircleColor(R.color.white)
                        .titleTextColor(R.color.white)
                        .titleTextSize(20)
                        .targetRadius(25)
                        .descriptionTextColor(R.color.white)
                        .descriptionTextSize(18)
                        .transparentTarget(true),
                new TapTargetView.Listener(){
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        sequence.start();
                    }
                }
        );

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                showDialog();
            }
        });

        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                temp = new Intent(MainActivity.this, CitraBitmap.class);
                 temp.putExtra(CitraBitmap.KEYMENU1,a);
                startActivity(temp);
            }
        });

        materi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                temp= new Intent(MainActivity.this, CitraBitmap.class);
                    temp.putExtra(CitraBitmap.KEYMENU1,b);
                startActivity(temp);

            }
        });
        materi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                temp= new Intent(MainActivity.this, CitraBitmap.class);
                    temp.putExtra(CitraBitmap.KEYMENU1,c);
                startActivity(temp);

            }
        });

        fitur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                temp= new Intent(MainActivity.this, Referensi.class);
                startActivity(temp);
            }
        });

    }

    protected void showDialog(){

        Dialog dialog = new Dialog(this);
        dialog.setCancelable(true);

        View view  = this.getLayoutInflater().inflate(R.layout.about, null);
        dialog.setContentView(view);

        dialog.show();
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_quit, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit) {
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

        return super.onOptionsItemSelected(item);
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
