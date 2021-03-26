package sample;

class SampleClass39 {
    int no;
    char div;
}

class EnzanClass39 {
    public static int goukei (int a, int b){
        int totale;
        totale = a + b;
        
        return totale;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        int answer = goukei(num1, num2);
        System.out.println(answer);
    }
}
