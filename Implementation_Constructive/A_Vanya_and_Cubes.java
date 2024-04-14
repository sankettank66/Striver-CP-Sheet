import java.util.Scanner;

/**
 * A_Vanya_and_Cubes
 * @author Sanket Tank
 */
public class A_Vanya_and_Cubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cubes = sc.nextInt();
        int sum = 0;
        int temp = 0;
        int level = 0;
        for (int i = 1;; i++) {
            sum += i;
            temp += sum;
            if (temp > cubes)
                break;
            level++;
        }
        System.out.println(level);
        sc.close();
    }
}