import java.util.Scanner;
public class usernameEmail {
    public static void main(String[] args) {
        String username = "";
        System.out.println("\nEnter the Email ID");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        for(int i = 0; i < id.length(); i++) {
            if(id.charAt(i) == '@')   break;
            else username += id.charAt(i);
        }

        System.out.println("The username is "+username+" for the entered "+id+" Email ID");
    }
}
