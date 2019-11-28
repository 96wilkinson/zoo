package zoo;

public abstract class Animal {
	// Only here to provide inheritance not anything else
	private int noOfLegs;
	private int noOfEyes;
	private String sciName;
	
	public abstract void move();
	
	public void die() {
		System.out.println("rip");
	}
	
	// to generate getters and setters below right click, source, generate
	// select all
	
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public int getNoOfEyes() {
		return noOfEyes;
	}
	public void setNoOfEyes(int noOfEyes) {
		this.noOfEyes = noOfEyes;
	}
	public String getSciName() {
		return sciName;
	}
	public void setSciName(String sciName) {
		this.sciName = sciName;
	}
	
	
}
