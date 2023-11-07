package java_practice;

import java.util.Scanner;

/* Lecture2,練習問題3、自由記述のソースコード（main文） */
public class Prac3 {

    /* 事前に"学籍番号"とそれに対応する"パスワード"を定義（例：5つ以上） */
    public static void main(String[] args) {

        /* 利用した別のクラス */
        Login login = new Login();

        /* 学籍番号を入力し、それが定義に含まれていればパスワード入力へ
           そうでなければ、"Error!"と表示し動作を終了する */
        Scanner scan = new Scanner(System.in); /* 標準入力をするためのインスタンス化 */
        System.out.print("学籍番号を入力してください：");
        String studentID = scan.next();

        /* このif文はLoginクラスのvalidStudentIDメソッドで
           "true"が返されたときのみ機能する（学籍番号が正しかった場合） */
        if (login.validStudentID(studentID)) {
            /* パスワードを入力し、一致していれば"ログイン完了"と表示する
               そうでなければ、"不正なアクセス"と表示し動作を終了する */
            System.out.print("パスワードを入力してください：");
            String studentPassword = scan.next();

            /* Loginクラスの */
            if (studentPassword.equals(login.getStudentPassword(studentID))) {
                System.out.println("ログイン完了");
            } else {
                System.out.println("不正なアクセス");
                System.exit(0);
            }
        } else {
            System.out.println("Error!");
            System.exit(0);
        }
    }
}
