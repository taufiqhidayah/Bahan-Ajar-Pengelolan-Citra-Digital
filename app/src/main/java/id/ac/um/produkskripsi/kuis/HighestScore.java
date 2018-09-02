package id.ac.um.produkskripsi.kuis;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import id.ac.um.produkskripsi.R;

/**
 * Created by PROVIDER on 17/05/2018.
 */

public class HighestScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_highest);

        TextView txtScore = (TextView) findViewById(R.id.textScore);
        TextView txtHighScore = (TextView) findViewById(R.id.textHighScore);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        txtScore.setText("Your score: " + score);

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("highscore",0);
        if(highscore>= score)
            txtHighScore.setText("High score: "+highscore);
        else
        {
            txtHighScore.setText("New highscore: "+score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }
    }

    public void onClick(View view) {
        Intent intent = new Intent(HighestScore.this, Quiz.class);
        startActivity(intent);
        HighestScore.this.finish();
    }
}

