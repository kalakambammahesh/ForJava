import java.util.Scanner;
public class LeftShift {
	static void leftShift(int[] arr, int n, int d) {
		for(int i = 0; i < d;i ++) {
			leftShiftByOne(arr, n);
		}
	}
	
	public static void leftShiftByOne(int[] arr,int n) {
		int temp = arr[0];
		for(int i = 0;i < n-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int d = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0;i < n;i++) {
	    	arr[i] = sc.nextInt();
	    }
	    leftShift(arr, n, d);
	    for(int i = 0;i < n;i++) {
	    	System.out.println(arr[i]);
	    }
	}
	

}
