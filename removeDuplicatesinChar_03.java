import java.util.Scanner;

public class removeDuplicatesinChar_03 {
    public static String removeDuplicates(String str, int idx, boolean present[]) {
        if (idx == str.length()) {
            return "";
        }
        char curr = str.charAt(idx);
        if (present[curr - 'a']) {
            return removeDuplicates(str, idx + 1, present);
        } else {
            present[curr - 'a'] = true;
            return curr + removeDuplicates(str, idx + 1, present);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        scanner.close();

        boolean present[] = new boolean[26]; // Assuming input contains only lowercase letters

        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + removeDuplicates(str, 0, present));
    }
}
