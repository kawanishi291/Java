package sample;

public class L29 {

    public static void main(String[] args) {
        int data[] = {31, 41, 59, 26, 53, 58, 97, 93, 23, 84};
        int tmp = 0;
        for(int num: data){
            if(num > tmp)
                tmp = num;
        }
        System.out.println("最大値は" + tmp + "です。");
    }
}
