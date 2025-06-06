package day8;
class Outer{
    private String z = "Private Message";
    class inner{
        void display(){
            System.out.println(z);
        }
    }
}
public class task2{
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.inner inobj = obj.new inner();
        inobj.display();
    }
}


    

