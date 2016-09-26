package IZI;

import java.util.Date;

public class Feeding {
	private int id = 0; // Unique id
	private int idCounter = 0; // Unique id counter
	private int amount;  // How much was given to the animal for the feeding?
	private long time;   // What time was the animal fed?
	private Feeder feeder;  // Who fed the animal?
	
	public Feeding() {
		this.id = idCounter++;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public Feeder getFeeder() {
		return feeder;
	}

	public void setFeeder(Feeder feeder) {
		this.feeder = feeder;
	}
	
	public Feeding addNewFeeding(int theAmount, Feeder theFeeder) {
		Feeding newFeeding = new Feeding();
		
		newFeeding.setAmount(theAmount);
		newFeeding.setFeeder(theFeeder);
		newFeeding.setTime(System.currentTimeMillis());

		return newFeeding;
	}
}
