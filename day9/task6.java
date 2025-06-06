//hierchical inheritance
package day9;

class grandfather {
    void generation1() {
        System.out.println("grandfather");
    }
}

class family extends grandfather {
    void generation2() {
        System.out.println("father");
    }
}



class child extends family {
    void generation3() {
        System.out.println("child");
    }
}

public class task6{
    public static void main(String[] args) {
        child c = new child();
        c.generation1();
        c.generation2();
        c.generation3();
    }
}



