import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class HealthCSV {

    public static void main(String[] args) {
        try {
          File csv = new File("myhealth.csv"); // CSVデータファイル
          // 追記モード
          BufferedWriter bw 
            = new BufferedWriter(new FileWriter(csv, true)); 
          // 新たなデータ行の追加
          Bmi person = new Bmi();
          person.setMyProfile();
          person.printMyProfile();
          bw.write(person.name + "," + person.age + "," + person.height + "," + person.weight + "," + person.bmi + "," + person.status);
          bw.newLine();
          bw.close();
     
        } catch (FileNotFoundException e) {
          // Fileオブジェクト生成時の例外捕捉
          e.printStackTrace();
        } catch (IOException e) {
          // BufferedWriterオブジェクトのクローズ時の例外捕捉
          e.printStackTrace();
        }
      }

}
