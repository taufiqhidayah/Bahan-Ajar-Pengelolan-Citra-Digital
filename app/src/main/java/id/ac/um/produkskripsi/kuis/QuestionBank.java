package id.ac.um.produkskripsi.kuis;

/**
 * Created by PROVIDER on 17/05/2018.
 */

public class QuestionBank {

    private String textQuestions [] = {
            "1. Berikut merupakan beberapa format file bitmap yang umum digunakan saat, kecuali?",
            "2. Jenis gambar yang apabila diperbesar gambarnya maka akan terlihat kasar (pecah) merupakan jenis gambar?",
            "3. Berikut merupakan beberapa aplikasi pengolah gambar bitmap/raster, kecuali?",
            "4. Sifatnya transparan yang tidak pecah-pecah, Kelebihannya adalah adanya warna transparan dan alpha. Warna alpha memungkinkan sebuah gambar transparan, tetapi gambar tersebut masih dapat dilihat mata seperti samar-samar atau bening. \nPernyataan diatas merupakan pengertian dari ekstensi gambar bitmap ...",
            "5. Salah kekurangan dari gambar berjenis bitmap adalah ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"*.png", "*.jpg", "*.jpeg", "*.cdr", "*.tiff"},
            {"Garis", "Vector", "Bitmap", "Gradient", "Kartun"},
            {"Adobe Photoshop", "CorelDraw", "CorelPhotoPaint", "Paint","Adobe Lightroom"},
            {"JPG", "PNG", "BMP", "TIFF","GIF"},
            {"Diperbesar tidak pecah", "Penyimpanan besar", "Penyimpanan kecil", "Warna yang Kompleks","Semua Benar"}
    };

    private String mCorrectAnswers[] = {"*.cdr", "Bitmap", "CorelDraw", "PNG", "Penyimpanan besar"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}