import java.util.Scanner;

public class Capitalizefirstandlastcharacterofeachwordofastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int l = str.length();

        for (int i = 0; i < l; i++) {
            if (i == 0 || str.charAt(i - 1) == ' ') {
                System.out.print(str.charAt(i));
            }
            if (i == l - 1 || str.charAt(i + 1) == ' ')
                System.out.print(str.toUpperCase());
            else
                System.out.print(str.charAt(i));
        }
    }
}
