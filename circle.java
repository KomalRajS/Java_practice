import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
    System.out.println("\nEnter the radius of the cicle");
    try (Scanner sc = new Scanner(System.in)) {
        int r = sc.nextInt();
        double area = 3.14 * r * r;
        double circumference = 2 * 3.14 * r;
        System.out.println("Area = "+area);
        System.out.println("Circumference = "+circumference);
    }
    }
}