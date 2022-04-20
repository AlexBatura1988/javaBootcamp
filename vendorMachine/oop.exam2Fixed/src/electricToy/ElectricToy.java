package electricToy;

import java.time.LocalDate;

import kid.Kid;
import playable.Playable;
import toy.Toy;

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

		int yearsToy = LocalDate.now().getYear() - purchaseDate.getYear();
		int yearsKid = LocalDate.now().getYear() - kid.getBirthDateYear();
		if (yearsToy == 0 && yearsKid >= 0 && yearsKid < 11) {
			System.out.println("you can play");
			volume--;
			System.out.println(this);
		} else {
			System.out.println("you cannot play becouse years kid: " + yearsKid + ",years toy: " + yearsToy);

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
