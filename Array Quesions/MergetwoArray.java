import java.util.Scanner;
class MergetwoArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.print("enter size of arr1");
		int n=sc.nextInt();
		int arr1[]=new int[n];

		System.out.println("Enter elements of arr1:");
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}

		System.out.print("enter size of arr2");
		int m=sc.nextInt();
		int arr2[]=new int[m];

		System.out.println("Enter elements of arr2:");
		for(int i=0;i<m;i++){
			arr2[i]=sc.nextInt();
		}

		int mergearray[]=new int[n+m];
		for(int i=0;i<n;i++){
			mergearray[i]=arr1[i];
		}

		for(int i=0;i<m;i++){
			mergearray[n+i]=arr2[i];
		}

		for(int i=0;i<mergearray.length-1;i++){
			for(int j=0;j<mergearray.length-i-1;j++){
				if(mergearray[j]>mergearray[j+1]){
					int temp=mergearray[j];
					mergearray[j]=mergearray[j+1];
					mergearray[j+1]=temp;
				}
			}
		}

		for(int i=0;i<mergearray.length;i++){
			System.out.print(mergearray[i]+" ");
		}


	}
}