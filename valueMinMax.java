import java.util.Scanner;
public class valueMinMax {
    public static void main(String[] args) {
        System.out.println("\nEnter the number of elements\n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++) 
            arr[i] = sc.nextInt();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max)   max = arr[i];
            if(arr[i] < min)   min = arr[i];
        }

        System.out.println("The maximum number in the array is "+max);
        System.out.println("The minimum number in the array is "+min);
    }
}
