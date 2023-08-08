import java.util.Scanner;
public class nSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("\nEnter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++) {
            sum += i;
        }
        System.out.println("Sum = "+sum);
    }
}