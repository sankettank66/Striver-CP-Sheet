import java.util.Scanner;
/**
 * @author Sanket Tank
 */
public class A_Repeating_Cipher {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = "";
        int k = 0;
        String s1 = sc.next();

        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            s += c;
            i += k;
            k++;
        }

        System.out.println(s);

        sc.close();
    }
}
