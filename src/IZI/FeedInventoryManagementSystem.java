/**
 * 
 */
package IZI;

/**
 * @author Ken Fultz
 *
 */
public class FeedInventoryManagementSystem {

	/**
	 * 
	 */
	
	public int numberOfSpecies = 3;
	
	public FeedInventoryManagementSystem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEGIN MAIN");
		
		Species species[];
		Animal animals[];
		Feeding feedings[];
		
		species = setupSpecies();
		animals = setupAnimals(species);
		feedings = setupFeedings(animals);
		
		System.out.println("Animal #1 is: " + animals[0].getSpecies().getName() + " " +  animals[0].getName());

	}

	private static Species[] setupSpecies() {
		Species species[] = new Species[3];
		
		for(int index = 0; index < 3; index++) {
			species[index] = new Species(index);
		}
		
		species[0].setName("Lion");
		species[1].setName("Giraffe");
		species[2].setName("Unicorn");
		
		return species;
	}

	private static Animal[] setupAnimals(Species[] theSpecies) {
		Animal animals[] = new Animal[3];
		for(int index = 0; index < 3; index++) {
			animals[index] = new Animal(index);
		}
		
		animals[0].setSpecies(theSpecies[0]);
		animals[0].setName("Leo");
		//animals[0].setFeedings();
		
		animals[1].setSpecies(theSpecies[1]);
		animals[1].setName("Wilt");
		//animals[1].setFeedings();
		
		animals[2].setSpecies(theSpecies[2]);
		animals[2].setName("Unicron");
		//animals[2].setFeedings();
		
		return animals;
	}
	
	private static Feeding[] setupFeedings(Animal[] theAnimals) {
		Feeding feedings[] = new Feeding[3];
		
		for(int index = 0; index < 3; index++) {
			feedings[index] = new Feeding(index);
		}
		

		return feedings;
	}
}
