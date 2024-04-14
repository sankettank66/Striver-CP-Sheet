import java.util.Scanner;

/**
 * A_Boring_Apartments
 * @author Sanket Tank
 */
public class A_Boring_Apartments {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int a = x % 10;

            String s = String.valueOf(x);
            int d = 0;
            for (int j = 0; j < s.length(); j++) {
                d += 1 + j;
            }

            System.out.println(((a - 1) * 10) + d);

        }
        sc.close();
    }
}