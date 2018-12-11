package castingZoo;

public class Dog extends Mammal {

//////////////attributes///////////////

	//private String Species;
	//private String Colour;
	private String Name;
	
/////////////constructors/////////////

	public Dog(String vSpecies, String vColour, String vWeight, String vName) {
		super(vSpecies, vColour);
		this.Name = vName;
	}
	public Dog(String vSpecies, String vColour, String vWeight) {
		super(vSpecies, vColour, vWeight);
		this.Name = "Roger";
	}
		//this.Species = "Weimaraner";
		//this.Colour = "Grey";		
	

////////////methods//////////////////

	//private String getSpecies() {
		//return this.Species;
	//private String getColour() {	
		//return this.Colour;
	
	public String toString() {
		return "This Dog is a "+this.Species + "Its called "+ this.Name + ". Its colour is "+ this.Colour + "and its weight is " + this.Weight;
	}	
	public static String callSound() {
        return "Woooof";
	}
}

