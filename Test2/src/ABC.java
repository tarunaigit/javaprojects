import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int smallest = array[0], largest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) smallest = array[i];
            if (array[i] > largest) largest = array[i];
        }

        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
        scanner.close();
    }
}
