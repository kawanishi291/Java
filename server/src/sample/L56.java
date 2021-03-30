package sample;

interface Dimension {
    double area(double x);
    double volume(double x);
}

class Sphere implements Dimension {
    static double PI = 3.141592;

    public double area(double x) {
        return 4.0 * PI * x * x;
    }
    public double volume(double x) {
        return 4.0 * PI * x * x * x / 3.0;
    }
}

class Cubic implements Dimension {
    
    public double area(double x){
        return 6.0 * x * x;
    }
    public double volume(double x){
        return x * x * x;
    }
}

class DimensionTest {

    public static void main(String[] args) {
        Sphere s = new Sphere();
        System.out.println("半径１０の球の表面積は" + s.area(10.0));
        System.out.println("半径１０の球の体積は" + s.volume(10.0));
        Cubic c = new Cubic();
        System.out.println("一辺１０の立方体の表面積は" + c.area(10.0));
        System.out.println("一辺１０の立方体の体積は" + c.volume(10.0));
    }
    
}