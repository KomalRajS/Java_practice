import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        System.out.println("\nEnter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("You are an adult as you're "+age+" years old");
        } else {
            System.out.println("You are not an adult");
        }
    }
    
}
