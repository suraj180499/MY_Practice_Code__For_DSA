public class MaxConsecutive1s {
    static int maxConsecutive1s(int[] arr){
            int c=0;
            int ml=0;
            int i=0;
            while(i<arr.length){
                if(arr[i]==1){
                    c++;
                }
                else{
                    ml=Math.max(ml,c);
                    c=0;
                }
                i++;
            }


        return Math.max(ml,c);
    }

    public static void main(String[] args){
        int[] arr={1,0,1,1,1,0,1,1};
        System.out.println(maxConsecutive1s(arr));

    }
    
}
