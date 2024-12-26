Problem statement
You are given an array 'a' of size 'n'.
Print the Next Greater Element(NGE) for every element.
The Next Greater Element for an element 'x' is the first element on the right side of 'x' in the array, which is greater than 'x'.
If no greater elements exist to the right of 'x', consider the next greater element as -1.
For example:
Input: 'a' = [7, 12, 1, 20]
Output: NGE = [12, 20, 20, -1]
xplanation: For the given array,
- The next greater element for 7 is 12.
- The next greater element for 12 is 20. 
- The next greater element for 1 is 20.
- There is no greater element for 20 on the right side. So we consider NGE as -1.


  //Code
  import java.util.Scanner;

public class Solution {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = -1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    a[i] = arr[j];
                    break;
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = nextGreaterElement(arr, n);

        System.out.print("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
