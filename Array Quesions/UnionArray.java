import java.util.Scanner;

class UnionArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of arr1: ");
		int n=sc.nextInt();
		int arr1[]=new int[n];

		System.out.println("Enter elements of arr1: ");
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter size of arr2: ");
		int m=sc.nextInt();
		int arr2[]=new int[m];

		System.out.println("Enter elements of arr2: ");
		for(int i=0;i<m;i++){
			arr2[i]=sc.nextInt();
		}

		System.out.println("Union of two Array is ");
		for(int i=0;i<n;i++){
			System.out.print(arr1[i]+" ");
		}

		for(int i=0;i<m;i++){
			boolean isduplicate=false;
			for(int j=0;j<n;j++){
				if(arr2[i]==arr1[j]){
					isduplicate=true;
					break;
				}
			}
		if(!isduplicate){
			System.out.print(arr2[i]+" ");
		}
	}

	}
}