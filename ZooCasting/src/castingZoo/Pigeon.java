package castingZoo;

public class Pigeon extends Bird {

//////////////attributes///////////////

	//String Species;
	//String Colour;
	private String Name;

/////////////constructors/////////////

	public Pigeon(String vSpecies, String vColour, String vWeight, String vName) {
		super(vSpecies, vColour, vWeight);
		this.Name = vName;
	}
	public Pigeon(String vSpecies, String vColour, String vWeight) 	{
		super(vSpecies, vColour, vWeight);
		this.Name = "Piggy";	
		}

////////////methods//////////////////

	//private String getSpecies() {
		//return this.Species;

	//private String getColour() {	
		//return this.Colour;

	public String toString() {
		return "This Pigeon is a "+this.Species + "Its called "+ this.Name + ". Its colour is "+ this.Colour + "and its weight is " + this.Weight;

	}
	public static String callSound() {
        return "Cooo";
	}	
}

