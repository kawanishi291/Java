class Student {
    String name;
    int score;
    static final int MAX_SCORE = 100;

    void setScore(int newScore) {
        score = newScore;
    }

    void printScore() {
        System.out.println(name + "さんの点数は" + score + "点です。");
    }
}

class StudentSample {
    public static void main(String[] args) {
        Student kawanishi = new Student();
        kawanishi.name = "河西";
        kawanishi.score = 10;
        kawanishi.printScore();

        Student Tanaka = new Student();
        Tanaka.name = "田中";
        Tanaka.score = 100;
        Tanaka.printScore();
    }
}