import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        // プリント
        System.out.println("Hello World!");

        // 変数宣言、代入
        int numA;
        numA = 10;
        System.out.println(numA);

        // 比較し結果を代入
        int numB = 20;
        int result = numA < numB ? 0 : 1;
        System.out.println(result);

        // for文を用いてリスト作成
        int sum = 0;
        int[] numList = new int[10];
        for (int i = 0; i < 10; i++){
            sum += 1;
            numList[i] = sum;
            System.out.println(i + ":" + sum);
        }
        System.out.println(Arrays.toString(numList));

        // リストを用いて繰り返し処理
        for (int index : numList){
            System.out.println(index+"を取り出しました。");
        }
    }
}
