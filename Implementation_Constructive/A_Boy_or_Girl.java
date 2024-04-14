import java.util.HashSet;
import java.util.Scanner;

/**
 * A_Boy_or_Girl
 * @author Sanket Tank
 */
public class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashSet<Character> mp=new HashSet<>();
        char[] arr=str.trim().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            mp.add(arr[i]);
        }
        System.out.println(mp.size()%2!=0?"IGNORE HIM!":"CHAT WITH HER!");
    }
}