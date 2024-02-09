import java.util.*;
public class printString {
        public static String Strings(String str) {
                if(str.length() == 1) {
                return str;
            }
            char currChar = str.charAt(0);
            String nextString = Strings(str.substring(1));
            return nextString + currChar;
        }
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a word or sentence: ");  
            String str = sc.nextLine(); 

            System.out.println(str);

            sc.close();
        }
    }
