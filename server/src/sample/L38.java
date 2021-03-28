package sample;

class Angle {
    int x;
    static int xy;
}

class AngleData {

    public static void main (String args[]){
        Angle obj1 = new Angle();
        obj1.x = 10;
        Angle obj2 = new Angle();
        obj2.x = 20;

        // static変数であればインスタンス化は必要ない！
        Angle.xy = 30;

        System.out.println("obj1.x = " + obj1.x);
        System.out.println("obj2.x = " + obj2.x);
        System.out.println("Angle.x = " + Angle.xy);
    }
}