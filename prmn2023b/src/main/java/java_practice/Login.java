package java_practice;

/* Lecture2,練習問題3、自由記述ソースコード
   学籍番号とパスワードの管理、認証を行うメソッドを考えた */
public class Login {

    /* 指示文より、学籍番号とパスワードの組み合わせは2次元配列で定義する */
    private String[][] students = {
            {"B2001000", "0000"},
            {"B2001001", "1234"},
            {"B2001002", "7777"},
            {"B2001003", "0147"},
            {"B2001004", "0123"}
    };

    /* 学籍番号が定義に含まれているかどうか確認するメソッド */
    public boolean validStudentID(String studentID) {
        for (String[] student : this.students) {
            if (student[0].equals(studentID)) {
                return true;    /* 学籍番号が含まれていたらtrue */
            }
        }
        return false;
    }

    /* パスワード（二次元配列のstudents[~][1]）を返すメソッド */
    public String getStudentPassword(String studentID) {
        for (String[] student : this.students) {
            if (student[0].equals(studentID)) {
                return student[1];
            }
        }
        return null;
    }

}
