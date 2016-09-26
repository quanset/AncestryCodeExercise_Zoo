package IZI;

public class Feeder {
	private int id;
	private Zoo employer = null;
	private String name = null;  // Used to track who provided the feeding.  TODO: Later phase, connect to employee CRM.
	
	public Feeder(int theId) {
		id = theId;
	}

	public Zoo getEmployer() {
		return employer;
	}

	public void setEmployer(Zoo employer) {
		this.employer = employer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
