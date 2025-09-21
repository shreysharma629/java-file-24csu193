import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Shrey Sharma 24csu193");

        System.out.print("Enter length of array: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("Array length must be positive.");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("min in array is: " + min);
        System.out.println("max in array is: " + max);

        scan.close();
    }
}
