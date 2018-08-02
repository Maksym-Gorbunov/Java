package lesson1;

public class final1 {
    public static void main(String[] args){
        final_keyword F1 = new final_keyword();

        //F1.number = 2;    cannot assign final variable, it was assigned once in constructor
        System.out.println(F1.number);
    }
}
