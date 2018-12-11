package castingZoo;

public class Parrot extends Bird {

////////attributes/////////////
	//String Species;
	//String Colour;
	private String Name;
	
///////constructors/////////	
	
	public Parrot(String vSpecies, String vColour, String vWeight, String vName) {
		super(vSpecies, vColour, vWeight);
		this.Name = vName;
	}
	public Parrot(String vSpecies, String vColour, String vWeight) {	
		super(vSpecies, vColour, vWeight);
		this.Name = "Ronny";
		//this.Species = "Carribean";
		//this.Colour = "Multicolour";
	}
	
	public String toString() {
		return "This Parrot is a "+this.Species+ "Its name is "+ this.Name + "and its colour is "+this.Colour + "and its weight is " + this.Weight;
	}
	
	public static String callSound() {
        return "Bakoorrrr";
        
	}	
}
