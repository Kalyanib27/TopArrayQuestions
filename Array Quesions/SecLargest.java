import java.util.Scanner;
class SecLargest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
			}

		int largest=arr[0];
		int seclargest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				seclargest = largest;
				largest=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>seclargest && arr[i]!=largest){
				seclargest=arr[i];
			}
		}
		System.out.println(seclargest);

    }
}