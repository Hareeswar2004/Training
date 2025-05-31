package day2;
public class nestedif {
    
    public static void main(String[] args) {
        int marks = 97;  

        if (marks >= 40) {
            System.out.println("Status: Passed");

            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }

        } else {
            System.out.println("Status: Failed");
            System.out.println("Grade: F");
        }
    }
}
