import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctLettersInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int length = s.length();
		char[] arr = s.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i = 0;i < length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set.size());
	}

}
