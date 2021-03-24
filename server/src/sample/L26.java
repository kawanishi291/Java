package sample;

public class L26 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i+", ");
            }
        }
        System.out.println("");

        for (int event = 2; event <= 100; event += 2){
            System.out.print(event+", ");
        }
        System.out.println("");
    }
}
