import java.util.Scanner;
public class checkAscending{
    public boolean ascending(int[] arr) {
        boolean isAscending = true;
        for(int i = 1; i < arr.length-1; i++) {
            if(arr[i] < arr[i-1]) {
                isAscending = false;
                break;
            }
        }
        return isAscending;
    }

    public static void main(String[] args) {
        System.out.println("\nEnter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter th elements of the array");
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        checkAscending obj = new checkAscending();
        if(obj.ascending(arr)) System.out.println("The elements are in ascending order");
        else System.out.println("The elements are not in ascending order");
    }    
}
