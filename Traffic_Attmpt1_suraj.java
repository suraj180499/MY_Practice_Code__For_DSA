public class Traffic_Attmpt1_suraj {
    public static void main(String... args){
        int[] arr={0,1,0,0,1,0};
        int m=3;
        Solution sol=new Solution();
        System.out.println(sol.traffic(arr.length, m, arr));

    }
    
}
class Solution {
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.

        int l=0;
        int ml=0;
        int i=0;
        int mm=m;
        while(i<n){
            if(vehicle[i]==1){
                l++;
                i++;
            }
            else if(vehicle[i]==0 && mm!=0){
                l++;
                i++;
                mm--;
            }
            else{
                ml=Math.max(ml,l);
                // System.out.println(ml);
                l=0;
                mm=m;
                while(i>0){
                    if(vehicle[i-1]==1){
                        i--;
                    }
                    else{
                        break;
                    }
                }
                
                i--;
            }

        }
        return Math.max(ml,l);

    }
}