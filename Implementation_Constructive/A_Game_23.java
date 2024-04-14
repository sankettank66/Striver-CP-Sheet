import java.util.Scanner;

/**
 * A_Game_23
 */
public class A_Game_23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long ans = 0;

        if (n == m) {
            System.out.println(0);
        } else if (m % n != 0) {
            System.out.println(-1);
        } else {
            long d = m / n;
            while (d % 2 == 0) {
                d /= 2;
                ans++;
            }
            while (d % 3 == 0) {
                d /= 3;
                ans++;
            }
            if (d != 1) {
                ans = -1;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}