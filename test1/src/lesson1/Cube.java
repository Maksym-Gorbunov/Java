package lesson1;

public class Cube {
    int length;
    int width;
    int height;

    // constructor
    Cube(){
        length = 11;
        width = 22;
        height = 33;
        System.out.println("CONSTRUCTOR 1 runs first!!!");
    }

    Cube(int l, int w, int h){
        length = l;
        width = w;
        height = h;
        System.out.println("CONSTRUCTOR 2 runs first!!!");
    }

    public int getCubeVolume(){
        return (length * width * height);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
