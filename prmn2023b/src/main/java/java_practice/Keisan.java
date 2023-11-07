package java_practice;

/* 練習問題2、自由記述ソースコード
   数値の計算、判定のみを行う */
public class Keisan {

    /* 入力された数値5つの合計値を求めるメソッド */
    public int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    /* 数値5つの合計値が
       <=49なら"Small", 50<=なら"Big", 100<=なら"Great!"
       と表示するメソッド */
    public void sumJudge(int sum) {
        System.out.println("合計値 : " + sum);
        if (sum >= 100) {
            System.out.println("Great!");
        } else if (sum >= 50) {
            System.out.println("Big");
        } else {
            System.out.println("Small");
        }
        return;
    }

}
