import java.util.Scanner;
public class stringLength {
    public static void main(String[] args) {
        int len = 0;
        System.out.println("\nEnter the number of string inputs");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] array = new String[size];


        for(int i = 0; i < size; i++) {
            System.out.print("\nEnter the string - "+(i+1)+" :\t");
            array[i] = sc.next();
            len += array[i].length();
        }

        System.out.println("\nThe combined length of the strings entered is "+len);     

        
    }

   
}
