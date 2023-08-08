import java.util.Scanner;
public class practiseQstns {
    public static void average(int a, int b, int c) {
        final float avg = (float)(a+b+c)/ 3;
        System.out.println("Average = "+avg);
    }

    public static void oddSum(int n) {
        int sumo = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) 
                sumo += i ;
        }
        System.out.println(" is "+sumo);
    }

    public static int numGreat() {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int g = p > q ?( p > r ? p : r) : ( q > r ? q : r);
        return g;
    }
    public static void main(String[] args) {
        System.out.println("\n Enter the option\n1.Average\n2.Sum of odd numbers\n3.Greatest of 3 numbers");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch(opt) {
            case 1:
                System.out.println("Enter 3 numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                average(a,b,c);
                break;
            case 2:
                System.out.println("Enter the value of n");
                int n = sc.nextInt();
                System.out.print("The sum of odd numbers till "+n);
                oddSum(n);
                break;
            case 3:
                System.out.println("The greatest integer is "+numGreat());
                break;
        }
    }
}
