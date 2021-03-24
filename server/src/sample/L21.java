package sample;

public class L21 {

    public static void main(String[] args) {
        int kamoku1 = 35;
        int kamoku2 = 90;

        if (kamoku1 <= 70){
            System.out.println("不合格");
        }else {
            if (kamoku2 >= 70){
                System.out.println("合格");
            }else{
                System.out.println("不合格");
            }
        }

        int kamoku3 = 90;
        int kamoku4 = 100;
        if (kamoku3 >= 70 && kamoku4 >= 70){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
