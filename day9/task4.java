//single level inheritance.
package day9;

class math {
    void formula() {
        System.out.println("(A+B)^2=A^2+B^2+2AB");
    }
}

class chemistry extends math {
    void display() {
        System.out.println("nothing");
    }
}

public class task4 {
    public static void main(String[] args) {
        chemistry ch = new chemistry();
        ch.formula(); 
        ch.display();  
    }
}
