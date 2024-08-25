/*Problem Statement: Reverse a String. Write a program that reverses a given string (in-place).


 */

import java.util.Scanner;

/**
 * ReverseAString
 */
public class ReverseAString {
    static void reverse(String str) {
        String r = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            r = r + str.charAt(i);

        }
        System.out.print(r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
}