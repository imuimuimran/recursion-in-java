import java.util.*;
public class towerofHanoi {
        public static void towerOfHanoi(int num, String src, String helper, String dest) {
            if(num == 1) {
                System.out.println("transfer disk " + num + " from " + src + " to " + dest);
                return;
            }
            
            //transfer top n-1 from src to helper using dest as 'helper'
            towerOfHanoi(num-1, src, dest, helper);
            
            //transfer nth from src to dest
            System.out.println("transfer disk " + num + " from " + src + " to " + helper);
            
            //transfer n-1 from helper to dest using src as 'helper'
            towerOfHanoi(num-1, helper, src, dest);
        }
        
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter disc number: ");
            int num = sc.nextInt();
            towerOfHanoi(num, "A", "B", "C");

            sc.close();
        }
    }