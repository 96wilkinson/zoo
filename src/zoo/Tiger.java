package zoo;

public class Tiger extends Mammal{
	
	public Tiger() {
		super(4,2,"Tiggo");
	}
	
	@Override
	public void move() {
		System.out.println("Boing!");
	}
}
