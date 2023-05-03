package Part1;

public class Second_Largest {
    public static void main(String[] args) {
        int arr[] = {2,3,1,3,65,4,3,2,1,3,6,34};
        System.out.println(findSecondLargest(arr));
    }
    public static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;   // O(1)
        int secondLargest = Integer.MIN_VALUE;  // O(1)
        
        for (int i = 0; i < arr.length; i++) {  // O(n)
            if (arr[i] > firstLargest) {        // O(1)
                secondLargest = firstLargest;   // O(1)
                firstLargest = arr[i];          // O(1)
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) { // O(1)
                secondLargest = arr[i];         // O(1)
            }
            else if (arr[i] > secondLargest && arr[i] != firstLargest) { // O(1)
                secondLargest = arr[i];         // O(1)
            }
        }
        
        return secondLargest;                   // O(1)
    }
    
}
