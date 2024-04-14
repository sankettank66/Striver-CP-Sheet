import java.util.Scanner;
/**
 * @author Sanket Tank
 */
public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = new int[10]; 

        for (int i = 0; i < str.length(); i += 2) {
            count[str.charAt(i) - '0']++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 9; i++) { 
            while (count[i]-- > 0) {
                result.append(i).append("+");
            }
        }
        result.deleteCharAt(result.length() - 1); 
        System.out.println(result);
        sc.close();
    }
}
