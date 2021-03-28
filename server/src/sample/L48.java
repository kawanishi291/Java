package sample;

class SuperPerson {
    String name;
    int age;
    
    void outPerson() {
        System.out.println("名前：" + this.name);
        System.out.println("年齢：" + this.age);
    }
}

class SubStudents extends SuperPerson { //継承
    String className;

    void outPerson() {

        super.outPerson(); //親クラスのメソッドをそのまま使用
        System.out.println("クラス：" + this.className);
    }
}

class OverRideTest {

    public static void main(String[] args) {
        SubStudents obj = new SubStudents();
        obj.name = "田中";
        obj.age = 27;
        obj.className = "1 - 1";
        obj.outPerson();
    }
}