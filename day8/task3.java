package day8;

class Outer {
    private String Z = "private message";
    
    class inner{
        void display(){
            System.out.println(Z);
        }
    }
    static class StaticInner {
        void display() {
            System.out.println("this is the satic inner class");
        }
    }
}
public class task3{
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.StaticInner inobj = new Outer.StaticInner();
        inobj.display();
    }
}



