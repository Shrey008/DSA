There are ‘N’ doors and ‘N’ people in a house. Each person and door has a unique ID ranging from 1 to ‘N’.
  A person can change the status of the door i.e, if the door is open then a person can close the door and vice versa.
  Initially, all the doors are closed and each person wants to change the status of all doors whose ID is a multiple of the ID of the person.
  You need to find out the final status of all the doors.

The answer should be given in a form of a binary string where ‘0’ represents the closed door and ‘1’ represents the open door.
For example, the status “close open close” will form a binary string “010”.



  Sample Input 1:
2
2
4
Sample Output 1:
10
1001    




  import java.util.* ;

 

import java.io.*; 
 public class Solution {
    public static String doorStatus(int n) {
        
        StringBuilder sb = new StringBuilder();

         
        for (int i = 1; i <= n; i++) {
             
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                sb.append(1); // Door is open
            } else {
                sb.append(0); // Door is closed
            }
        }

         
        return sb.toString();
    }
 }
