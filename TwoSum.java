class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> mp=new HashMap<>();

      int sum;
      int[] re=new int[2];
      for(int i=0;i<nums.length;i++){
          sum=target-nums[i];
          if(mp.get(sum)!=null){
              re[0]=mp.get(sum);
              re[1]=i;
              break;
          }
          else{
              mp.put(nums[i],i);
          }
      }
      return re;  
      
    }
}