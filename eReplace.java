import java.util.Scanner;
public class eReplace {
    public static void main(String[] args) {
        String result = "";
        System.out.println("\nEnter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'e')  result += 'i';
            else result += str.charAt(i);
        }
        System.out.println("The entered string is : "+str);
        System.out.println("The altered string is : "+result);
    }
}
