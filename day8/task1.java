package day8;

class Defaultclass{
    String defaultmessage = "Iam default acces within the same package";

}
class ModifierExample{
    public String publicmessage = "Iam public access anywhere accesable";
    private String privatemessage =  "Iam private acces within the same class";
    private void displayprivate(){
        System.out.println(privatemessage);
 
    }
    Defaultclass dc = new Defaultclass();
    public void display(){
        System.out.println(dc.defaultmessage);
        System.out.println(publicmessage);
        displayprivate();

    }
}
public class task1 {
    public static void main(String[] args) {
        ModifierExample me = new ModifierExample();
        me.display();
        
    }
}