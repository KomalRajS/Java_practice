import java.util.Scanner;
public class switchCalci {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\nEnter the option\nA.Addition\nB.Subtraction\nC.Multiplication\nD.Modulus or Remainder\nE.Division");
        Scanner sc = new Scanner(System.in);
        String opt = sc.next();
        System.out.println("Enter two numbers");
        int p = sc.nextInt();
        int q = sc.nextInt();
        switch(opt) {
            case "A": System.out.println("Sum = "+(p+q));
            break;
            case "B": System.out.println("Difference = "+(p-q));
            break;
            case "C": System.out.println("Product = "+(p*q));
            break;
            case "D": System.out.println("Remainder = "+(p%q));
            break;
            case "E": {
                if(q != 0)  System.out.println("Quotient = "+p/q);
                else System.out.println("Division not possible");
            break;
            }
            default:
                System.out.println("Invalid choice");
        }
    }
}
       