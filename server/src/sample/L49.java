package sample;

class IndiInfo {
    String name;
    int age;

    IndiInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class EmpInfo extends IndiInfo {
    String occu;

    EmpInfo(String name, int age, String occu) {
        super(name, age);
        this.occu = occu;
    }
}

class Employee {

    public static void main(String[] args) {
        String occu = "engineer";
        EmpInfo obj = new EmpInfo("Mr.Tanaka", 27, occu);

        System.out.println("Name：" + obj.name + "\n");
        System.out.println("Age：" + obj.age + "\n");
        System.out.println("Job：" + obj.occu + "\n");
    }
}