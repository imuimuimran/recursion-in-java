import java.util.*;
public class waystoInviteNPeople {
    public static int callpeople(int n) {
        if(n <= 1) {
            return 1;
        }
        // Single Case
        int way1 = callpeople(n - 1);

        // Pair Case
        int way2 = (n - 1) * callpeople(n - 2);

        int totalWays = way1 + way2;

        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of N people: ");
        int n = sc.nextInt();

        int result = callpeople(n);
        System.out.println(result);

        sc.close();
    }
}
