import java.util.*;

public class modifyUserInputCharinString {
    public static void moveAllSpecificCharAtTheEnd(String str, char ch, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += ch;
            }
            System.out.println("Modified String: " + newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == ch) {
            count++;
        } else {
            newString += currChar;
        }
        moveAllSpecificCharAtTheEnd(str, ch, idx + 1, count, newString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to move to end: ");
        char ch = scanner.next().charAt(0); // Read a single character
        scanner.close();

        moveAllSpecificCharAtTheEnd(str, ch, 0, 0, "");
    }
}
