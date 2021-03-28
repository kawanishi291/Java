package sample;

public class L44 {

    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(10));
        System.out.println(obj.add(5, 10));
    }
}

class Addition {
    public int add(int n1) {
        int cnt;
        int sum = 0;
        for(cnt = 1; cnt <= n1; cnt ++)
            sum = sum + cnt;
        
        return sum;
    }

    public int add(int n1, int n2){
        int cnt;
        int sum = 0;
        for(cnt = n1; cnt <= n2; cnt ++){
            sum = sum + cnt;
        }

        return sum;
    }

}