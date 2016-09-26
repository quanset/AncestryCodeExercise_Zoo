package IZI;

import java.util.Date;

public class Feeding {
	private int id;
	private int amount;  // How much was given to the animal for the feeding?
	private Date times;   // What time was the animal fed?
	private Feeder feeder;  // Who fed the animal?
	
	public Feeding(int theId) {
		this.id = theId;
	}



	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getTimes() {
		return times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	public Feeder getFeeder() {
		return feeder;
	}

	public void setFeeder(Feeder feeder) {
		this.feeder = feeder;
	}
}
