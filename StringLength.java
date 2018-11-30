import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		Pattern p = Pattern.compile("$");
//		Matcher m = p.matcher(str);
//		m.find();
//		int length = m.end();
//				System.out.println(length);
		int count = 0;
		for(char c : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
