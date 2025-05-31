// doing the addition, subtraction, multiplication, division, modulo.

public class task2 {
    public static void main(String[] args) {
        int A = 3;
        int B = 3;
        int sum = A+B;
        int product = A*B;
        int division = A/B;
        int difference = A-B;
        int remainder = A%B;
        System.out.println("sum:"+ sum); 
        System.out.println("product:"+ product);
        System.out.println("division:"+ division);
        System.out.println("difference:"+ difference);
        System.out.println("remainder:"+ remainder);
    }
}
// model two to reduce the size of the code
 
public class task2{
    public static void main(String[] args) {
        int A = 10;
        int B = 10;
        System.out.println("sum:" +(A+B));
        System.out.println("difference:" +(A-B));
        System.out.println("product:" +(A*B));
        System.out.println("division:" +(A/B));
        System.out.println("modulo:" +(A%B))
    }
 }