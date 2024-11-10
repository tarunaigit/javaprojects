import java.io.*;

public class SimpleClass {
    private String name;

    public SimpleClass(String name) {
        this.name = name;
        System.out.println("Constructor called: " + name + " created.");
    }

    public void cleanup() {
        System.out.println("Cleanup called: " + name + " is being cleaned up.");
    }

    public static void main(String[] args) {
        SimpleClass obj = new SimpleClass("ExampleObject");
        System.out.println("Using " + obj.name);
        obj.cleanup();
        obj = null;
        System.gc();
    }
}