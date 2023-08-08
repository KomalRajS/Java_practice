import java.util.Scanner;
public class greeting {
    public static void main(String[] args) {
        System.out.println("\nEnter the option(1 to 5)");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch(opt) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Vanakkam");
            break;
            case 4: System.out.println("Salaam");
            break;
            case 5: System.out.println("Namaskara");
            break;
            default : System.out.println("Invalid option");

        }
    }
}
