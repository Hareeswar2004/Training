//to find the frequency of the number.
//package day6;
//
//public class task5 {
  //  public static void main(String[] args) {
    //    int[]a= new int[]{1,2,2,3,3,3,4,4,4,4};
      //  int Cpy[] = new int[10];
        //for(int i=0; i<Cpy.length; i++){
          //  Cpy[a[i]]++;
        //}
        //for(int i=0; i<Cpy.length; i++){
          //  if(Cpy[i]>1){
            //    System.out.println(i+" ");
            //}
        //}

        

           
    //}

    
//}
    
package day6;
import java.util.Scanner;
public class task5{
    
public static void main(String[]args){
    System.out.println("Enter the N");
    int n = sc.nextInt(),m;
    int arr[] = new int[n];
    System.out.println("Array values");
    for(int i=0; i< arr.length; i++){
        arr[i]= sc.nextInt();
    }

    int[] A = new int[]{};
    int cpy[]= new int[10];
    for(int i=0; i<cpy.length; i++){
            cpy[A[i]]++;
        }
        for(int i=0; i<cpy.length; i++){
            if(cpy[i]>1){
                System.out.println(i+" ");
            }
        }


}
}