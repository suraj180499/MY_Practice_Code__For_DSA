import java.util.HashMap;
import java.util.Map;

public class LongestTargetSumWithNeg {

        public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.

		int l=0;
		Map<Integer,Integer> mp=new HashMap<>();

		int s=0;
		for(int i=0;i<nums.length;i++){
			s+=nums[i];
			if(s==k){
				l=Math.max(l,i+1);
			}
			if(mp.get(s-k)!=null){
				l=Math.max(i-mp.get(s-k),l);
			}
			if(mp.get(s)==null){
			mp.put(s,i);}
		}
		return l;
	}
    
    public static void main(String... LongestTargetSumSubArray){
        int[] arr={8,10,1,17,0,-1};
        int k=17;
        System.out.println(getLongestSubarray(arr, k));
    }
    
}
