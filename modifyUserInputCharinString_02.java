import java.util.Scanner;

public class modifyUserInputCharinString_02 {
    public static void moveSpecificCharAtTheBeginning(String str, char ch, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = ch + newString; // Prepend the character at the beginning
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
        moveSpecificCharAtTheBeginning(str, ch, idx + 1, count, newString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to move to the beginning: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        moveSpecificCharAtTheBeginning(str, ch, 0, 0, "");
    }
}
