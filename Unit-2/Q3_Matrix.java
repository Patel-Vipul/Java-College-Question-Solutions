
import java.util.Scanner;

public class Q3_Matrix {
    public static void main(String[] args) {
        
        /*Q3. Write a program to find sum of two matrices of 3 x3.  */

        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int sum[][] = new int[3][3];

        System.out.println("Enter Elements of Matrix1;");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Element "+(i+1)+","+(j+1));
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements of Matrix2");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Element "+(i+1)+","+(j+1));
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of Two Matrixes");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
     
    }
}
