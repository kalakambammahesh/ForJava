import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Prime{
	static boolean prime(int n) {
			int sqrt = (int)Math.sqrt(n);
			for(int i = 2 ;i <= sqrt;i++) {
				if(n % i == 0) {
					return false;
				}
			}
		return true;
	}
	public void checkPrime(int... intArgs) {
		for(int number:intArgs) {
			if(number >= 2 && Prime.prime(number)) System.out.print(number + " ");
		}
		System.out.println();
	}
}

public class InnerClass {

	//private static InputStream in;

	private static final InputStream in = null;

	public static void main(String[] args)//, InputStream in)
	{
		try{
		//InputStream in = null;
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

