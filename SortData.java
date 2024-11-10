import java.util.Arrays;
import java.util.Scanner;

public class SortData {
    private int[] arr;

    public SortData(int[] arr) {
        this.arr = arr;
    }

    public void asec() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted in ascending order: " + Arrays.toString(arr));
    }

    public void desc() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted in descending order: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("You entered: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + (i < n - 1 ? ", " : ""));
        }
        System.out.println();

        SortData sorter = new SortData(numbers);
        sorter.asec();
        sorter.desc();
        
        scanner.close();
    }
}

