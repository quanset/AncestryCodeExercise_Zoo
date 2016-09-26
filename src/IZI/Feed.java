package IZI;

public class Feed {
	private int id;
	private int idCounter = 0; // Unique id counter
	private Vendor vendor;
	private int weightRemaining; // How much feed is left?
	private int waste;  // If the weightRemaining is manually adjusted, then this keeps track of amounts that are "missing" (wasted).

	public Feed() {
		this.id = idCounter++;
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

	public void setWeightRemaining(int theNewShipmentWeight) {
		this.weightRemaining = this.weightRemaining + theNewShipmentWeight;  // Add new inventory to current inventory.
	}

	public int getWaste() {
		return waste;
	}

/*	public void setWaste(int waste) {
		this.waste = waste;
	}*/
	
	/**
	 * Calculate the waste as the system tracked weight so far minus the new observed (current) weight.
	 * @param theCurrentInventoryWeight
	 */
	public void setWaste(int theCurrentInventoryWeight) {
		this.waste = getWeightRemaining() - theCurrentInventoryWeight;
	}
}
