public class MergeSort {

    static void merge(int[] arr,int l,int m,int h){
        int l1=l;
        int l2=m+1;
        int[] aux=new int[h-l+1];
        int k=0;
        while(l1<=m && l2<=h){
            if(arr[l1]<=arr[l2]){
                aux[k]=arr[l1];
                k++;
                l1++;
            }
            else{
                aux[k]=arr[l2];
                k++;
                l2++;
            }
        }
        while(l1<=m){
            aux[k]=arr[l1];
            k++;
            l1++;
        }
         while(l2<=h){
            aux[k]=arr[l2];
            k++;
            l2++;
        }
        for(int i=l;i<=h;i++){
            arr[i]=aux[i-l];
        }
    }

    static void mergeSort(int[] arr,int l,int h){
        int m=(l+h)/2;
        if(l>=h){
            return;
        }
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, h);
        merge(arr,l,m,h);
    }
    public static void main(String[] args){
        int[] arr={0,3,2,1};
        mergeSort(arr, 0, 3);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
