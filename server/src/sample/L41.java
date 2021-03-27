package sample;

class Student {
    double average(int score1, int score2, int score3) {
        double ave;
        ave = (score1 + score2 + score3) / 3;
        return ave;
    }
}

class Calculation {

    public static void main (String args[]){
        Student sato = new Student();
        System.out.println(sato.average(100, 80, 75));
    }
}