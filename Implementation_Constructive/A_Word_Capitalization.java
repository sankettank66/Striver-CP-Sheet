import java.util.Scanner;

/**
 * A_Word_Capitalization
 * @author Sanket Tank
 */
public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next().trim();
        char[] arr=str.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        System.out.println(new String(arr));
        sc.close();
    }
}