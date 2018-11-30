import java.io.*;
import java.util.*;



public class TryCatchInHacker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        
        try {
        	int n1 = Integer.parseInt(sc.next());
        	int n2 = Integer.parseInt(sc.next());
        	int n = n1 / n2;
        	System.out.println(n);
        }catch(NumberFormatException e) {
        	System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException e) {
        	System.out.println("java.util.ArithmeticException:" + e.getMessage());
        }
    }
}

