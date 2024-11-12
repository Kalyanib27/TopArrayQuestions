import java.util.*;
class Unique{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		Set<Integer> set=new HashSet<>();

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			set.add(arr[i]);
			}

		System.out.print(set);

	}
}