Elections are going on, and there are two candidates A and B, contesting with each other. There is a queue of voters and in this queue, some of them are supporters of A and some of them are supporters of B. Many of them are neutral. The fate of the election will be decided on which side the neutral voters vote. Supporters of A and supporters of B make attempts to win the votes of neutral voters.

The way this can be done is explained below:

1. The voter queue is denoted by three characters, viz {-, A, B}. The ‘-’ denotes neutral candidate, ‘A’ denotes supporter of candidate A and ‘B’ denotes supporter of candidate B.
2. Supporters of A can only move towards the left side of the queue.
3. Supporters of B can only move towards the right side of the queue.
4. Since time is critical, supporters of both A and B will move simultaneously.
5. They both will try and influence the neutral voters by moving in their direction in the queue. If a supporter of A reaches the neutral voter before a supporter of B reaches him, then that neutral voter will become a supporter of candidate A.
6. Similarly, if a supporter of B reaches the neutral voter before supporter of A reaches him, then that neutral voter will become a supporter of candidate B.
7. Finally, if both reach at the same time, the voter will remain neutral. A neutral vote cannot decide the outcome of the election.
8. If finally, the queue has more votes for candidate A, then A wins the election. If B has more votes, then B wins that election. If both have equal votes, then it will be a coalition government.
Your task is to find the outcome of the election.

For Example:
Given string- “B--A-”
              B --->  B  A   <--- A    B
              ----------------------------->
Output - B as B can move towards right only and A can move in left direction only. Thus B has 3 supporters in total while A have only 2 supporters. 
Note:

1. There are no test cases where all votes are neutral.
2. The influenced voters do not move and hence does not have any influence over the neutral voters.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 100
1 <= N <= 10^4,
Where T is the number of testcases,
and N is the length of the string.

Time Limit: 1sec
Sample Input 1:
1
B--A-
Sample Output 1:
B
Explanation of Sample input 1:
Initially, B is at the 0th position, and A is at the 3rd position. in one move, B will be at 1st position, while A will be at 2nd position. So B gained and A both gained one supporter. Finally, B gains an extra supporter at the 4th position, as A will never be able to travel at that position. so overall B supporters are 3, and A supporters are 2. Hence B's supporters will win.  
Sample Input 2:
1
B---A
Sample Output 2:
Coalition







 import java.util.*;
import java.io.*;

public class Solution {

	public static String electionResult(String voters) {
		// Write your code here
		int[] left = new int[voters.length()];
		int[] right = new int[voters.length()];
		int temp = Integer.MAX_VALUE - 1000;
		for (int i = 0; i < left.length; i++) {
			if (voters.charAt(i) == 'B') {
				temp = 0;
			} else {
				temp++;
			}
			left[i] = temp;
		}
		temp = Integer.MAX_VALUE - 1000;
		for (int i = right.length - 1; i > -1; i--) {
			if (voters.charAt(i) == 'A') {
				temp = 0;
			} else {
				temp++;
			}
			right[i] = temp;
		}
		int counta = 0;
		int countb = 0;
		for (int i = 0; i < right.length; i++) {
			if (left[i] > right[i]) {
				counta++;
			} else if (left[i] < right[i]) {

				countb++;
			}
		}

		if (counta < countb) {
			return "B";
		} else if (counta > countb) {
			return "A";
		}

		return "Coalition";

	}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline after the integer input
        for (int i = 0; i < t; i++) {
            String voters = sc.nextLine(); // Input the voters string
            System.out.println(Solution.electionResult(voters)); // Call the electionResult method and print the result
        }
        sc.close();
    }
}
 
