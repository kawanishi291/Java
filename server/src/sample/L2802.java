package sample;

public class L2802 {

    public static void main(String[] args) {
        int charge = 123456;
        System.out.println("金額：" + charge + "円");
        int numPlaceList[] = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        for(int numplace: numPlaceList){
            System.out.print(numplace + "\t");
        }
        System.out.print("\n");
        for(int i = 0; i <= 8; i++)
            System.out.print("--------");
        System.out.print("\n");
        for(int numplace: numPlaceList){
            System.out.print(charge / numplace + "\t");
            charge = charge % numplace;
        }
        System.out.print("\n");
    }
}
