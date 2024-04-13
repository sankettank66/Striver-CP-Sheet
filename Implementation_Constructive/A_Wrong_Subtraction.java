import java.util.Scanner;
/** 
 * 
 * @author Sanket Tank
 * */
public class A_Wrong_Subtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        while (k-- > 0) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
        }
        System.out.println(n);
        sc.close();
    }
}
