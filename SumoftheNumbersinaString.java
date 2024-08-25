// Problem: Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)

// Examples:

// Example 1:
// Input: string = “123xyz”
// Output: 123

// Example 2:
// Input: string = “1xyz23”
// Output: 24
import java.util.Scanner;

public class SumoftheNumbersinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String r = "";
        int sum = 0;
        int l = str.length();
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                r = r + str.charAt(i);
            } else {
                if (r != "") {
                    sum = sum + Integer.parseInt(r);
                    r = "";
                }
            }

        }
        if (r != "") {
            sum += Integer.parseInt(r);

        }
        System.out.println(sum);

    }
}
