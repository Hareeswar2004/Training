package day4;

public class duplicatenumber {
    public static void main(String[] args) {
        int[]a= {4,2,1,2,1,4,5};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length;j++ )
            if(a[i]==a[j]){
                System.out.println(a[i]);
            }
        }
    }
    
}
