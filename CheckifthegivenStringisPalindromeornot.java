// Problem Statement: "Given a string, check if the string is palindrome or
// not." A string is said to be palindrome if the reverse of the string is the
// same as the string.

// Examples:

// Example 1:
// Input: Str = “ABCDCBA”
// Output: Palindrome
// Explanation: String when reversed is the same as string.

// Example 2:
// Input: Str = “TAKE U FORWARD”
// Output: Not Palindrome
// Explanation: String when reversed is not the same as string.

/**
 * CheckifthegivenStringisPalindromeornot
 */

// import java.util.Scanner;

// public class CheckifthegivenStringisPalindromeornot {
//     static boolean Palindrom(String r) {
//         String str = "";
//         for (int i = r.length() - 1; i >= 0; i--) {
//             str = str + r.charAt(i);

//         }
//         System.out.println(str);
//         if (str.equals(r)) {
//             return true;
//         } else
//             return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();

//         System.out.println(Palindrom(str));
//     }
// }

import java.util.*;

public class CheckifthegivenStringisPalindromeornot {

    static boolean palindrome(String r){
        String str ="";
        for (int i = r.length()-1; i >=0; i--) {
            str = str + r.charAt(i);
        }
            if(str.equals(r)){
            return  true;
            }
            else{
            return  false;}
    }
    public static void main(String args[]){
        Scanner sc =new  Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(palindrome(str));
    }
}
