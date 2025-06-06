//poymorphism--------overriding method.

 package day9;
class AnimalSound{
    void sound(){
        System.out.println("Animal makes Sounds");
    }
}
class dog extends AnimalSound{
    void sound(){
        System.out.println("Barks");
    }
}
class cat extends AnimalSound{
    void sound(){
        System.out.println("Meows");
    }

}
public class task8{
    public static void main(String[] args) {
        AnimalSound animal = new AnimalSound();
        animal.sound();
        dog chimtu =new dog();
        chimtu.sound();
        cat guru = new cat();
    
        guru.sound();



    }
}


//runtime polymorphism
//complie time polymorphism
