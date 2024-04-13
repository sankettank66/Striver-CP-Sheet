import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int statementsNbr = scanner.nextInt();
        int x = 0;
        for (int i = 0; i < statementsNbr; i++) {
            String statement = scanner.next();
            switch (statement) {
                case "++X":
                case "X++":
                    x++;
                    break;
                case "X--":
                case "--X":
                    x--;
                    break;
            }
        }
        System.out.println(x);
    }
}