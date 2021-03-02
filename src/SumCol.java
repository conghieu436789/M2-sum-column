import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = input.nextInt();
        System.out.println("Enter cols");
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i =0; i<rows; i++) {
            System.out.printf("Enter row %d %n",i+1);
            for (int j=0; j<cols; j++) {
                System.out.printf("Enter number %d %n", j+1);
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i=0; i<rows; i++) {
            for (int j =0; j<cols; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.println("Enter col to get sum");
        int colSum, sum = 0;
        do {
            colSum = input.nextInt();
        } while (colSum<0 || colSum>=cols);
        for (int i =0; i<rows; i++) {
            for (int j =0; j<cols; j++) {
                if (j == colSum) {
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.printf("The total of elements in col %d is %d", colSum, sum);
    }
}
