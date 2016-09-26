package IZI;

import java.util.Date;

public class Feeding {
	public int amounts[];  // How much was given to the animal for the feeding?
	public Date times[];   // What time was the animal fed?
	public Feeder feeder;  // Who fed the animal?
	
	public Feeding() {
		// TODO Auto-generated constructor stub
	}

	public int[] getAmounts() {
		return amounts;
	}

	public void setAmounts(int[] amounts) {
		this.amounts = amounts;
	}

	public Date[] getTimes() {
		return times;
	}

	public void setTimes(Date[] times) {
		this.times = times;
	}

	public Feeder getFeeder() {
		return feeder;
	}

	public void setFeeder(Feeder feeder) {
		this.feeder = feeder;
	}
}
