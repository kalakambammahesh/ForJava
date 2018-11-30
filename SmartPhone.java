
public abstract class SmartPhone {
	public String Model;
	public int releaseYear;
	public String brand;
	
	abstract void calling();
	abstract void  messaging();
}

interface camera{
	void takingPicture();
}

interface Player{
	void listeningSongs();
}

class Moto extends SmartPhone {
	void calling() {
		System.out.println("Calling....");
	}
	void messaging() {
		System.out.println("Messaging....");
	}
}
class Iphone extends SmartPhone implements camera, Player{

	@Override
	void calling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void messaging() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takingPicture() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listeningSongs() {
		// TODO Auto-generated method stub
		
	}
	
	
}