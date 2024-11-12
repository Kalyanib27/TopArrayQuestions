import java.util.Scanner;
class ReverseArray2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			}

		int start=0;
		int end=arr.length-1;	

		while(start<=end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;

			start++;
			end--;
		}

		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}	
			
	}
}