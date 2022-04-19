package electricToy;

import java.time.LocalDate;

import playable.Playable;
import toy.Toy;

public class ElectricToy extends Toy implements Playable {
	protected int volume;
	protected CountBattery countBattery;

	public ElectricToy(String name, LocalDate purchaseDate, String serialNumber, ChildCategory childCategory,
			int volume, CountBattery countBattery) {
		super(name, purchaseDate, serialNumber, childCategory);
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
		 volume--;


	}

	@Override
	public String toString() {
		return "ElectricToy{" + "name='" + name + '\'' + ", purchaseDate=" + purchaseDate + ", serialNumber='"
				+ serialNumber + '\'' + ", childCategory=" + childCategory + "volume=" + volume + ", countBattery="
				+ countBattery + '}';
	}

	public enum CountBattery {
		ONE, TWO, FOUR
	}
}
