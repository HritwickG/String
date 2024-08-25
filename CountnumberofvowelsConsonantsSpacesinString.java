/*Problem Statement: Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

Examples:

Example 1:
Input: string str=”Take u forward is Awesome”
Output: 
Vowels: 10
Consonants: 11
White spaces: 4
Explanation: 



Example 2:
Input: string str=”India won the cricket match”
Output:
Vowels: 8
Consonants: 15
White spaces: 4 */

import java.util.Scanner;

public class CountnumberofvowelsConsonantsSpacesinString {
    static void count(String str) {
        str = str.toLowerCase();
        int l = str.length();
        int vowels = 0;
        int consonants = 0;
        int space = 0;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vowels++;

            } else if (str.charAt(i) == ' ') {
                space++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonants++;
            }

        }
        System.out.println(l);
        System.out.println("Vowels " + vowels);
        System.out.println("Consonants " + consonants);
        System.out.println("Space " + space);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);
    }
}
