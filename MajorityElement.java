public class MajorityElement {
    //moore's voting rule
     public static int majorityElement(int []v) {
        // Write your code here
       int c=0;
       int ele=0;
       for(int i=0;i<v.length;i++){
           if(c==0){
               ele=v[i];
               c++;
           }
           else if(ele==v[i]){
               c++;
           }
           else{
               c--;
           }
       }
       int c1=0;
       for(int vv:v){
           if(vv==ele){
               c1++;
           }
       }
       if(c1>v.length/2){
           return ele;
       }
       return -1;
        
    }
}
