package IZI;

public class Vendor {
	private int id = 0; // Unique id
	private int idCounter = 0; // Unique id counter
	private String contact;  // TODO: Make this a reference to a CRM entry that includes contact info for reorder.
	private int reorderThreshold;  // This is the weight lower limit to trigger a reorder of feedType to the contact.

	
	public Vendor() {
		this.id = idCounter++;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}


	public int getReorderThreshold() {
		return reorderThreshold;
	}

	public void setReorderThreshold(int reorderThreshold) {
		this.reorderThreshold = reorderThreshold;
	}
}
