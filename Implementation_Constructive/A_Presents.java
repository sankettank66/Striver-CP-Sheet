import java.util.Scanner;

/**
 * A_Presents
 * @author Sanket Tank
 */
public class A_Presents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] gifts = new int[n];

        for (int i = 0; i < n; i++) {
            int friend = scanner.nextInt();
            gifts[friend - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(gifts[i] + " ");
        }

        scanner.close();
    }
}