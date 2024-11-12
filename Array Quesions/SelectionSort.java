import java.util.Scanner;
class SelectionSort{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
        for(int i=0;i<arr.length-1;i++){
        	int smallest=i;
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[j]<arr[smallest]){
        			smallest=j;
        		}
        	}
        	int temp=arr[smallest];
        	arr[smallest]=arr[i];
        	arr[i]=temp;
        }
         System.out.println("Sorted Arrays are ");
         for(int num : arr){
         	System.out.print(num+" ");
         }
	}
}
