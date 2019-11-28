package zoo;

public abstract class Mammal extends Animal{
	private int amountOfFur;
	
	public Mammal(int noOfLegs, int noOfEyes, String SciName) {
		this.setNoOfLegs(noOfLegs);
		this.setNoOfLegs(noOfLegs);
		this.setSciName(SciName);
	}
	
	public void lactate() { 
		System.out.println("got milk?");
	}
	public int getAmountOfFur() {
		return amountOfFur;
	}
}
