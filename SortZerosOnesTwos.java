
import java.util.* ;
import java.io.*; 
public class SortZerosOnesTwos {
    static void swap(ArrayList<Integer> arr,int i,int j){
        int t=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,t);
    }
    //my solution using three pointer
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
       int i=0,j=n-1,c=0;
       while(i<=j){
        //    System.out.println(arr);
           if(arr.get(i)==0){
               if(i==c){
                   c++;
                   i++;
               }
               else{
               swap(arr, i, c);
               c++;}
           }
           else if(arr.get(i)==2){
               swap(arr,i,j);
               j--;
           }
           else{
               i++;
           }

       }
       
    }
    //coding ninja solution using three pointer
     public static void sortArrayCodingSol(ArrayList<Integer> arr, int n) {
        int zeroPos = 0;
        int onePos = 0;
        int twoPos = n - 1;

        while (onePos <= twoPos) {
            if (arr.get(onePos) == 1) {
                onePos++;
            } else if (arr.get(onePos) == 0) {
                Collections.swap(arr, zeroPos, onePos);
                zeroPos++;
                onePos++;
            } else {
                Collections.swap(arr, twoPos, onePos);
                twoPos--;
            }
        }

    }
}
