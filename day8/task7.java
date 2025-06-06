// with the help of parameterized constructor we can create multiple constructors 
//parameterized constructor.
package day8;
class hari{
    hari(){
        System.out.println("this is hari construtor");

    }
    hari(int a){
        System.out.println("this is parameterized constructor INT "+a);

    }
    hari(double a){
        System.out.println("this is parameterized constructor DOUBLE "+a);
    }
}

public class task7 {
    public static void main(String[] args) {
        hari priya = new hari(10);
    }
    
}
