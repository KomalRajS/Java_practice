import java.util.Scanner;;

public class spiralOrderMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c]; 
        int rowStart = 0, rowEnd = r - 1, colStart = 0, colEnd = c - 1, i, j;
        System.out.println("Enter the elements of the matrix");
        for(i = 0; i < r; i++) {
            for(j = 0; j < c; j++) 
                matrix[i][j] = sc.nextInt();
        }
        System.out.println("The spiral order matrix is");
        while(rowStart <= rowEnd && colStart <= colEnd) {
            for(j = colStart; j <= colEnd; j++) 
                System.out.print(matrix[rowStart][j]+"\t");
            rowStart++;

            for(i = rowStart; i <= rowEnd; i++)
                System.out.print(matrix[i][colEnd]+"\t");
            colEnd--;

            for(j = colEnd; j >= colStart; j--)
                System.out.print(matrix[rowEnd][j]+"\t");
            rowEnd--;

            for(i = rowEnd; i >= rowStart; i--)
                System.out.print(matrix[i][colStart]+"\t");
            colStart++;

            System.out.println();
        }
    }
}