import java.util.ArrayList;
import java.util.Scanner;

/**
 * A_Sum_of_Round_Numbers
 */
public class A_Sum_of_Round_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int x = sc.nextInt();
            int w = 0;
            while (x > 0) {
                int rem = x % 10;
                x = x / 10;
                if ((rem * Math.pow(10, w)) != 0) {
                    arr.add((int) ((rem * Math.pow(10, w))));
                }
                w++;
            }
            System.out.println(arr.size());
            for (int j = 0; j < arr.size(); j++) {
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}