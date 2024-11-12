import java.util.*;

class LongestPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int longestPalindrome = -1;

        for (int num : arr) {
            if (isPalindrome(num)) {
                if (num > longestPalindrome) {
                    longestPalindrome = num;
                }
            }
        }

        if (longestPalindrome != -1) {
            System.out.println("Longest Palindrome number is " + longestPalindrome);
        } else {
            System.out.println("Palindrome number not found");
        }

        sc.close();
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return original == reversed;
    }
}
