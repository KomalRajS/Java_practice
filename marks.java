import java.util.*;
public class marks {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the choice - 1 to proceed / 0 to exit");
            choice = sc.nextInt();
            if(choice == 1) {
                System.out.println("Enter your marks");
                int marks = sc.nextInt();
                if(marks >= 90) System.out.println("Excellent marks");
                else if(marks <= 60) System.out.println("Good marks");
                else System.out.println("This is good as well");
            }
        }while(choice != 0);
    }
    
}
