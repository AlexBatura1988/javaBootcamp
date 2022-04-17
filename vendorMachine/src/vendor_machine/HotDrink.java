package vendor_machine;
/**
 * 
 * @author alexb
 *
 */
public abstract class HotDrink extends Drink {
	protected int sugar;

	/**
	 * empty Constructor
	 */

	public HotDrink() {

	}

	/**
	 * 
	 * @param temperature integer, temperature for drink
	 * @param price       integer, price for drink
	 * @param volume      integer, volume for drink
	 * @param sugar       integer, sugar for drink
	 */

	public HotDrink(int temperature, int price, int volume, int sugar) {
		super(temperature, price, volume);
		setTemperature(temperature);
		setSugar(sugar);
	}
	
	/**
	 * 
	 * @param sugar  integer, set sugar from 0 to 5, default is 2
	 */

	public void setSugar(int sugar) {
		if (sugar >= 0 && sugar < 6)
			this.sugar = sugar;
		else
			this.sugar = 2;
	}

	public abstract void produce();
}
