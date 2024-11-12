import java.util.Scanner;
class Position{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("Enter the target value to be searched");
		int target=sc.nextInt();
		boolean found=false;
	
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]==target){
				System.out.println("Element found at "+ (i+1));
				found=true;
				break;
			}
			
		}
		if(!found){
			System.out.println("Element not found");
			}			
	}
}