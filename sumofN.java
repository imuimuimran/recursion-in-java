import java.util.*;

public class sumofN {
    public static void printSum(int i, int n, int sum) {
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printSum(i +1, n, sum);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first natural number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the last natural number: ");
        int lastNum = sc.nextInt();
        System.out.print("initial the value of initial sum which is 0: ");
        int sum = sc.nextInt();

        printSum(firstNum, lastNum, sum);

        sc.close();
    }
}