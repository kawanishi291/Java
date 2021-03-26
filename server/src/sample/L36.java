package sample;

class InfoWeather36{
    static int month;
    static int day;
    static String sky;
}

class DateInfo36 {

    public static void main(String[] args) {
        InfoWeather36.month = 3;
        InfoWeather36.day = 26;
        InfoWeather36.sky = "晴";
        System.out.println(InfoWeather36.month + "月" + InfoWeather36.day + "日\t" + InfoWeather36.sky);
    }
}