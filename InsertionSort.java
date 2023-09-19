class InsertionSort{
    //iterative method
    static void sort(int[] arr){
        int i=0;
        int size=arr.length;
        while(i!=size){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
            
        }
            i++;
        }
        return;
    }
    //recursive method
    static void sort(int[] arr,int s,int n){
     
        if(s==n){
            return;
        }
        int j=s;
        while(j>0 && arr[j-1]>arr[j]){
            int t=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=t;
            j--;
        }
        sort(arr,s+1,n);

    }



    public static void main(String... args){
        int[] arr={1,5,2,7,0};
        
        // sort(arr,1,5);
        sort(arr);
        for(int i:arr){
            System.out.println(i);
        }

    }
}