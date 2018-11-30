import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxElementInArray2 {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int l = sc.nextInt();
		int[] arr = new int[l];
		int max = 0, smax = 0;
		
		for(int i = 0;i < l;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max ) {
				int temp = max;
				max = arr[i];
				smax = temp;
			}
		}
		System.out.print(smax);
		
		sc.close();

	}

}
