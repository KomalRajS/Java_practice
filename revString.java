import java.util.Scanner;
public class revString {
    public static void main(String[] args) {
        System.out.println("\nEnter the string");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println("The reversed string is : "+sb);
    }
}
