import java.util.Arrays;
public class LongestSuccessiveElements {

    //Hashing technique
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.

        int m=0;
        for(int x:a){
            if(x>m){
                m=x;
            }
        }

        int[] arr=new int[m+1];
        for(int x:a){
            arr[x]=1;
        }
        int c=0;
        int i=0;
        
        m=0;
        while(i!=arr.length){
            if(arr[i]!=0){
                c++;
                i++;
            }
            else{
                m=Math.max(m,c);
                c=0;
                i++;
            }
            
        }
        return Math.max(m,c);

        
    }
}