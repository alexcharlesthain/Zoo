package castingZoo;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		//Creation of Animal
		Cat animal1 = new Cat("English Blue", "Grey", "Puss", "Fat");
		Dog animal2 = new Dog("Weimaraner", "Grey", "Roger", "Fat");
		Cow animal3 = new Cow("Jersey", "Brown", "Betty", "Fat");
		Parrot animal4 = new Parrot("Caribbean", "Multicolour", "Ronny", "Malnourished");
		Pigeon animal5 = new Pigeon("Wood", "Grey", "Piggy", "Malnourished");
		Owl animal6 = new Owl("Tawny", "Brown", "Tess", "Malnourished");

		///// Create List of Animals/////
		
		ArrayList<Animal> ListofMammals = new ArrayList<Animal>();
		ArrayList<Animal> ListofBirds = new ArrayList<Animal>();
		
		//////Add Animals to Zoo////////
		ArrayList<Animal> ListOfAnimals = new ArrayList<Animal>();
		
		Animal.add(animal1);
		Animal.add(animal2);
		Animal.add(animal3);
		Animal.add(animal4);
		Animal.add(animal5);
		Animal.add(animal6);

		/////List all Animals/////////
	
		System.out.println("This is a list of all animals in the zoo: ");
	
	
	}	
	
		////call for cat noise/////
        System.out.println("The noise this animal makes is");
        System.out.println(Cat.callSound());
         
        /////call for dog noise/////
        System.out.println("The noise this animal makes is");
        System.out.println(Dog.callSound());
        
        /////call for cow noise/////
        System.out.println("The noise this animal makes is");
        System.out.println(Cow.callSound());
        
        /////call for pigeon noise////
        System.out.println("The noise this animal makes is");
        System.out.println(Pigeon.callSound());
       
        /////call for owl noise//////
        System.out.println("The noise this animal makes is");
        System.out.println(Owl.callSound());
        
        ////call for parrot noise/////
        System.out.println("The noise this animal makes is");
        System.out.println(Parrot.callSound());



}
