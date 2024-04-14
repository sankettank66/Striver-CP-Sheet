import java.util.Scanner;

/**
 * A_Maximum_Increase
 */
public class A_Maximum_Increase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        int[] arr = new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 1, len = 1;
        for (int i = 1; i < t; i++) {
            if (arr[i] > arr[i - 1])
                len++;
            else {
                if (max < len)
                    max = len;
                len = 1;
            }
        }
        if (max < len)
            max = len;
        System.out.println(max);
        sc.close();
    }
}