package vendorMachine;

public class Latte extends HotDrink {

	public Latte(int temperature, int price, int volume, int shugar) {
		super(temperature, price, volume, shugar);

	}

	public Latte() {
		this(80, 10, 255, 10);
	}

	@Override
	public void setVolume(int volume) {
		if (volume < 100) {
			this.volume = 100;
		} else
			super.setVolume(volume);
	}

	@Override
	public void produce() {
		if (VendingMachine.waterQtt >= volume && VendingMachine.milkQtt >= volume) {
			VendingMachine.waterQtt = VendingMachine.waterQtt - 50;
			VendingMachine.milkQtt = VendingMachine.milkQtt - volume + 50;
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
