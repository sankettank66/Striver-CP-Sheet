import java.util.Scanner;

/**
 * A_Nearly_Lucky_Number
 * @author SANKET TANK
 */
public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for (int i = 0; i < n.length(); i++)
            if (n.charAt(i) == '4' || n.charAt(i) == '7')
                ++count;
        if (count == 7 || count == 4)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}