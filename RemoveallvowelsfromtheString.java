/*Problem Statement: Given a String, write a program to remove vowels from a given String.

Examples:

Example 1:
Input: Str = “take u forward”
Output: tk  frwrd
Explanation: All vowels are removed from the given String.

Example 2:
Input: Str = “I am very happy today”
Output:  m vry happy tdy
Explanation: All vowels are removed from the given String. */

import java.util.Scanner;

public class RemoveallvowelsfromtheString {
    static void remove(String str) {
        str = str.toLowerCase();
        int l = str.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                continue;
            }
            System.out.print(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        remove(str);
    }
}
