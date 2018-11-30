import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class DuplicatesInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char[] char_arr = s.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for(int i = 0;i < s.length();i++) {
			if(!list.contains(char_arr[i])) {
				list.add(char_arr[i]);
			}
		}
		System.out.println(list);
	}

}
