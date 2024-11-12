import java.util.Scanner;
class MoveZeroNeg{
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		
		int result[]=new int[size];
		int index=0;
		for(int num : arr){
			if(num<0){
				result[index++]=num;
			}
		}
		for(int num : arr){
			if(num>0){
				result[index++]=num;
			}
		}

		while(index<size){
			result[index++]=0;
		}

		
		for(int num : result){
			System.out.print(num+" ");
		}
		
	}
}
