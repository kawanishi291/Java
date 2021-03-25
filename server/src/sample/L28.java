package sample;

public class L28 {

    public static void main(String[] args) {
        int charge = 123456;
        System.out.println("金額：" + charge + "円");
        int numPlaceList[] = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        for(int i = 0; i <= 8; i++)
            System.out.print(numPlaceList[i] + "\t");
        System.out.print("\n");
        for(int i = 0; i <= 8; i++)
            System.out.print("--------");
        System.out.print("\n");
        for(int i = 0; i <= 8; i++){
            System.out.print(charge / numPlaceList[i] + "\t");
            charge %= numPlaceList[i];
        }
        System.out.print("\n");
    }
}
