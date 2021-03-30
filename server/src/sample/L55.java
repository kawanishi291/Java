package sample;

//インターフェースを定義
interface Greeting {
    void greet();
}


//インターフェースを実装
class GreetIF implements Greeting {
    
    public void greet(){
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        GreetIF object1 = new GreetIF();
        object1.greet();
    }
}
