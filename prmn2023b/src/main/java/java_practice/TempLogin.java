package java_practice;

/* Lecture3,練習問題2 */
public class TempLogin {

    String name;
    int num;

    /* コンストラクタ
       フィールド変数定義後は、ショートカットでも生成できます */
    TempLogin(String name, int num) {
        this.name = name;
        this.num = num;
    }

    void message(String name_n, int num_n) {
        if (this.name.equals(name_n)) {
            if (this.num == num_n) {
                System.out.println("ログイン成功");
            }
        } else {
            System.out.println("ログイン失敗");
        }
    }

}
