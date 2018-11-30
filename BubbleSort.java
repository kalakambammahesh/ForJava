import java.util.Scanner;

public class BubbleSort {
	
	static void printArr(int[] arr, String s ) {
		System.out.println(s);
		for(int i = 0; i < arr.length;i++) {
			System.out.print(" " + arr[i]);
		}//end for
		System.out.println();
	}
	
	public static void bubbleSort(int[] arr) {
		int swapPosition;
		int endPosition = arr.length - 1;
		while(endPosition > 0 ) {
			swapPosition = 0;
			
			for(int i = 0;i < endPosition;i++) {
				if(arr[i] > arr[i+1]) {
					//swap
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapPosition = i;
				}
				
				printArr(arr, "current");
			}//end of if
			endPosition = swapPosition;
		}//end of while
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}//end for
		
		printArr(arr, "Unsorted");
		bubbleSort(arr);
	}

}
