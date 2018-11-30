
public class MyDeadLock {
	String str1 = "mahi";
	String str2 = "mahesh";
 	Thread t1 = new Thread() {
		public void run() {
			while(true) {
				synchronized(str1) {
					synchronized(str2) {
						System.out.println(str1 + " " + str2);
					}
				}
				
			}
		}
	};
	Thread t3 = new Thread() {
		public void run() {
			while(true) {
				synchronized(str1) {
					synchronized(str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		MyDeadLock md = new MyDeadLock();
		
		md.t1.start();
		md.t3.start();
	}
}
