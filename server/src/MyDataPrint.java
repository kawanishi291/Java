import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class MyDataPrint {
    static Date day;
    static double height;
    static double weight;
    static double bmi;

    private static Date setday(){
        return new Date();
    }

    private static double[] setData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("身長(m)：");
        double h = scanner.nextDouble();
        System.out.print("体重(kg)：");
        double w = scanner.nextDouble();
        scanner.close();
        double b = w / (h * h);
        double [] values = {h, w, b};
        return values;
    }

    private static void printFile(Date d, double h, double w, double b){
        try {
            File file = new File("bmi.txt");
      
            FileWriter filewriter = new FileWriter(file);
          
            filewriter.write("日付：" + d + "\n");
            filewriter.write("身長(m)：" + h+ "\n");
            filewriter.write("体重(kg)：" + w+ "\n");
            filewriter.write("BMI：" + b+ "\n");
            filewriter.close();
          } catch(IOException e) {
            System.out.println(e);
          }
    }
    
    public static void main(String args[]){
        day = setday();
        System.out.println(day);
        double [] values = setData();
        int i = 0;
        for (double value: values){
            if (i == 0){
                height = value;
            }else if(i == 1){
                weight = value;
            }else{
                bmi = value;
            }
            i += 1;
        }
        System.out.println(height);
        System.out.println(weight);
        System.out.println(bmi);
        printFile(day, height, weight, bmi);
    }
    
}
