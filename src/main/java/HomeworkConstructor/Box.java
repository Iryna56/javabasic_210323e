package HomeworkConstructor;

public class Box {
    public int length;
    public int width;
    public int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void print() {
        System.out.println("Volume of box: " + length*width*height);
    }
}
