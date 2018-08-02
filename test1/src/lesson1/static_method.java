package lesson1;
//                      !!!
// Access all STATIC variables and methods from CLASS
// and all NON-STATIC from the object (instance)


public class static_method {
    public static void main(String[] args){
        student1 Max1 = new student1();
        student1 Max2 = new student1();
        student1 Max3 = new student1();
        student1 Max4 = new student1();

        System.out.println(student1.getTotalStudents());




        /*
        hello instance1 = new hello();

        // non-static
        // belong to instance
        instance1.doSomethingElse("Else");

        // static
        // belong to the class, instance has access, but its wrong way
        instance1.doSomething("Some_works _but_wrong");

        // belong to the class
        hello.doSomething("Some");

        hello.age = 2;  // accessible from class because static
        instance1.age = 5;
        */
    }
}
