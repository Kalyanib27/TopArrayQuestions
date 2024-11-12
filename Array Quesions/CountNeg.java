import java.util.Scanner;
class CountNeg{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				count++;
			}
		}
		System.out.println(count);
		
	}
}
