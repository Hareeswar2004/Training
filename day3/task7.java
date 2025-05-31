package day3;
import java.util.Scanner;
public class task7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number");
        int n = sc.nextInt();
        if(n%2==0 && n%3==0){
            System.out.println("Given number is not a prime number");
            
        } else{
            System.out.println("Given number is a prime number");
        }

    
}
}