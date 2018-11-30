import java.util.Scanner;

public class Temperature {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] values = new int[n];
		int j = 0;
		int least = Integer.MIN_VALUE;
		while(n > 0) {
			values[j] = sc.nextInt();
			if(least > values[j]) {
				least = values[j];
			}
			j++;
			n--;
		}
		System.out.println(least);
	}

}
