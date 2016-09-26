package IZI;

public class Feed {
	private Vendor vendor;
	private int weightRemaining; // How much feed is left?
	private int waste;  // If the weightRemaining is manually adjusted, then this keeps track of amounts that are "missing" (wasted).

	public Feed() {
		// TODO Auto-generated constructor stub
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public int getWeightRemaining() {
		return weightRemaining;
	}

	public void setWeightRemaining(int weightRemaining) {
		this.weightRemaining = weightRemaining;
	}

	public int getWaste() {
		return waste;
	}

	public void setWaste(int waste) {
		this.waste = waste;
	}
}
