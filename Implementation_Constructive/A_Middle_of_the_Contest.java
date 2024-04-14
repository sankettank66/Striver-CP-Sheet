import java.util.Scanner;

/**
 * A_Middle_of_the_Contest
 */
public class A_Middle_of_the_Contest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        String[] x1=x.split(":");
        String[] x2=y.split(":");
        System.out.println(x1[0]+" "+x1[1]);
        System.out.println(x2[0]+" "+x2[1]);
        System.out.println(Integer.parseInt(x1[0])+ Integer.parseInt(x2[0])/2);
        System.out.println(Integer.parseInt(x1[1])+ Integer.parseInt(x2[1])/2);
        sc.close();
    }
}