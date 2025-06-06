//interface.
package day10;
interface hr{
    int a=10;
    void display();
}
class office implements hr{
    public void display(){
        System.out.println("this is data member of interface" +a);
    }

}
public class task1 {
    public static void main(String[] args) {
        
    }
    
}
// for multiple inheritance we use the interface.
//we cant create a obeject for the interface.
//interface is loooking like a class but its not a class.
//we can access interface data member etc by inheriting into a class.
//with the help of 