import java.util.Scanner;
class InsertionSort{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
        
        for(int i=0;i<arr.length;i++){
        	int temp=arr[i];
        	int j=i-1;

        	while(j>=0 && arr[j]>temp){
        		arr[j+1]=arr[j];
        		j--;
        	}
        	arr[j+1]=temp;
        }

         System.out.println("Sorted Arrays are ");
         for(int num : arr){
         	System.out.print(num+" ");
         }
	}
}
