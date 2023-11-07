package java_practice;

import java.util.Scanner;

/* Lecture3,練習問題1 */
public class Prac2_1 {

    public static void main(String[] args) {

        String name1 = "千歳太郎";
        int num = 2001000;

        /* 追加部分（14~19行） */
        Scanner scan = new Scanner(System.in); /* 標準入力をするためのインスタンス化 */
        System.out.print("氏名を入力してください：");
        name1 = scan.next();

        System.out.print("学籍番号を入力してください（数字のみ）：");
        num = scan.nextInt();

        System.out.println("氏名：" + name1 + ", 学籍番号：b" + num);

    }
}
