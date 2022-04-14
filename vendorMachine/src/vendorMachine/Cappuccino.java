package vendorMachine;

public class Cappuccino extends HotDrink {

	public Cappuccino(int temperature, int price, int volume, int shugar) {
		super(temperature, price, volume, shugar);

	}

	public Cappuccino() {
		this(80, 15, 200, 3);
	}

	@Override
	public void setVolume(int volume) {
		if (volume < 150) {
			this.volume = 150;
		} else
			super.setVolume(volume);

	}

	@Override
	public void produce() {
		if (VendingMachine.waterQtt > volume && VendingMachine.milkQtt > volume) {
			VendingMachine.waterQtt = VendingMachine.waterQtt - 100;
			VendingMachine.milkQtt = VendingMachine.milkQtt - volume + 100;
			System.out.println(this);
			System.out.println(VendingMachine.waterQtt);
			System.out.println(VendingMachine.milkQtt);
		} else {
			System.out.println("no water or milk");
		}

	}

	@Override
	public String toString() {
		return "Espresso [volume " + volume + ", temperature=" + temperature + ", price=" + price + ",shugar = "
				+ shugar + "]";
	}

}
