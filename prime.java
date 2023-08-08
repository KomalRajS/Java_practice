import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("\nEnter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2 ; i <= n/2 ; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) {
            if(n == 1) System.out.println(n+" is neither prime nor composite");
            else System.out.println(n+" is a prime number");
        }
        else System.out.println(n+" is not a prime number"); 
      /*   System.out.println("The prime numbers till "+n);
        for(int i = 2 ; i <= n ; i++) {
            boolean isPrime = true;
            for(int j = 2 ; j <= i/2 ; j++) {
                if(i % j == 0) {
                    isPrime = false;    
                    break;
                }
            }
                if(isPrime)
                System.out.println(i);
        }  */
    }
}
