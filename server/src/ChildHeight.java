import java.util.Scanner;

public class ChildHeight {


    private static double[] SetHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("父親の身長(cm)：");
        double f = scanner.nextDouble();
        System.out.print("母親の身長(cm)：");
        double m = scanner.nextDouble();
        scanner.close();
        double values[] = {f, m};

        return values;
    }
    
    private static double[] CalcHeight(double f, double m){
        double boy = (f + m + 13) / 2 + 2;
        double girl = (f + m - 13) / 2 + 2;
        double values[] = {boy, girl};

        return values;
    }


    public static void main(String[] args) {
        System.out.println("子供の身長を予測します。");
        double list[] = SetHeight();
        double farther = list[0];
        double mother = list[1];
        double[] values = CalcHeight(farther, mother);
        int i = 0;
        for (double value: values){
            if (i == 0){
                System.out.println("男の子：" + value + "cm");
            }else{
                System.out.println("女の子：" + value + "cm");
            }
            i += 1;
        }
    }

}