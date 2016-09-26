package IZI;
/**
 * @author Ken Fultz
 *
 */

public class Animal {
	private int id;  // unique id for each animal
	private Species species;
	private String name;
	private Feeding feedings[];
	
	public Animal(int theId) {
		id = theId;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Feeding[] getFeedings() {
		return feedings;
	}

	public void setFeedings(Feeding[] feedings) {
		this.feedings = feedings;
	}
}
