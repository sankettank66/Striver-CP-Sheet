import java.util.HashSet;
import java.util.Scanner;
/**
 * @author Sanket Tank
 */
public class A_String_Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!vowels.contains(c)) {
                sb.append('.');
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
