package lesson1;

public class student1 {
    String name;
    int age;
    static int totalStudents = 0;

    // constructor
    student1(){
        totalStudents++;
    }

    public static int getTotalStudents(){
        return totalStudents;
    }

    //  Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
