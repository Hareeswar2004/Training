package day6;

public class task11 {
    public static void main(String[] args) {

        String S = "mom";
        char arr[] = {'m', 'o', 'm'};
        String str = new String(arr);
        String str1 = new StringBuilder(str).reverse().toString();

        if (str.equals(str1)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
