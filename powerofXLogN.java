import java.util.*;

public class powerofXLogN {
    public static int calculatePower(int x, int num) {
        // base case 1
        if(num == 0) {
            return 1;
        }
        // base case 2
        if(x == 0) {
            return 0;
        }

        // if num is even
        if(num % 2 == 0) {
            return calculatePower(x, num / 2) * calculatePower(x, num / 2);
        }else{ // if num is odd
            return calculatePower(x, num / 2) * calculatePower(x, num / 2) * 2;
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number of X: ");
        int x = sc.nextInt();

        System.out.print("Enter a number which is power of X: ");
        int num = sc.nextInt();

        int result = calculatePower(x, num);

        System.out.println("Power of " + num + " of " + x + " is: " + result);

        sc.close();
    }
}
