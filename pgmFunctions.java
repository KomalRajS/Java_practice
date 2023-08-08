import java.util.Scanner;
public class pgmFunctions {
   
    public static void printMyName(String name) {
        System.out.println("The entered name is : "+name);
    }
    
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int product(int a, int b) {
        return a*b;
    }

    public static void factorial() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("Factorial = "+f);
    }

    public static void main(String[] args) {
        System.out.println("Enter the option\n1.Name\n2.Sum\n3.Product\n4.Factorial");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch(opt) {
            case 1:
              System.out.println("\nEnter the name");
              String name = sc.next();
              printMyName(name);
              break;
            case 2:
              System.out.println("Enter two numbers");
              int a = sc.nextInt();
              int b = sc.nextInt();
              int sum = sum(a,b);
              System.out.println("The sum of the two numbers is : "+sum);
              break;
            case 3:
              System.out.println("Enter two numbers");
              a = sc.nextInt();
              b = sc.nextInt();
              System.out.println("The product of the two numbers is : "+product(a,b));
              break;
            case 4:
              factorial();
              break;
            default:
              System.out.println("Invalid choice");
        }
    }

}
