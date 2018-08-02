package lesson3;
import java.util.*;
import java.lang.Thread;

//class Tuna implements Runnable{
class Tuna extends Thread{
    public void run(){
        for (int i=0; i<6; i++){
            System.out.println(Thread.currentThread().getId() + " Element " + i);
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// run ttt and ttt2 at the same time
public class Threads1{
    public static void main(String[] args){
        Tuna ttt = new Tuna();
        ttt.start();

        Tuna ttt2 = new Tuna();
        ttt2.start();
    }

}