//polymorphism----method overloading.

package day9;
class polymorphism{
    int add(int a){
        return ++a;
    }
    double add(double a, double b){
        return a+b;

    }
    String add(String a, String b){
        return a+b;
    }
}
public class task7 {
    public static void main(String[] args) {
        polymorphism metho_dover_loding = new polymorphism();
        char a[] = {'a', 'b'};
        System.out.println(metho_dover_loding.add(12, 22));
        
    }
    
}
