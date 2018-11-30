import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class SecondMaxElementInArray {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
/*		int l = sc.nextInt();
		int[] arr = new int[l];
		
		for(int i = 0;i < l;i++) {
			arr[i] = sc.nextInt();
		}*/
		
		
		//sushil
		int arr[] = {2,42,4,53,3,12};
		
		BitSet bitSet = new BitSet();
		for(int i =0;i<arr.length;i++) {
			bitSet.set(arr[i]-1);
		}
		System.out.println("bit seet " + (bitSet.previousSetBit(bitSet.length()-3) + 1));
		
		//Arrays.sort(arr);
		//System.out.println((int)arr[l-2]);
		
		sc.close();

	}

}
