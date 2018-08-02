package lesson2;
    // Overloading - in the same class, different args and data type
    // Overwriting - superclass and subclass, same method name

    // Abstract class can not be instantiated, can't create object of abstract class
    // Abstract method can be only in abstract class, dent need be initialize in base class,
    // but most be initialized in sub classes

    // Concrete class - all not abstract classes, can be instantiated

public class test {
    public static void main(String[] args) {
        //////////////////////     INTERFACE     //////////////////////////////////
        interface1 I = new interface1();
        //my_interface MyI = new my_interface();    // error, interfaces are abstract by nature







        /////////////////////    POLYMORPHISM    ////////////////////////////////////
                        /*
                                    Bank (base class)
                                 /         |         \
                              BankABC    BankDEF     BankXYZ
                        */
        Bank abc = new BankABC();
        Bank def = new BankDEF();
        Bank xyz = new BankXYZ();

        System.out.println(abc.getInterestRate());
        System.out.println(def.getInterestRate());
        System.out.println(xyz.getInterestRate());









        /////////////////////    INHERITANCE    ///////////////////////
                        /*
                                    Posligon (base class)
                                    /       \
                              Rectangle    Triangle
                        */
        /*
        rectangle Rect = new rectangle();
        triangle Tri = new triangle();
        Rect.setValues(7, 3);
        Tri.setValues(10, 20);

        System.out.println("Ractangles area is " + Rect.area());
        System.out.println("Triangles area is " + Tri.area());
        */
    }
}
