//abstract class ans abstract method.
package day10;
abstract class service{
    int a=10;
    void settings(){
        System.out.println(a);

    }
    abstract void profile();
}
class hari extends service{
    void profile(){
        System.out.println("i will do it");
    }
}
public class abstraction {
    public static void main(String[] args) {
       hari klu = new hari();
       klu.settings();
       klu.profile();
    }

}
