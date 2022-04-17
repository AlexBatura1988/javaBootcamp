package vendor_machine;

/**
 * 
 * @author alexb
 *
 */

public abstract class Drink implements Produceable {

	protected int temperature;
	protected int price;
	protected int volume;

	/**
	 * empty Constructor
	 */

	public Drink() {

	}

	/**
	 * Constructor value initialization
	 * 
	 * @param temperature integer, temperature for drink
	 * @param price       integer, price for drink
	 * @param volume      integer, volume for drink
	 */

	public Drink(int temperature, int price, int volume) {
		setTemperature(temperature);
		setVolume(volume);
		this.price = price;
	}

	public void setTemperature(int temperature) {
		if (temperature > 61 && temperature < 91)
			this.temperature = temperature;
		else {
			this.temperature = 90;
		}
	}

	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 
	 * @param volume integer, set volume from 50 to 200, default 200
	 */

	public void setVolume(int volume) {
		if (volume > 49 && volume < 201)
			this.volume = volume;
		else
			this.volume = 200;
	}

	public abstract void produce();

	/**
	 * function toString prints drink
	 */

	@Override
	public String toString() {
		return "Drink [temperature=" + temperature + ", price=" + price + ", volume=" + volume + "]";
	}
}
