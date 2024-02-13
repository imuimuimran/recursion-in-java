import java.util.*;
public class printSubsequenceinString_03 {
    public static void printSubseq(String str, int idx, String res) {
        if(idx == str.length()) {
            System.out.println(res);
            return;
        }
        //choose
        printSubseq(str, idx+1, res+str.charAt(idx));
        //don't choose
        printSubseq(str, idx+1, res);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        scanner.close();
        printSubseq(str, 0, "");
    }
}