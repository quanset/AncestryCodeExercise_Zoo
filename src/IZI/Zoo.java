package IZI;

public class Zoo {

	private int zooIdCounter = 0;  // For use as id during class construction.
	private int id;  // Unique id for each Zoo.
	private String name;  // Name of the Zoo.
	private Animal animals[];  // What animals reside at this zoo?
	private Vendor feedVendors[];  // What vendors provide feed for this zoo?
	private Feed feed[];  // TODO: does this make sense here?
	
	public Zoo(String zooName) {
		id = zooIdCounter++;
		name = zooName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public Vendor[] getFeedVendors() {
		return feedVendors;
	}

	public void setFeedVendors(Vendor[] feedVendors) {
		this.feedVendors = feedVendors;
	}

	public Feed[] getFeed() {
		return feed;
	}

	public void setFeed(Feed[] feed) {
		this.feed = feed;
	}

}
