import java.util.Scanner;

/**
 * A_Soldier_and_Bananas
 * @author Sanket Tank
 */
public class A_Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        System.out.println(k*((w*(w+1))/2)-n);
    }
}