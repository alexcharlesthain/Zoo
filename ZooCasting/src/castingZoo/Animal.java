package castingZoo;

public abstract class Animal extends Zoo {

	////instances/////
	protected String Species;
	protected String Colour;	

	///constructors////
	public Animal(String vSpecies) {
		this.Species = vSpecies;
		this.Colour = "Pink";
	
	}

	public Animal(String vSpecies, String vColour) {
		this.Species = vSpecies;
		this.Colour = vColour;
	
	}

		
	}


		
	