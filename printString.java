import java.util.*;
public class printString {
        public static String revString(String str) {
                if(str.length() == 1) {
                return str;
            }
            char currChar = str.charAt(0);
            String nextString = revString(str.substring(1));
            return nextString + currChar;
        }
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter Your Name with multiple word: ");  
            String str = sc.nextLine(); 

            System.out.println(str);

            sc.close();
        }
    }
