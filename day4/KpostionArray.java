package day4;

public class KpostionArray {
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Position to access
        int n = arr.length;

        if (k >= 0 && k < n) {
            System.out.println("Element at position " + k + " is: " + arr[k]);
        } else {
            System.out.println("Position " + k + " is out of bounds for the array.");
        }
   }

    
}





    package day4;

import java.util.Scanner;

public class KpositionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Get array elements
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get k position (1-based)
        System.out.print("Enter the position (k) you want to access: ");
        int k = scanner.nextInt();

        // Check and print result
        if (k >= 1 && k <= n) {
            System.out.println("Element at position " + k + " is: " + arr[k - 1]);
        } else {
            System.out.println("Position " + k + " is out of bounds for the array.");
        }

        scanner.close();
    }
}
