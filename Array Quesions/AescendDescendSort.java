import java.util.Scanner;
class AescendDescendSort{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}

		int mid=size/2;

		for(int i=0;i<mid-1;i++){
			for(int j=0;j<mid-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=mid;i<arr.length-1;i++){
			for(int j=mid;j<arr.length-1-(i-mid);j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}

			}
		}
		System.out.println("Sorted Array is ");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+" ");
		}
		
    }
}