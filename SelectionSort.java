public class SelectionSort{

static void sort(int[] arr){

int i=0;
int size=arr.length;
while(i!=size-1){
	int min=arr[i];
	int index=i;
for(int j=i;j<size;j++){
	if(arr[j]<min){
	min=arr[j];
	index=j;
	}
}
int temp=arr[i];
arr[i]=arr[index];
arr[index]=temp;
i++;

}
}

public static void main(String[] args){
	int[] arr={3,2,1,0,-10};
	sort(arr);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
}


}
