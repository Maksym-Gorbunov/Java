package lesson1;

public class student {
    int id;
    String name;
    int age = 18;   // default

    // Getter and Setter - incapsulation of variable
    // Code->Generate->Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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