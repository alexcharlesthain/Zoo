package castingZoo;

public abstract class Mammal extends Animal {

	////////variable////////
	protected String Weight;
	
	///constructors////////
	
	public Mammal(String vSpecies, String vColour) {
		super(vSpecies, vColour);	
		this.Weight = "Fat";
	}

	public Mammal(String vSpecies, String vColour, String vWeight) {
		super(vSpecies, vColour);
		this.Weight = vWeight;
		
	}
	}


