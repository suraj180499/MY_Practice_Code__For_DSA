/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

import java.util.Arrays;

public class TwoSumProblem {
    //By sorting and using two pointer method(NlogN)
    public static String read(int n, int []book, int target){
        int[] b=book;
        Arrays.sort(b);
        int i=0,j=book.length-1;
        while(i<j){
            int res=target-(b[i]+b[j]);
            if(res==0){
                return "YES";
            }
            else if(res>0){
                i++;
            }
            else{
                j--;
            }
        }
        return "NO";
    }
//by tracing indexes using map(N)
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];

        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.get(target-nums[i])!=null){
                
                arr[0]=i;
                arr[1]=mp.get(target-nums[i]);
                
            }
            else{
                if(mp.get(nums[i])==null){
                    mp.put(nums[i],i);
                }
            }
        }
        return arr;
    }
    
}
