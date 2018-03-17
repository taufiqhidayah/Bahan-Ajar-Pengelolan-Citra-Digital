package id.ac.um.produkskripsi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends Activity {
    private TextView present, level;
    private ImageView logo;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        present = findViewById(R.id.present);
        level = findViewById(R.id.level);
        logo = findViewById(R.id.logo);

        Animation trans = AnimationUtils.loadAnimation(this,R.anim.transition);

        present.startAnimation(trans);
        level.startAnimation(trans);
        logo.startAnimation(trans);

        pindah = new Intent(this,MainActivity.class);

        Thread timer = new Thread(){
            public void run (){
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(pindah);
                    finish();
                }
            }
        };
        timer.start();
    }
}
