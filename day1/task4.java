import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Maths marks: ");
        int maths = sc.nextInt();
    
        System.out.print("Enter the English marks: ");
        int english = sc.nextInt();
       
        System.out.print("Enter the Biology marks: ");
        int biology = sc.nextInt();
    
        int total = maths + english + biology;
        double average = total / 3.0;
      
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);

        sc.close();
    }
}

