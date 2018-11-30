
public class SingleTonClass {
	
	private static SingleTonClass myObj = null;
	static {
		myObj = new SingleTonClass();
	}
	
	private SingleTonClass() {
		
	}
	public static SingleTonClass getInstance() {
		return myObj;
	}
	public void dispaly() {
		System.out.println("Its working....");
	}

	public static void main(String[] args) {
		
		SingleTonClass obj = getInstance();
		obj.dispaly();
		System.out.println(obj);
		System.out.println(myObj);
		SingleTonClass obj2 = new SingleTonClass();
		System.out.println(obj2);
	}

}
