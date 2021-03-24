package sample;

public class L22 {

    public static void main(String[] args) {
        int year = 1997;
        if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0){
            System.out.println(year + "年は閏年です。");
        }else{
            System.out.println(year + "年は閏年ではありません。");
        }
    }
}
