public class keypadeCombination_01 {

    /*
        0 -> .;
        1 -> abc
        2 -> def
        3 -> ghi
        4 -> jkl
        5 -> mno
        6 -> pqrs
        7 -> tu
        8 -> vwx
        9 -> yz
     */

    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKeypadCombination(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char crrChar = str.charAt(idx);
        String mapping = keypad[crrChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            printKeypadCombination(str, idx+1, combination + mapping.charAt(i)); 
        }
    }
    public static void main(String args[]) {
        String str = "23";
        printKeypadCombination(str, 0, "");
    }
}