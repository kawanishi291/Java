package sample;

class Angle {
    static int x;
}

class AngleData {

    public static void main (String args[]){
        Angle obj1 = new Angle();
        Angle obj2 = new Angle();
        obj1.x = 10;
        obj2.x = 20;
        Angle.x = 30;

        System.out.println("obj1.x = " + obj1.x);
        System.out.println("obj2.x = " + obj2.x);
        System.out.println("Angle.x = " + Angle.x);
    }
}