/*In this article, we will solve the most asked interview question: “Remove brackets from an algebraic expression”

Problem Statement: 

Remove brackets from an algebraic expression

Write a program to remove brackets from an algebraic expression

Given an algebraic expression, we need to simplify the expression and remove the brackets.

Examples:

Example 1:
Input: “a+((b-c)+d)”
Output: “a+b-c+d”
Explanation: Removed all the brackets in the algebric expression.

Example 2:
Input: “(((a-b))+c)”
Output: “a-b+c”
Explanation: Removed all the brackets in the algebric expression. */

import java.util.Scanner;

public class Removebracketsfromanalgebraicexpression {
    static void removebra(String str) {
        int l = str.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == ')')
                continue;
            else
                System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removebra(str);
    }
}
