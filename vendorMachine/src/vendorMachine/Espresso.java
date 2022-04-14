package vendorMachine;

public class Espresso extends HotDrink {

	public Espresso(int temperature, int price, int volume, int shugar) {

		super(temperature, price, volume, shugar);
		setVolume(volume);

	}

	public Espresso() {
		this(60, 5, 10, 8);
	}

	@Override
	public void setVolume(int volume) {
		if (volume == 50 || volume == 100 || volume == 150) {
			super.setVolume(volume);
		} else
			setVolume(50);
	}

	@Override
	public void produce() {
		if (VendingMachine.waterQtt >= volume) {
			VendingMachine.waterQtt = VendingMachine.waterQtt - volume;
			System.out.println(this);
		} else {
			System.out.println("no water in machine!!");
		}

	}

	@Override
	public String toString() {
		return "Espresso [volume " + volume + ", temperature=" + temperature + ", price=" + price + ",shugar = "
				+ shugar + "]";
	}
}
