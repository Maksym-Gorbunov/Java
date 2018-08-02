package lesson1;
/*
Access Levels
Modifier    Class   Package    Subclass    World
public        Y        Y          Y          Y
protected     Y        Y          Y          N
no modifier   Y        Y          N          N
private       Y        N          N          N
*/
public class classes {
    public static void main(String[] args) {
        // NOT SAFE, has acces to data
        /*
        student maksym = new student();    // object, instance
        maksym.id = 1;
        maksym.name = "Malksym";
        System.out.println(maksym.age);
        */

        // SAFE variant with incapsulation
        student maksym = new student();

        maksym.setId(1);
        maksym.setName("Maksym");
        maksym.setAge(31);
        /*
        System.out.println(maksym.getId());
        System.out.println(maksym.getName());
        System.out.println(maksym.getAge());
        */

        /////////////////   Cube    ///////////////////////////
        Cube cube1 = new Cube(2, 5, 10);
        Cube cube2 = new Cube();
                      // constructor

        System.out.println(cube1.getLength());
        System.out.println(cube1.getWidth());
        System.out.println(cube1.getHeight());
        int vol1 = cube1.getCubeVolume();
        System.out.println(vol1);
        System.out.println();
        System.out.println(cube2.getLength());
        System.out.println(cube2.getWidth());
        System.out.println(cube2.getHeight());
        int vol2 = cube2.getCubeVolume();
        System.out.println(vol2);




    }
}
