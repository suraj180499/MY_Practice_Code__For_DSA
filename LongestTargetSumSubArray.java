public class LongestTargetSumSubArray {

        public static int longestSubarrayWithSumK(int []a, long k) {
            int l=0;
            int i=0,j=0;
            long val=k;
            while(j<a.length && i<a.length){
                // System.out.println(val+"l");
                if(i>j){
                    j=i;
                }
                if(val-a[j]>0){
                    val=val-a[j];
                    j++;
                    
                }
                else if(val-a[j]==0){
                    val=val-a[j];
                    l=Math.max(l,j-i+1);
                    j++;
                }
                else{
                    val=val+a[i];
                    i++;
                }
            }
            return l;
        }
    
    public static void main(String... LongestTargetSumSubArray){
        int[] arr={8,10,5,17,0,11};
        int k=17;
        System.out.println(longestSubarrayWithSumK(arr, k));
    }
    
}
