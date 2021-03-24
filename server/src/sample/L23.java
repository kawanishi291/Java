package sample;

public class L23 {
    public static void main(String[] args) {
        int a = 10;

        if(a % 3 == 0){
            System.out.println(a + "は３で割り切れます。");
        }else if(a % 3 == 1){
            System.out.println(a + "は３で割ると１余ります。");
        }else{
            System.out.println(a + "は３で割ると２余ります。");
        }

        int b = 30;
        switch(b % 3){
            case 0:
                System.out.println(b + "は３で割り切れます。");
                break;
                // switch文は break が必要！！ 判定結果(case)が 0 の場合、case1もcase2も処理されてしまう！
            case 1:
                System.out.println(b + "は３で割ると１余ります。");
                break;
                // switch文は break が必要！！
            case 2:
                System.out.println(b + "は３で割ると２余ります。");
        }
    }
}