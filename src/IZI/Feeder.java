package IZI;

public class Feeder {
	public Zoo employer = null;
	public String name = null;  // Used to track who provided the feeding.  TODO: Later phase, connect to employee CRM.
	
	public Feeder() {
		// TODO Auto-generated constructor stub
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
