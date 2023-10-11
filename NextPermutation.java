
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

     static void reverse(List<Integer> l,int i){
        int len=l.size()-1;
         
        while(i<=len){
        int t=l.get(i);
        l.set(i,l.get(len));
        l.set(len,t);
        //  System.out.println(l);
        i++;
        len--;
        }

    }
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        // Write your code here.
        boolean f=false;
        int index=A.size()-1;
        List<Integer> b=new ArrayList<>();
        for(int i=A.size()-1;i>0;i--){
            if(A.get(i)>A.get(i-1)){
                index=i-1;
                f=true;
                break;
            }
            b.add(A.get(i));

        }
        int index2=0;
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)>A.get(index)){
                index2=i;
                break;
            }

        }

        
        Collections.swap(A, index, index2);
        reverse(A,index+1);
        

        if(!f){
            b.add(A.get(0));
            
            return b;
        }



        return A;
    }
    
}
