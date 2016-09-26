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
		
		setupSpecies();
				
		setupAnimals();

	}

	private static void setupAnimals() {
		Animal animals[] = new Animal[3];
		for(int index = 0; index < 3; index++) {
			animals[index] = new Animal(index);
		}
	}

	private static void setupSpecies() {
		Species species[] = new Species[3];
		
		for(int index = 0; index < 3; index++) {
			species[index] = new Species(index);
		}
		
		species[0].setName("Lion");
		species[1].setName("Giraffe");
		species[2].setName("Unicorn");
	}

}
