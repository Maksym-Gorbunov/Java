package lesson3;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;

public class io_read_file {
    public static void main(String[] args){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("file1.txt"));
            String line;

            // assign to line variable file row and check if its not empty

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){

        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done");
    }
}
