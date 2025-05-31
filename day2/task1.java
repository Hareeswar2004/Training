package day2; 

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        System.out.print("Enter a float: ");
        float f = sc.nextFloat();
        System.out.println("Sum: " + (a + f));        
        System.out.println("Difference: " + (a - f));      
        System.out.println("Product: " + (a * f)); 
        System.out.println("Division: " + (a / f));      
        System.out.println("Modulo: " + (a % f));
        sc.close();
    }
}