import java.io.File;

class DeleteFile {
  public static void main(String args[]){
    File file = new File("c:¥¥tmp¥¥test.txt");

    if (file.delete()){
      System.out.println("ファイルを削除しました");
    } else {
      System.out.println("ファイルの削除に失敗しました");
    }
  }
}