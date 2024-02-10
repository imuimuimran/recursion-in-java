import java.util.*;
public class isArraySorted {
    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length - 1) {
            return true;
        }

        if(arr[idx] <= arr[idx +1]) {
            // array is sorted till now
            return isSorted(arr, idx + 1);
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        // Input
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));

        sc.close();

    }
}
