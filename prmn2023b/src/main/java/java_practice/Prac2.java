package java_practice;

import java.util.Scanner;

/* Lecture2,練習問題2、掲示ソースコード
   ここでは変更後のみを記述する */
public class Prac2 {

    public static void main(String[] args) {

        int[] num = new int[5]; /* 配列の定義、0~4まで計5つの場所を持つ */

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " つ目の数字を入力してください: ");
            num[i] = scan.nextInt();
            System.out.println(""); /* 改行 */
        }

        /* 上記では5つの整数入力を行った
           それに基づく合計値と判定は、Keisanクラスのメソッドで行う */
        Keisan keisan = new Keisan();
        int sum = keisan.sum(num);

        keisan.sumJudge(sum);
    }
}
