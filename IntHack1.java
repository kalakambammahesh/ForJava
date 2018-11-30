import java.util.Scanner;

public class IntHack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		char[] arr = sc.nextLine().toCharArray();
		long n =sc.nextLong();
		long count = 0;
		
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] == 'a') {
				count++;
			}
		}
		long factor = (long) (n/arr.length);
		long rem = (long) (n%arr.length);
		
		count = factor * count;
		for(int i = 0;i < rem;i++) {
			if(arr[i] == 'a') count++;
		}
		
		System.out.println(count);
			
	}

}
