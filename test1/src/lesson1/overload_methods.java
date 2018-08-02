package lesson1;

public class overload_methods {
    public static void main(String[] args) {
        //Methods overload means different execution in different cases
        System.out.println(Add(2,10));
        System.out.println(Add(3.1,5.2));
        System.out.println(Add("Hello ","Max"));
    }

    //Methods overload means different execution in different cases
    public static int Add(int a, int b){
        return a+b;
    }
    public static double Add(double a, double b){
        return a+b;
    }
    public static String Add(String a, String b){
        return a+b;
    }
}
