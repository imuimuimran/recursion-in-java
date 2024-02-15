import java.util.*;
import java.util.Scanner;
// Print all subsets of a set of N natural numbers.
public class printSubsetsofaNumbers {
    public static void printSubset(ArrayList<Integer> subset) {
        for(int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubset(subset);
            return;
        }
        // To be add
        subset.add(n);
        findSubset(n - 1, subset);

        // Not to be add
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N natural number: ");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);

        sc.close();

    }
}
