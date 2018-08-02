package lesson3;
import java.lang.Thread;

//class One implements Runnable(){
class One extends Thread{
    public  void run(){
        for(int i = 1; i < 6; i++) {
            System.out.println(i + ".one-" + Thread.currentThread().getId());
        }
        try{
            Thread.sleep(200);
        } catch(Exception e){}
    }
}

//class Two implements Runnable{
class Two extends Thread{
    public void run() {
        for(int i = 1; i < 10; i++) {
            System.out.println(i + ".two-" + Thread.currentThread().getId());
        }
        try{
            Thread.sleep(200);
        } catch(Exception e){}
    }
}

public class Threads2 {
    public static void main(String[] args){
        One one = new One();
        //One two = new One();
        Two two = new Two();

        one.start();
        two.start();
    }
}
