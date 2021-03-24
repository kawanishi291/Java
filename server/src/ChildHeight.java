import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ChildHeight {


    private static List<Double> SetHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("父親の身長(cm)：");
        double f = scanner.nextDouble();
        System.out.print("母親の身長(cm)：");
        double m = scanner.nextDouble();
        scanner.close();
        List<Double> values = new ArrayList();
        values.add(f);
        values.add(m);

        return values;
    }
    
    private static double[] CalcHeight(double f, double m){
        double boy = (f + m + 13) / 2 + 2;
        double girl = (f + m - 13) / 2 + 2;
        double[] values = {boy, girl};

        return values;
    }


    public static void main(String[] args) {
        List<Double> list = SetHeight();
        double farther = list.get(0);
        double mother = list.get(1);
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