package lesson3;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class io1 {
    public static void main(String[] args){
        try {                                                   // JAVA need \\ double back slashes
            File file1 = new File("D:\\Java\\test1\\src\\lesson3\\file1.txt");
            if (!file1.exists()) {
                file1.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file1);
            pw.println("file1 content is here");
            pw.println(555);
            pw.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
