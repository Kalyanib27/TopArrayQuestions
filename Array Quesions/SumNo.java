import java.util.Scanner;
class SumNo{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number");
		int num=sc.nextInt();

		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]+arr[j]==num){
					System.out.println("pairs are "+ arr[i] +" " + arr[j]);
				}
				else{
					System.out.println("No pairs are found");
					
				}
			}
		}
		
	}
}
