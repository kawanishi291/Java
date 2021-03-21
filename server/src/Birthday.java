import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Birthday {
    int year;
    int month;
    int day;
    int age;

    void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("生年月日を入力して下さい。");
        System.out.print("年：");
        year = scanner.nextInt();
        System.out.print("月：");
        month = scanner.nextInt();
        System.out.print("日：");
        day = scanner.nextInt();
        scanner.close();

        age = checkAge(year, month, day);
    }

    public static int checkAge(int y, int m, int d){
        Calendar cl = Calendar.getInstance();

        // 日付をyyyyの形で出力する
        SimpleDateFormat sdfy = new SimpleDateFormat("yyyy");
        String yyyy = sdfy.format(cl.getTime());
        // String型 -> int型キャスト（文字から数値に型変換）
        int nowYear = Integer.parseInt(yyyy);

        // 日付をMMの形で出力する
        SimpleDateFormat sdfm = new SimpleDateFormat("MM");
        String mm = sdfm.format(cl.getTime());
        // String型 -> int型キャスト（文字から数値に型変換）
        int nowMonth = Integer.parseInt(mm);

        // 日付をddの形で出力する
        SimpleDateFormat sdfd = new SimpleDateFormat("dd");
        String dd = sdfd.format(cl.getTime());
        // String型 -> int型キャスト（文字から数値に型変換）
        int nowDay = Integer.parseInt(dd);
        
        // 差分を計算
        int resultY = nowYear - y - 1;
        int resultM = nowMonth - m;
        int resultD = nowDay - d;

        if (resultM > 0){
            resultY += 1;
        } else if (resultM == 0){
            if (resultD >= 0){
                resultY += 1;
            }
        }
        

        return resultY;
    }

    void print(){
        System.out.println(year + "年" + month + "月" + day + "日");
        System.out.println(age + "歳");
    }
}

class MyBirthday {
    public static void main(String[] args) {
        Birthday mybirthday = new Birthday();
        mybirthday.set();
        mybirthday.print();
    }
}