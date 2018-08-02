package lesson1;

/*
byte (1 byte)
short (2 bytes)
int (4 bytes)
long (8 bytes)
float (4 bytes)
double (8 bytes)
char (2 bytes)
boolean (1 byte)
*/

public class myClass {

    public static void main(String[] args) {
        int age = 31;
        float weight1 = 89.4f;  //float weight2 = (float)89.7;
        boolean b = true;  // true or false only, lowercase, no 1 or 0

        System.out.println("Hello Maksym!");
        System.out.println("weight: " + weight1 + "kg");
        System.out.println(b);
        //birthday();
    }

    /*static void birthday() {
        age++;
    }*/
}
