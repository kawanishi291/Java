package sample;

public class L31 {

    public static void main(String[] args) {
        boolean a[] = new boolean[50];

        for(int i = 0; i < 50; i++)
            a[i] = true;
        
        for(int i = 2; i < 50; i++){
            if(a[i-1]){
                for(int j = 2; i * j <= 50; j++)
                    a[i * j - 1] = false;
            }
        }
        for(int i = 1; i < 50; i++){
            if(a[i])
                System.out.print((i+1)+",");
        }
    }
}
