import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
 
public class WriteCSV {
 
  public static void main(String[] args) {
    try {
      File csv = new File("writers.csv"); // CSVデータファイル
      // 追記モード
      BufferedWriter bw 
        = new BufferedWriter(new FileWriter(csv, true)); 
      // 新たなデータ行の追加
      bw.write("中上健次" + "," + "1946" + "," + "1992");
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