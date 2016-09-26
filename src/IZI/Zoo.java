package IZI;

public class Zoo {

	private int zooIdCounter = 0;  // For use as id during class construction.
	public int id;  // Unique id for each Zoo.
	public String name;  // Name of the Zoo.
	public Animal animals[];  // What animals reside at this zoo?
	public Vendor feedVendors[];  // What vendors provide feed for this zoo?
	public Feed feed[];  // TODO: does this make sense here?
	
	public Zoo(String zooName) {
		id = zooIdCounter++;
		name = zooName;
	}

}
