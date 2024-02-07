import java.util.*;

public class fibonacciSequence {
    public static void printFibonacci(int firsrSequence, int secondSequence, int num) {
        if(num == 0) {
            return;
        }

        int nxtSequence = firsrSequence + secondSequence;
        System.out.println(nxtSequence);
        printFibonacci(secondSequence, nxtSequence, num-1);
    }

    public static void main(String arg[]) {
        int firstSequence = 0;
        int secondSequence = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(firstSequence);
        System.out.println(secondSequence);
        printFibonacci(firstSequence, secondSequence, num-2);

        sc.close();
    }
}