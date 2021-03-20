import java.util.Scanner;

class Bmi {
    String name;
    int age;
    double height;
    double weight;
    double bmi;
    String status;

    void setMyProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前：");
        name = scanner.next();
        System.out.print("年齢：");
        age = scanner.nextInt();
        System.out.print("身長(m)：");
        height = scanner.nextDouble();
        System.out.print("体重(kg)：");
        weight = scanner.nextDouble();
        scanner.close();
        bmi = weight / (height * height);
        status = check(bmi);
    }

    private static String check (double bmi){
        if (bmi < 18.5) {
            return "低体重(痩せ型)";
        } else if ((18.5 <= bmi) && (bmi < 25)) {
            return "普通体重";
        } else if ((25 <= bmi) && (bmi < 30)) {
            return "肥満(1度)";
        } else if ((30 <= bmi) && (bmi < 35)) {
            return "肥満(2度)";
        } else if ((35 <= bmi) && (bmi < 40)) {
            return "肥満(3度)";
        } else {
            return "肥満(4度)";
        }
    }

    void printMyProfile() {
        System.out.println("名前は" + name + "です。");
        System.out.println("年齢は" + age + "才です。");
        System.out.println("身長は" + height + "mです。");
        System.out.println("体重は" + weight + "kgです。");
        System.out.println("BMIは" + bmi + "です。");
        System.out.println("あなたは" + status + "です。");
    }

}

class MyBmi {
    public static void main(String[] args) {
        Bmi person = new Bmi();
        person.setMyProfile();
        person.printMyProfile();
    }
}
