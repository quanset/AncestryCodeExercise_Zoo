package IZI;

public class Vendor {
	public Feed feedType; // This is what they provide.
	public String contact;  // TODO: Make this a reference to a CRM entry that includes contact info for reorder.
	public int reorderThreshold;  // This is the weight lower limit to trigger a reorder of feedType to the contact.

	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
}
