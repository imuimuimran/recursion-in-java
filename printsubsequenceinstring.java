public class printsubsequenceinstring {
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
        String str = "abc";
        printSubsequence(str, 0, "");
        
    }
}