import java.util.Scanner;

public class StringIsCyclic {
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s = sc.next();
		char[] char_arr = s.toCharArray();
		char[] rev_char_arr = new char[s.length()];
		
//		for(int i = 0;i < s.length();i++) {
//			for(int j = s.length()-1;j >= 0;j--) {
//				rev_char_arr[i] = char_arr[j];
//				//System.out.println(rev_char_arr);
//				System.out.println(char_arr[j]);
//			}
//		}
		//System.out.println(char_arr);
		//System.out.println(rev_char_arr);
		int j = s.length()-1;
		for(int i = 0;i < s.length();i++) {
			//if(j >= 0) {
				rev_char_arr[i] = char_arr[j];
				j--;
			//}
			
		}
		boolean result = true;
		for(int i = 0;i < s.length();i++) {
			if(!(rev_char_arr[i] == char_arr[i])) {
				result = false;
			}
		}
		System.out.println(result);
		System.out.println(rev_char_arr);
	}

}
