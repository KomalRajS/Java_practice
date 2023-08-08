import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        boolean isFound = false;
        System.out.println("\nEnter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) 
                matrix[i][j] = sc.nextInt();
        }
        System.out.println("The entered matrix is");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) 
                System.out.print(matrix[i][j]+" \t");
            System.out.println();
        }
    
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        for( int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(matrix[i][j] == x)  {
                    System.out.println(x+" found at row - "+(i+1)+", column - "+(j+1));
                    isFound = true;
                    }
            }
        }
        if(!isFound) System.out.println("Element not found");
    }
}
