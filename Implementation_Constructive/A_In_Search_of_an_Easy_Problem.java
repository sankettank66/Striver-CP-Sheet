import java.util.Scanner;

/**
 * A_In_Search_of_an_Easy_Problem
 */
public class A_In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t];
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==1)
            {
                flag=true;
                break;
            }
        }
        System.out.println(flag?"HARD":"EASY");
    }
}