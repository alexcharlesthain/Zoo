package castingZoo;

public abstract class Bird extends Animal {

	////////variable////////
	protected String Weight;

	///constructors////////

	public Bird(String vSpecies, String vColour) {
		super(vSpecies, vColour);	
		this.Weight = "Malnourished";
}

	public Bird(String vSpecies, String vColour, String vWeight) {
		super(vSpecies, vColour);
		this.Weight = vWeight;
	
}
}



	














