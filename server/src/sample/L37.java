package sample;

class InfoWeather37 {
    int month;
    int day;
    String sky;
}

class DateInfo37 {

    public static void main (String args[]){
        InfoWeather37 today = new InfoWeather37();
        today.month = 3;
        today.day = 26;
        today.sky = "晴";
        System.out.println(today.month + "月" + today.day + "日\t" + today.sky);
    }
}