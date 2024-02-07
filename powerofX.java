import java.util.*;

public class powerofX {
    public static int calculatePower(int x, int num) {
        // base case 1
        if(num == 0) {
            return 1;
        }
        // base case 2
        if(x == 0) {
            return 0;
        }

        int xPowNm1 = calculatePower(x, num - 1);
        int xPowN = x * xPowNm1;
        return xPowN;
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