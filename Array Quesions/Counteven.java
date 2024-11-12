import java.util.Scanner;
class Counteven{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			}

		int counteven=0;
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i]%2==0){
				counteven++;
			}
		}	
			
		System.out.println(counteven);

	}
}