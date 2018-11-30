import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IntHack {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	StringBuffer sb = new StringBuffer(s);
        long count = 0;
        if(s.length() == n){
            char[] arr = s.toCharArray();
            for(int i = 0;i < n;i++){
                if(arr[i] == 'a'){
                    count++;
                }
            }
        }else if(s.length() < n){
        		while(s.length() < n) {
        			s = s.concat(s);
        			//sb.append(s);
        			//System.out.println(s);
        		}
        		char[] arr = s.toCharArray();
        		//char[] arr = sb.toString().toCharArray();
                for(int i = 0;i < n;i++){
                    if(arr[i] == 'a'){
                        count++;
                    }
                }
        }else{
        	char[] arr = s.toCharArray();
            for(int i = 0;i < n;i++){
                if(arr[i] == 'a'){
                    count++;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
