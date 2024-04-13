import java.util.Scanner;

public class A_Anton_and_Polyhedrons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline character
        int sum = 0;
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            switch (str) {
                case "Tetrahedron":
                    sum += 4;
                    break;
                case "Cube":
                    sum += 6;
                    break;
                case "Octahedron":
                    sum += 8;
                    break;
                case "Dodecahedron":
                    sum += 12;
                    break;
                case "Icosahedron":
                    sum += 20;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
