import java.util.*;

public class basicRecursion_02 {
    public static void printNum(int num) {
        if(num == 6) {
            return;
        }

        System.out.println(num);
        printNum(num + 1);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number whice you want to recursion with increasing: ");
        int num = sc.nextInt();

        printNum(num);

        sc.close();
    }
}