import java.io.*;
import java.util.*;

public class LibraryBookProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        String s1 = scan.nextLine();
        String[] arr1 = s1.split(" ");
        
        int DateA = Integer.parseInt(arr1[0]);
        int MonthA = Integer.parseInt(arr1[1]);
        int YearA = Integer.parseInt(arr1[2]);
        
        String s2 = scan.nextLine();
        String[] arr2 = s2.split(" ");
        
        int DateE = Integer.parseInt(arr2[0]);
        int MonthE = Integer.parseInt(arr2[1]);
        int YearE = Integer.parseInt(arr2[2]);
        
        if(YearE < YearA) System.out.println("10000");
        else if(MonthE < MonthA && YearE == YearA) System.out.println(500 * (MonthA - MonthE));
        else if(DateE < DateA && MonthE == MonthA && YearE== YearA) System.out.println(15 * (DateA - DateE));
        else System.out.println("0");
        
    }
}

