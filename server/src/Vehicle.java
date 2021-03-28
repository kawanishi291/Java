public class Vehicle {
    String name;
    String color;
    int distance;

    void Run(int d) {
        this.distance = d;
    }

    void PrintData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("距離：" + this.distance + "km");
    }
}


class Bicycle extends Vehicle {
    void Run(int d) {
        super.Run(d);
    }
    void PrintData(){
        super.PrintData();
    }
}


class Car extends Vehicle {
    int gas;

    void Run(int d){
        super.Run(d);
    }
    void Gasoline(int g){
        this.gas = g;
    }
    void PrintData(){
        super.PrintData();
        System.out.println("ガソリン：" + this.gas + "l");
    }
}

class MyItem {

    public static void main(String[] args) {

        Bicycle obj1 = new Bicycle();
        obj1.name = "サイクリング";
        obj1.color = "赤";
        obj1.Run(1);
        obj1.PrintData();
        System.out.println("\n");

        Car obj2 = new Car();
        obj2.name = "セレナ";
        obj2.color = "青";
        obj2.Run(10);
        obj2.Gasoline(30);
        obj2.PrintData();
    }
}