package day3;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev= rev * 10 + digit; 
            n = n / 10;                      
        }

        System.out.println("Reversed number: " + rev);
    }
}
