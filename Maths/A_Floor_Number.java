package Maths;
import java.util.Scanner;

/**
 * A_Floor_Number
 */
public class A_Floor_Number {
    public static int findFloorNumber(int n, int x) {
        if (n <= 2) {
            return 1; 
        } else {
            int remainingApartments = n - 2;
            int floors = 1 + (remainingApartments + x - 1) / x;
            return floors;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int floorNumber = findFloorNumber(n, x);
            System.out.println(floorNumber);
        }

        scanner.close();
    }
}