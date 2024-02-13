import java.util.*;
public class printSubsequenceinString_02 {
    public static void printSubsequence(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char crrChar = str.charAt(idx);
        
        // Taken
        printSubsequence(str, idx + 1, newString + crrChar);

        // Not Taken
        printSubsequence(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        scanner.close();

        printSubsequence(str, 0, "");
        
    }
}