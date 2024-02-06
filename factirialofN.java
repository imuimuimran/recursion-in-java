import java.util.*;

public class factirialofN {
    public static int claculateFactorial(int num) {
        if(num == 1 || num == 0) {
            return 1;
        }

        int factorial_num = claculateFactorial(num - 1);
        int factorial_n = num * factorial_num;

        return factorial_n;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = claculateFactorial(num);

        System.out.println("The result of factorial of " + num + " is: " + result);

        sc.close();
    }
}
