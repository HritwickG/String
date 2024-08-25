import java.util.Scanner;

public class Capital {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character or your name: ");
        char str = sc.nextLine().charAt(0); // Read entire line and get first char

        if (Character.isUpperCase(str)) {
            
            System.out.print(Character.toLowerCase(str));
        } else {
            System.out.println("The entered character is not uppercase."); // Handle non-uppercase input
        }
    }
}
