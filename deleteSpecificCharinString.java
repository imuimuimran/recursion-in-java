import java.util.Scanner;

public class deleteSpecificCharinString {
    public static void deleteAllSpecificChars(String str, char ch, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println("Modified String: " + newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar != ch) {
            newString += currChar;
        }
        deleteAllSpecificChars(str, ch, idx + 1, newString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to delete: ");
        char ch = scanner.next().charAt(0); 
        scanner.close();

        deleteAllSpecificChars(str, ch, 0, "");
    }
}
