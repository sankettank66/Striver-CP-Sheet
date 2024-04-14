import java.util.Scanner;

/**
 * A_Erasing_Zeroes
 * @author Sanket Tank
 */
public class A_Erasing_Zeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int first = s.length();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    first = i;
                    break;
                }
            }
            int last = -1;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '1') {
                    last = i;
                    break;
                }
            }
            int total = 0;
            for (int i = first; i <= last; i++) {
                if (s.charAt(i) == '0')
                    total++;
            }
            System.out.println(total);
        }
        sc.close();
    }
}