package castingZoo;

public class Owl extends Bird {

	////////attributes/////////////
	//String Species;
	//String Colour;
	private String Name;

	///////constructors/////////	

	public Owl(String vSpecies, String vColour, String vWeight, String vName) {
		super(vSpecies, vColour, vWeight);
		this.Name = vName;
	}
	public Owl(String vSpecies, String vColour, String vWeight) {
		super(vSpecies, vColour, vWeight);
		this.Name = "Tess";
		//this.Species = "Tawny";
		//this.Colour = "Brown";
	}

	///////methods//////////

	//private String getSpecies() {
		//return this.Species;		
	//private String getColour() {
		//return this.Colour;

	public String toString() {
		return "This Owl is a "+this.Species + "Its called "+ this.Name + ". Its colour is "+ this.Colour + "and its weight is " + this.Weight;
	}

	public static String callSound() {
        return "Tweeet";

	}
}
