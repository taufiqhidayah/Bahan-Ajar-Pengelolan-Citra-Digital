package id.ac.um.produkskripsi.kuis;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.um.produkskripsi.R;

public class Quiz extends AppCompatActivity {

    private QuestionBank mQuestionLibrary = new QuestionBank();
    private TextView mScoreView;   // Untuk menampilkan skor saat ini
    private TextView mQuestionView;  //menampilkan jawaban
    private Button mButtonChoice1; // jawaban 1
    private Button mButtonChoice2; // jawaban 2
    private Button mButtonChoice3; //jawaban 3
    private Button mButtonChoice4; //jawaban 4

    private String mAnswer;  // untuk cek jawaban benar atau tidaknya
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; //

    String[] title = {
            "Rectangular Marquee tool",
            "Elliptical Marquee tool",
            "Lasso tool",
            "Polygonal Lasso tool",
            "Magnetic Lasso tool",
            "Magic Wand tool",
            "Quick Selection tool",
            "Selection Brush tool",
            "Smart Brush tool"
    };

    String[] deskripsi = {
            "Menggambar batas seleksi persegi atau persegi panjang.",
            "Menggambar batas seleksi bulat atau elips.",
            "Menggambar batas pemilihan tangan bebas, yang terbaik untuk presisi.",
            "Menggambar beberapa segmen bermata lurus dari batas seleksi.",
            "Menggambar batas seleksi yang secara otomatis terkunci ke tepi saat Anda menyeret ke dalam foto.",
            "Memilih piksel dengan warna yang sama dengan satu klik",
            "Secara cepat dan otomatis membuat pemilihan berdasarkan warna dan tekstur saat anda mengeklik atau mengeklik-seret suatu area.",
            "Secara otomatis memilih atau membatalkan pilihan area yang Anda cat, tergantung pada apakah Anda berada dalam mode Sselection atau Mask.",
            "Menerapkan warna dan penyesuaian warna dan efek ke pilihan. Alat ini secara otomatis membuat lapisan penyesuaian untuk pengeditan non-destruktif."
    };

    int[] mThumbIds = {
            R.drawable.se1,
            R.drawable.se2,
            R.drawable.se3,
            R.drawable.se4,
            R.drawable.se5,
            R.drawable.se6,
            R.drawable.se7,
            R.drawable.se8,
            R.drawable.se9
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz);
        //
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        updateQuestion();

        updateScore(mScore);
    }

    private void updateQuestion() {
        //
        if (mQuestionNumber < mQuestionLibrary.getLength()) {

            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber, 4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else {
            Toast.makeText(Quiz.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Quiz.this, HighestScore.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
            Quiz.this.finish();
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore + "/" + mQuestionLibrary.getLength());
    }

    public void onClick(View view) {
        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer) {
            mScore = mScore + 1;
            showDialog(title[mQuestionNumber-1],mThumbIds[mQuestionNumber-1],deskripsi[mQuestionNumber-1]);
        } else
            Toast.makeText(Quiz.this, "Salah!", Toast.LENGTH_SHORT).show();

        updateScore(mScore);
        updateQuestion();
    }

    protected void showDialog(String jdl, int img, String desk){

        Dialog dialog = new Dialog(Quiz.this);
        dialog.setCancelable(true);

        View view  = Quiz.this.getLayoutInflater().inflate(R.layout.grid_dialog, null);
        dialog.setContentView(view);

        TextView title = view.findViewById(R.id.titleGrid);
        TextView deskripsi = view.findViewById(R.id.deskripsGrid);
        ImageView gambar = view.findViewById(R.id.imageGrid);
        title.setText(jdl);
        gambar.setImageResource(img);
        deskripsi.setText(desk);

        dialog.show();
    };

}
