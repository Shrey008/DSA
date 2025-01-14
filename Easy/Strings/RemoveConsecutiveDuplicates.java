You are given a string ‘str’ of size ‘N’. Your task is to remove consecutive duplicates from this string recursively.

For example:

If the input string is ‘str’ = ”aazbbby”, then your output will be “azby”.
Note that we are just removing adjacent duplicates.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
2
7
aazbbby
6
aabbcb
Sample Output 1:
azby
abcb
Explanation of Sample Input 1:
Test Case 1:

Given ‘str' = ”aazbbby”
After removing adjacent duplicates string will be “azby”

Test Case 2:

Given ‘str’ = “aabbcb”
After removing adjacent duplicates string will be “abcb”
Sample Input 2:
2
5
abcde
5
aaaaa
Sample Output 2:
abcde
a
Explanation of Sample Input 2:
Test Case 1:

Given ‘str' = ”abcde”
There are no duplicates in the input string so the final string will be “abcde” 

Test Case 2:

Given ‘str’ = “aaaaa”
After removing adjacent duplicates string will be “a”





import java.util.Scanner;

public class Solution {
    public static String removeConsecutiveDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            // Append the current character if it's the first character or different from the previous one
            if (i == 0 || currentChar != s.charAt(i - 1)) {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the string (can be ignored in logic)
            String s = scanner.next(); // Input string
            System.out.println(removeConsecutiveDuplicates(s)); // Process and print the result
        }
        scanner.close();
    }
}
