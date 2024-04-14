import java.util.PriorityQueue;
import java.util.Scanner;

public class C_Numbers_on_Whiteboard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = n; i >= 1; i--) {
                pq.add(i);
            }
            int a, b, c;
            System.out.println(2);
            while (pq.size() > 1) {
                a = pq.poll();
                b = pq.poll();
                System.out.println(a + " " + b);
                c = a + b;
                if ((c & 1) != 0) {
                    c++;
                }
                c /= 2;
                pq.add(c);
            }
        }
        sc.close();
    }
}
