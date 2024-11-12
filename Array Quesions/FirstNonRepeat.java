import java.util.HashMap;

public class FirstNonRepeat {
    public static void main(String[] args) {
        int[] array = {9, 4, 9, 6, 7, 4};
        int result = findFirstNonRepeatingElement(array);

        if (result != -1) {
            System.out.println("First non-repeating element is: " + result);
        } else {
            System.out.println("All elements are repeating or the array is empty.");
        }
    }

    public static int findFirstNonRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : arr) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        for (int element : arr) {
            if (elementCountMap.get(element) == 1) {
                return element;
            }
        }

        return -1;
    }
}
