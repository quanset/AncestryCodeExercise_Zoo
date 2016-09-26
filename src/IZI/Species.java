package IZI;

public class Species {
	public int id;  // unique id for each species
	public String name;
	
	public Species(int theId) {
		id = theId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
