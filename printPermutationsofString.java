public class printPermutationsofString {
    public static void printPrmutation(String str, String permutations) {
        if(str.length() == 0) {
            System.out.println(permutations);
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char crrChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPrmutation(newString, permutations + crrChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPrmutation(str, "");
    }
}
