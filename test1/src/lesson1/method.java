package lesson1;

public class method {
    public static void main(String[] args) {
        //hello("Max");
        //int res = calculate(2, 3);
        //System.out.println(res);

        int res2 = calculate2(10, '*', 20);
        System.out.println(res2);
    }
    /*
    public static void hello(String name){
        System.out.println("hello " + name);
    }
    */
    /*
    public static int calculate(int a, int b){
        int result;
        result = a + b;
        return result;
    }
    */


    public static int calculate2(int a, char operator, int b){
        int result = 0;

        switch(operator){
            case '+':
                result = a + b;
                //return result;
                break;
            case '-':
                result = a - b;
                //return result;
                break;
            case '*':
                result = a * b;
                //return result;
                break;
            case '/':
                result = a / b;
                //return result;
                break;
            default:
                break;
        }
        return result;
    }
}
