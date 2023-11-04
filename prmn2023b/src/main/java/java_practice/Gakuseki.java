package java_practice;

/* 練習問題1、自由記述ソースコード
   アクセス修飾子は"public"、メソッドは1つ */
public class Gakuseki {

    /* 今回は登録された学籍番号、入力した学籍番号をこのクラスのみで扱うものとした。
       2つの変数のアクセス修飾子を"private"にし、管理する場所を明確にする */
    private String number = "B2001000";
    private String gakuseki;

    public void gakusekiJudge(String gakuseki) {
        this.gakuseki = gakuseki;

        if (this.number.equals(this.gakuseki)) {
            System.out.println("Complete!");
        } else {
            System.out.println("Error!");
        }
        return;
    }
}
