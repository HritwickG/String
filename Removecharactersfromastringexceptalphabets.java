/*Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.

Examples:

Example 1:
Input: string str = "take12% *&u ^$#forward"
Output: takeuforward
Explanation:
Characters 1,2,%,*,&,^,$,# along with whitespaces are 
removed but the order of remaining alphabets is preserved.

Example 2:
Input: String str = "1.Python & 2.Java"
Output: PythonJava
Explanation: 
Characters 1.&2. along with whitespaces are removed 
but the order of remaining alphabets is preserved. */

import java.util.Scanner;

public class Removecharactersfromastringexceptalphabets {
    static void remove(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
                System.out.print(str.charAt(i));
            } else
                continue;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine();
        remove(r);
    }
}
