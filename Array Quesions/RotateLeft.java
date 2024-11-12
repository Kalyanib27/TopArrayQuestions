import java.util.*;

class RotateLeft{

	static void reverse(int arr[],int start, int end){
		while(start<=end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String args[]){
		int arr[]={11,8,15,4,2,13};
		int k=4;
		k=k%arr.length;
		if(k<0){
			k=k+arr.length;
		}
		System.out.println(Arrays.toString(arr));

		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		reverse(arr,0,arr.length-1);

		System.out.println(Arrays.toString(arr));


	}
}