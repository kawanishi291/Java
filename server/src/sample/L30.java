package sample;

public class L30 {

    public static void main(String[] args) {
        int data[] = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        int tmp;

        System.out.println("並び替え前");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + "\t");
        }
        System.out.print("\n");
        for(int i = 0; i < data.length - 1; i++){
            for(int j = i + 1; j < data.length; j++){
                if(data[i] > data[j]){
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        System.out.println("並び替え後");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + "\t");
        }
        System.out.print("\n");
    }

}
