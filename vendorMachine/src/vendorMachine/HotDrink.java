package vendorMachine;

public abstract class HotDrink extends Drink {
	protected int shugar;

	public HotDrink(int temperature, int price, int volume, int shugar) {
		super(temperature, price, volume);
		setTemperature(temperature);
		setShugar(shugar);
	}

	public HotDrink() {

	}

	public void setShugar(int shugar) {
		if (shugar >= 0 && shugar < 6)
			this.shugar = shugar;
		else
			this.shugar = 2;
	}

	public abstract void produce();

}
