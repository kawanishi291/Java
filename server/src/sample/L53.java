package sample;

abstract class MemberInfo { //抽象クラス
    String name;
    char div;
    abstract void infoDisp();

    void setData(String a, char b) {
        name = a;
        div = b;
    }
}

class DispClass extends MemberInfo { //継承
    @Override
    void infoDisp() {
        // TODO Auto-generated method stub
        System.out.println("名前：" + name);
        System.out.println("区分：" + div);
    }
}

class Calc { //スタートクラス

    public static void main(String[] args) {
        DispClass obj = new DispClass();
        obj.setData("大原太郎", 'A');
        obj.infoDisp();
    }
}