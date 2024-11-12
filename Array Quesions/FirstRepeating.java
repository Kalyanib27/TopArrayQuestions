import java.util.*;

class FirstRepeating{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        int firstrepeating=-1;

        for(int i=n-1;i>=0;i--){
        	if(set.contains(arr[i])){
        		firstrepeating=arr[i];
        	}else{
        		set.add(arr[i]);
        	}
        }

        if(firstrepeating!=-1){
        	System.out.println("First repeating element: "+ firstrepeating);
        }else{
        	System.out.println("No repeating elements found");
        }


    }
}