import java.util.Scanner;
public class parseString {
    public static void main(String[] args) {
        System.out.println("\nEnter the number string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        System.out.println(num);

        System.out.println("Enter the integer");
        num = sc.nextInt();
        str = Integer.toString(num);
        System.out.println(str);  

      
            /*     String str = "123";
                int number = Integer.parseInt(str);
                System.out.println(number);    */
            
    }
}
