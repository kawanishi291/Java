package sample;

class AverageScore {

    public static void main(String[] args) {
        String name = "田中";
        int score [] = {90, 80, 75};
        float average ;

        average = ave(score[0], score[1], score[2]);

        System.out.println(name+"\t平均点:"+average);
    }

    static float ave(int a, int b, int c) {
        float answer;
        answer = (float)(a + b + c) / 3;

        return answer;
    }
}