package day4;

public class array {
    public static void main(String[] args) {
        int[] ECE_F = new int[10];
        ECE_F[0] = 5051;
        ECE_F[1] = 5052;
        ECE_F[2] = 5053;
        ECE_F[3] = 5054;
        ECE_F[4] = 5055;
        ECE_F[5] = 5056;
        ECE_F[6] = 5057;
        ECE_F[7] = 5058;
        ECE_F[8] = 5059;
        ECE_F[9] = 5060;
        System.out.println("The elements of the array are:");
        for (int i = 0; i < ECE_F.length; i++) {
            System.out.println(ECE_F[i]);
        }
        System.out.println("The length of the array is: " + ECE_F.length);
        System.out.println("The first element of the array is: " + ECE_F[0]);
        System.out.println("The last element of the array is: " + ECE_F[ECE_F.length - 1]);
        System.out.println("The third element of the array is: " + ECE_F[2]);
        System.out.println("The fifth element of the array is: " + ECE_F[4]);
        System.out.println("The seventh element of the array is: " + ECE_F[6]);
        System.out.println("The ninth element of the array is: " + ECE_F[8]);               

    }
    
}
