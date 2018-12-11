package castingZoo;

public class Cat extends Mammal {

//////////////attributes///////////////

	//String Species;
	//String Colour;
	private String Name;

/////////////constructors/////////////

	public Cat(String vSpecies, String vColour, String vWeight, String vName) {
		super(vSpecies, vColour, vWeight);
		this.Name = vName;
	}
	public Cat(String vSpecies, String vColour, String vWeight) {
		super(vSpecies, vColour, vWeight);
		this.Name = "Puss";
		//this.Species = "English Blue";
		//this.Colour = "Grey";		
	}

	////////////methods//////////////////
	//private String getSpecies() {
		//return this.Species;
	
	//private String getColour() {
		//return this.Colour;
		
	
	public String toString() {
		return "This Cat is a "+this.Species + "Its called "+ this.Name + ". Its colour is "+ this.Colour + "and its weight is " + this.Weight;
}
	public static String callSound() {
        return "Meowww";
}
}
