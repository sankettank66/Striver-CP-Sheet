import java.util.Scanner;

/**
 * A_Gennady_and_a_Card_Game
 * @author Sanket Tank
 */
public class A_Gennady_and_a_Card_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.next();
        String[] tableCards = new String[5];
        for (int i = 0; i < 5; i++) {
            tableCards[i] = sc.next();
        }
        boolean found = false;
        for (String tableCard : tableCards) {
            if (tableCard.charAt(0) == card.charAt(0) || tableCard.charAt(1) == card.charAt(1)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();

    }
}