
public class BitWiseOr {
	
	BitWiseOr(String name, Integer number){
		 String  binaryNumber = Integer.toBinaryString(number);
		 
		 for(byte b : name.getBytes()) {
			 int temp = b | number;
			 
			 System.out.println(Integer.toBinaryString(b) + " OR " + binaryNumber + " = "
					 + Integer.toBinaryString(temp) + " = " + temp);
		 }
	}

	public static void main(String[] args) {
		
		new BitWiseOr("Mahesh", 1300100547);

	}

}
