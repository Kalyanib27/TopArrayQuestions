import java.util.Scanner;
class MoveZero{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int z=0,nz=0;

		while(nz<=arr.length-1){
			if(arr[nz]!=0){
			int temp=arr[nz];
			arr[nz]=arr[z];
			arr[z]=temp;
			nz++;
			z++;
		}
		else{
			nz++;
		}
		}

		System.out.println();
		for(int num : arr){
			System.out.print(num+" ");
		}
		
	}
}
