import java.util.Scanner;
/**
 * 
 *  @author Sanket Tank
 **/
public class A_Arrival_of_the_General {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            if (arr[i] <= arr[min]) {
                min = i;
            }
        }
        System.out.println(max + (arr.length - 1 - min) - (min < max ? 1 : 0));
        sc.close();
    }
}
