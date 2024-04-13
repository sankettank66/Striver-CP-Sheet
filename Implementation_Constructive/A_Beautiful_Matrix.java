import java.util.Scanner;

/**
 * A_Beautiful_Matrix
 */
public class A_Beautiful_Matrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0,y=0;
        int[][] matrix=new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==1)
                {
                    x=i;
                    y=j;
                }
            }
        }
        int steps = Math.abs(x - 2) + Math.abs(y - 2);
        System.out.println(steps);
    }
}