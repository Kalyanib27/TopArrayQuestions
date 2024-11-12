import java.util.*;
class RemoveDuplicate{
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

		for(int i=0;i<=arr.length-1;i++){
			set.add(arr[i]);
			
		}
		System.out.print(set);

	}
}