import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        int[] a = new int[50];
        boolean search = false;
        System.out.println("\nEnter the number of elements");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array one by one");
        for(int i = 0; i < size; i++)
            a[i] = sc.nextInt();

        System.out.print("The entered elements are\t");
        for(int i = 0; i < size; i++) {
            System.out.print(a[i]);
            System.out.print("\t");
        }

        System.out.println("\nEnter the element to be searched :");
        int x = sc.nextInt();

        for(int i = 0; i < size; i++) {
            if(a[i] == x) {
                System.out.println(x+" found at the location "+i);
                search = true;
            }
        }

        if(!search)    System.out.println("Element not found");
    }
}
