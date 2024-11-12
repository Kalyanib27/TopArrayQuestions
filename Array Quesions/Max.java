import java.util.Scanner;
class Max{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			}
			
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(max);

	}
}