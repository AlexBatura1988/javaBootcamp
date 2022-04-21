package oopFixExam2;

import java.time.LocalDate;

public class ElectricToy extends Toy implements Playable {
	protected int volume;
	protected CountBattery countBattery;

	public ElectricToy(Kid kid, String name, LocalDate purchaseDate, String serialNumber, int volume,
			CountBattery countBattery) {
		super(kid, name, purchaseDate, serialNumber);
		this.countBattery = countBattery;
		setVolume(volume);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume < 0 || volume > 3 ? 1 : volume;
	}

	@Override
	public void play() {
		int yearsOfToy = LocalDate.now().getYear() - purchaseDate.getYear();
		if (yearsOfToy == 0 && kid.getChildAgeInYears() >= 0 && kid.getChildAgeInYears() < 11) {
			volume--;
			System.out.println(this);
		} else {
			System.out.println("kid cannot play because years of toy is: " + yearsOfToy + ",kid age is: "
					+ kid.getChildAgeInYears());

		}

	}

	@Override
	public String toString() {
		return "ElectricToy{" + kid + "name='" + name + '\'' + ", purchaseDate=" + purchaseDate + ", serialNumber='"
				+ serialNumber + '\'' + "volume=" + volume + ", countBattery=" + countBattery + '}';
	}

	public enum CountBattery {
		ONE, TWO, FOUR
	}
}
