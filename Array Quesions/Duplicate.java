import java.util.*;
class Duplicate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			}
		Set<Integer> set=new HashSet<>();
		Set<Integer> uniqueset=new HashSet<>();	

		System.out.println("Duplicate Elements are ");
		for(int i=0;i<=arr.length-1;i++){
			boolean f=set.add(arr[i]);
			if(!f){
				boolean f1=uniqueset.add(arr[i]);
			
			if(f1){
				System.out.print(arr[i] +" ");
			}
			}

		}



	}
}