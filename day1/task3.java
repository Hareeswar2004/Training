import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        String s = sc.nextLine();
        System.out.println("this is what you entered"+(++a));
        System.out.println("this is what you entered"+f);
        System.out.println("this is what you entered"+d);
        System.out.println("this is what you entered"+s);
        sc.close();
    }
}
