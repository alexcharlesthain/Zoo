package castingZoo;

public class Cow extends Mammal {

//////////////attributes///////////////

	//private String Species;
	//private String Colour;
	private String Name;

/////////////constructors/////////////

	public Cow(String vSpecies, String vColour, String vWeight, String vName) {
		super(vSpecies, vColour, vWeight);
		this.Name = vName;
	}
	public Cow(String vSpecies, String vColour, String vWeight) {
		super(vSpecies, vColour, vWeight);
		this.Name = "Betty";	
	}	
		//this.Species = "Jersey";
		//this.Colour = "Brown";		

	
////////////methods//////////////////

	//private String getSpecies() {
		//return this.Species;
	//private String getColour() {	
		//return this.Colour;

	public String toString() {
		return "This Cow is a "+this.Species+"Its called "+ this.Name + ". Its colour is "+this.Colour + "and its weight is " + this.Weight;

	}
	public static String callSound() {
        return "Moooo";	
	}
}

