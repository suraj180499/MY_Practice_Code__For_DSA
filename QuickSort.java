public class QuickSort{
    static void swap(int[] arr,int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
        return;
    }
    static int pivot(int[] arr,int l,int h){
        int p=l;
        int lp=l;
        int rp=h;

        while(lp<rp){
            while(arr[p]>=arr[lp] && lp<h){
                lp++;
            }
            while(arr[p]<=arr[rp] && rp>l ){
                rp--;
            }
            if(lp<rp){
                swap(arr,lp,rp);
            }
        }
        swap(arr,l,rp);
        return rp;
    }
    static void quickSort(int[] arr,int l,int h){
        if(l<h){
            int p=pivot(arr, l, h);
            quickSort(arr, l, p-1);
            quickSort(arr, p+1, h);
        }
    }

    public static void main(String... args){
        int[] arr={10,0,1,2,3,4,5};
        quickSort(arr, 0, arr.length-1);
        for(int x:arr){
        System.out.println(x);}

    }
}