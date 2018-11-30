import java.util.Scanner;

public class CountingNumbers {

	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int number = sc.nextInt();
		int times = sc.nextInt();
		int temp = number;
		long total = 0;
		
		for(int i = 0;i < times;i++) {
			total += number;
			//System.out.println("total "+total);
			number = (number * 10) + temp;
			//System.out.println("number "+number);
		}
		System.out.println(total);
		sc.close();
		
//		System.out.println(number);
//		System.out.println(times);
	}

}
