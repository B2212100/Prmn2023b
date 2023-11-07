package java_practice;

import java.util.Scanner; /* Scannerライブラリを使用すると、自動的にインポートされる */

/* Lecture2,練習問題1、掲示ソースコード
   変更点は明示する */
public class Prac1 {

    /* main文、ここの順番で動作する */
    public static void main(String[] args) {

//        String number = "B2001000";

        Scanner scan = new Scanner(System.in); /* 標準入力をするためのインスタンス化 */
        System.out.print("学籍番号を入力してください：");
        String gakuseki = scan.next();

        /* [変更点] 登録された学籍番号と、その判定をGakusekiクラスのメソッドで行う
           入力する学籍番号の変数名と紛らわしいため、このようなことは避けよう */
        Gakuseki gakuseki1 = new Gakuseki();
        gakuseki1.gakusekiJudge(gakuseki);

//        if (number.equals(gakuseki)) {
//            System.out.println("Complete!");
//        } else {
//            System.out.println("Error!");
//        }
    }
}
