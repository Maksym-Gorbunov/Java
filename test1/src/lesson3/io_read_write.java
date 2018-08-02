package lesson3;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.File;

public class io_read_write {
    public static void main(String[] args){
        try{
            File file = new File("file1.txt");
            if (file.exists()){
                File file_backup = new File("file_backup.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                //BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
                String line;
                PrintWriter pw = new PrintWriter(file_backup);
                while ((line = br.readLine()) != null) {
                    //System.out.println(line);
                    pw.println(line);
                }
                pw.close();
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                System.out.println("Done");
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
