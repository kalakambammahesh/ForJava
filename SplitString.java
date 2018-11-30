import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		
		int length = s.length();
		int space = 0;
		for(int i = 0;i < length;i++) {
			if(s.charAt(i) == ' ') space++;
		}
		
		String[] arr = new String[space + 1];
		
		String nxt = "";
		int j = 0;
		for(int i = 0;i < length;i++) {
			if(s.charAt(i) == ' ') {
				arr[j] = nxt;
				j++;
				nxt = "";
			}else {
				nxt += s.charAt(i);
			}
			arr[j] = nxt;
		}
		for(String str : arr) {
			System.out.println(str);
		}
	}

}
