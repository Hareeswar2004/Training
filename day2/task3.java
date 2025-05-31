package day2;

public class task3 {
    public static void main(String[] args) {
        int passmark = 40;

        int biologyMark = 50;
        int physicsMark = 35;
        int mathsMark = 60;
        System.out.println("Name of the student  :  Hareeswar");
        System.out.println("Registeration number : 9922005051");
        if (biologyMark >= passmark) {
            System.out.println("Biology - Pass");
        } else {
            System.out.println("Biology - fail");
        }

        if (physicsMark >= passmark) {
            System.out.println("Physics - pass");
        } else {
            System.out.println("Physics - fail");
        }

        if (mathsMark >= passmark) {
            System.out.println("maths - Pass");
        } else {
            System.out.println("maths - fail");
        }
    }
}


