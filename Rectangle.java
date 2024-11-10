import java.io.*;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }

    public double area() {
        return length * width;
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + area());
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(4.0);

        rect1.display();
        rect2.display();
    }
}

