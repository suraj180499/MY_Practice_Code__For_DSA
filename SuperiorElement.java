import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class SuperiorElement {


     public static List< Integer > superiorElements(int []a) {
        // Write your code here.

        List<Integer> ans=new ArrayList<>();

        ans.add(a[0]);
        int i=1;
        while(i<a.length){
            if(ans.size()!=0 && ans.get(ans.size()-1)<=a[i]){
                ans.remove(ans.size()-1);
            }
            else{
                ans.add(a[i]);
                i++;
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
    
}
