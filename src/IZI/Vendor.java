package IZI;

public class Vendor {
	private Feed feedType; // This is what they provide.
	private String contact;  // TODO: Make this a reference to a CRM entry that includes contact info for reorder.
	private int reorderThreshold;  // This is the weight lower limit to trigger a reorder of feedType to the contact.

	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}


	public Feed getFeedType() {
		return feedType;
	}


	public void setFeedType(Feed feedType) {
		this.feedType = feedType;
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
