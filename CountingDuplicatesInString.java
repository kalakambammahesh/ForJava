import java.util.Scanner;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class CountingDuplicatesInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char[] char_arr = s.toCharArray();
		//List<Character> list = new ArrayList<Character>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0;i < s.length();i++) {
			if(map.containsKey(char_arr[i])) {
				int n = map.get(char_arr[i]);
				map.put(char_arr[i], n +1);
			}else {
				map.put(char_arr[i], 1);
			}
		}
		System.out.println(map);
	}

}
