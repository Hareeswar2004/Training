// multiple inheritance withr the help of the interface.

package day10;
interface hr{
    int a=10;
    void display();
}
interface finance{
    void budget();

}
interface operations{
    void SOP();

}
class office implements hr, finance, operations{
    public void display(){
        System.out.println("standard operating procedure from interface"+a);
    }
    public void budget(){
        System.out.println("budget from the finanace");
    }
    public void SOP(){
        System.out.println("standard operating procedure from operations");
    }
    
}
public class multipleinheritace {
    public static void main(String[] args) {
        office o = new office();
        o.display();
        o.budget();
        o.SOP();
    }
    
} 
