import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatrixQuestion {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int testCase = sc.nextInt();
		while(testCase-- > 0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			char[][] arr = new char[n][m];
			
			
			
			for(int i = 0;i < n;i++) {
				char[] char_arr = sc.next().toCharArray();
				for(int j = 0;j < m;j++) {
					arr[i][j] = char_arr[j];
					//System.out.println(arr[i][j]);
				}
				
			}
			char c = '0';
			int j = 0;
			boolean flag = false;
			while(j < m) {
				for(int i = 0;i < n;i++) {
					
					
					if(c != arr[i][j]) {
						flag = true;
					}
				}
				j++;
			}
			System.out.println(flag);
		}
	}

}
