//revesing the string
package day6;

public class task10 {
    public static void main(String[] args) {
        reverseString("This is my book");      
    }
    public static void reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}