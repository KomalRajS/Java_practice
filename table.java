import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        System.out.println("\nEnter the number");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i = 0 ; i <= 10 ; i++) {
           int a = n * i;
           System.out.println(a);
    }
    }
    
}
