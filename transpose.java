import java.net.SocketImpl;
import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        System.out.println("\nEnter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int M[][] = new int[r][c];
        int i, j;
        System.out.println("Enter the elements");
        for(i = 0; i < r; i++) 
            for(j = 0; j < c; j++) 
                M[i][j] = sc.nextInt();
        System.out.println("The entered Matrix is :");
        for(i = 0; i < r; i++) {
            for(j = 0; j < c; j++) {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("The transpose of the matrix is :");
        for(i = 0; i < c; i++) {
            for(j = 0; j < r; j++)
                System.out.print(M[j][i]+"\t");
            System.out.println();
        }
        
    }
    
}
