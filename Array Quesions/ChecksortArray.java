import java.util.Scanner;
class ChecksortArray{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		boolean issorted=true;

		for(int i=0;i<arr.length-1;i++){
			
				if(arr[i]>arr[i+1]){
					issorted=false;
					break;
				}
				
			}
		if(issorted){
			System.out.println("Array is Sorted");
		}
		else{
			System.out.println("Array is not sorted");
		}

		
	}
}
