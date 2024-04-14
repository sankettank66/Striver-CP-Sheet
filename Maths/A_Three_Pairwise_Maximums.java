package Maths;
import java.util.Scanner;

public class A_Three_Pairwise_Maximums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            if (x > z) {
                int temp = x;
                x = z;
                z = temp;
            }
            if (y > z) {
                int temp = y;
                y = z;
                z = temp;
            }

            if (y == z) {
                System.out.println("YES");
                System.out.println(x + " " + x + " " + z);
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
