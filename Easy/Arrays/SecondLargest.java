Sample Input 1:
2
6
12 1 35 10 34 1
5
10 10 10 10 10
Sample Output 1:
34
-1

Sample Input 2:
1
6
7 8 8 1 4 3 
Sample Output 2:
7


 import java.util.* ;
import java.io.*; 

public class Solution {
    public static int findSecondLargest(int n, int[] arr) {
        
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] < max) {
                 
                smax = arr[i];
            }
        }

         
        return (smax == Integer.MIN_VALUE) ? -1 : smax;
    }
}
