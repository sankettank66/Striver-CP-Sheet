import java.util.*;

public class A_Nene_s_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int k = scanner.nextInt();
            int q = scanner.nextInt();
            int[] a = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = scanner.nextInt();
            }
            int[] nValues = new int[q];
            for (int i = 0; i < q; i++) {
                nValues[i] = scanner.nextInt();
            }
            int[] winners = new int[q];
            for (int i = 0; i < q; i++) {
                int n = nValues[i];
                List<Integer> roundPlayers = new ArrayList<>();
                for (int j = 1; j <= n; j++) {
                    roundPlayers.add(j);
                }
                for (int j = 0; j < Math.min(k, n); j++) {
                    roundPlayers.set(a[j] - 1, null);
                }
                for (Integer player : roundPlayers) {
                    if (player != null) {
                        winners[i]++;
                    }
                }
            }
            for (int i = 0; i < q; i++) {
                System.out.print(winners[i] + " ");
            }
            System.out.println();
        }
    }
}
