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
	
	private static Species species[];
	private static  Animal animals[];
	private static Feeder feeders[];
	private static Feeding feedings[];
	
	public FeedInventoryManagementSystem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEGIN MAIN");
		
		species = setupSpecies();
		animals = setupAnimals(species);
		feeders = setupFeeders();
		feedings = setupFeedings(animals, feeders);
		
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
	
	private static Feeder[] setupFeeders() {
		Feeder feeders[] = new Feeder[2];
		
		for(int index = 0; index < 2; index++) {
			feeders[index] = new Feeder(index);
		}
		
		feeders[0].setName("Joe");
		feeders[1].setName("Jane");
		
		return feeders;
	}
	
	private static Feeding[] setupFeedings(Animal[] theAnimals, Feeder[] theFeeders) {
		Feeding feedings[] = new Feeding[3];
		
		for(int index = 0; index < 3; index++) {
			feedings[index] = new Feeding();
		}
		
		feedings[0].addNewFeeding(10, theFeeders[0]);
		feedings[0].addNewFeeding(7, theFeeders[1]);
		feedings[0].addNewFeeding(20, theFeeders[0]);
		
		return feedings;
	}
	
	public Feeder getFeederById(int theFeederId) {
		return feeders[theFeederId];
	}
}
