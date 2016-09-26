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
	private static Vendor vendors[];
	private static Feed feeds[];
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
		vendors = setupVendors();
		feeds = setupFeeds(vendors);
		feedings = setupFeedings(animals, feeds, feeders);
		
		System.out.println("Animal #1 is: " + animals[0].getSpecies().getName() + " " +  animals[0].getName());
		System.out.println("Feedings for Animal #1 are: " + animals[0].getFeedings());

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
		
		animals[1].setSpecies(theSpecies[1]);
		animals[1].setName("Wilt");
		
		animals[2].setSpecies(theSpecies[2]);
		animals[2].setName("Unicron");
		
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
	
	private static Vendor[] setupVendors() {
		Vendor vendors[] = new Vendor[3];
		
		for(int index = 0; index < 3; index++) {
			vendors[index] = new Vendor();
		}
		
		vendors[0].setContact("Purina");
		vendors[0].setReorderThreshold(100);

		vendors[1].setContact("Albertsons");
		vendors[1].setReorderThreshold(200);
		
		vendors[2].setContact("Hogwarts");
		vendors[2].setReorderThreshold(250);
		
		return vendors;
	}
	
	private static Feed[] setupFeeds(Vendor[] theVendors) {
		Feed feeds[] = new Feed[3];
		
		for(int index = 0; index < 3; index++) {
			feeds[index] = new Feed();
		}
		
		feeds[0].setVendor(theVendors[0]);
		feeds[0].setWeightRemaining(50);
		feeds[0].setWaste(0);
		
		feeds[1].setVendor(theVendors[1]);
		feeds[1].setWeightRemaining(50);
		feeds[1].setWaste(0);
		
		feeds[2].setVendor(theVendors[2]);
		feeds[2].setWeightRemaining(50);
		feeds[2].setWaste(0);
		
		return feeds;
	}
	
	private static Feeding[] setupFeedings(Animal[] theAnimals, Feed[] theFeed, Feeder[] theFeeders) {
		Feeding feedings[] = new Feeding[3];
		
		for(int index = 0; index < 3; index++) {
			feedings[index] = new Feeding();
		}
		
		feedings[0].createNewFeeding(10, theFeed[0], theFeeders[0]);
		feedings[0].createNewFeeding(7, theFeed[0],  theFeeders[1]);
		feedings[0].createNewFeeding(20, theFeed[0],  theFeeders[0]);
		
		theAnimals[0].setFeedings(feedings);
		
		return feedings;
	}
	

}
