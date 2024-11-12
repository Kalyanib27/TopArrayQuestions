import java.util.Scanner;
import java.util.Arrays;
class Mindiff{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int minDiff=findminDiff(arr);
        System.out.println("Minimum Difference is "+ minDiff);
    }

        public static int findminDiff(int arr[]){
            Arrays.sort(arr);
            int minDiff=Integer.MAX_VALUE;

            for(int i=0;i<arr.length-1;i++){
                int diff=arr[i+1]-arr[i];
                if(diff<minDiff){
                    minDiff=diff;
                }
            }
            return minDiff;
        }
}