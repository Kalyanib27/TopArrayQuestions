import java.util.Scanner;
class Occurence{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("Enter the target value");
		int target=sc.nextInt();
		int count=0;

		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]==target){
				count++;
			}
		}	
		System.out.println("Occurence of "+target+" is "+ count+" times");

	
	}
}