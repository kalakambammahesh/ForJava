import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BitWiseAnd {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            int[] arr = new int[n];
            
            int N = 1;
            for(int i = 0;i < n;i++) {
            	arr[i]  = N;
            	N++;
            }
            int tempResult = 0, result = 0;
            for(int i = 0;i < n -1;i++) {
            	for(int j = i + 1;j < n;j++) {
            		if(arr[i] < arr[j]) {
            			tempResult = arr[i] & arr[j];
            		}
            		if(tempResult < k && tempResult > result)
            			result = tempResult;
            	}
            }
            System.out.println(result);
        }

        scanner.close();
    }
}