import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class WriteFile {
  public static void main(String args[]){
    try {
      File file = new File("bmi.txt");

      FileWriter filewriter = new FileWriter(file);
    
      filewriter.write("こんにちは¥r¥n");
      filewriter.write("お元気ですか¥r¥n");

      filewriter.close();
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}