Problem statement
You are given an array/list 'ARR' consisting of N integers, which contains elements only in the range 0 to N - 1. Some of the elements may be repeated in 'ARR'. Your task is to find all such duplicate elements.

Note:
1. All the elements are in the range 0 to N - 1.
2. The elements may not be in sorted order.
3. You can return the duplicate elements in any order.
4. If there are no duplicates present then return an empty array.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <=  10^2
1 <= N <= 10^4
0 <= ARR[i] <= N - 1
Time Limit: 1 sec
Sample Input 1:
2
5
0 2 1 2 3 
7
3 2 1 3 2 1 5
Sample Output 1:
2
1 2 3
Explanation For Sample Input 1:
For the first test case, since 2 is the only duplicate element, so we return it.

For the second test case, since 1, 2, 3 are duplicates so we return them. Note that 2, 3, 1 and 3, 2, 1 are also acceptable.
Sample Input 2:
1
3
0 1 2
Sample Output 2:
-1
Explanation For Sample Input 2:
For the first test case, since there are no duplicates we return -1.



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static ArrayList<Integer> findDuplicates(int[] arr, int n) {
        Arrays.sort(arr); // Sort the array
        ArrayList<Integer> duplicates = new ArrayList<>(); // List to store duplicates
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1] && (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != arr[i])) {
                duplicates.add(arr[i]); // Add duplicate to the list
            }
        }
        
        return duplicates; // Return the list of duplicates
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        // Taking input for the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Finding duplicates
        ArrayList<Integer> result = findDuplicates(arr, n);
        
        // Output the result
        if (result.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicates: " + result);
        }
        
        scanner.close();
    }
}
