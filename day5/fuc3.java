package day5;
import java.util.Scanner;
public class fuc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr[][]= new int [3][3];
        for(int i=0; i<3; i++){
            for (int j=0; j<0; j++){
                arr[i][j] = sc.nextInt();
                
            }
        }
        for(int index = 0; index < arr.length; index++){
            for (int i=0; i< arr.length; i++){
                sum = sum+arr[i][index];
            }
            System.out.println(sum);
            sum=0;

        }


        
    }
    
}
