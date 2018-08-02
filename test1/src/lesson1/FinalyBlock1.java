package lesson1;
// finaly block allways executes when the try block exists
public class FinalyBlock1 {
    public static void main(String[] args){
        System.out.println("3-" + retInt());


    }

    public static int retInt(){
        int a = 100;
        try{
            //a = 100/0;
            return a;
            //System.exit(3); //  only way when finally block not run
        } catch (ArithmeticException e){
            System.out.println("1-exception: " + e);
            return a;
        } finally {
            a = 555;    // overwrite returned value from try block
            System.out.println("2-Final");
            return a;
        }
    }
}
