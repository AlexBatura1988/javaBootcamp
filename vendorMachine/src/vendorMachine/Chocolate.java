package vendorMachine;

public class Chocolate extends HotDrink {
	typeOfDrink TYPE_OF_DRINK;

	public Chocolate(int temperature, int price, int volume, int shugar, typeOfDrink TYPE_OF_DRINK) {
		super(temperature, price, volume, shugar);
		this.TYPE_OF_DRINK = TYPE_OF_DRINK;
	}

	public Chocolate() {
		this(65, 5, 100, 4, typeOfDrink.MILK);
	}

	@Override
	public void produce() {
		if (VendingMachine.waterQtt >= volume && VendingMachine.milkQtt >= volume) {
			if (TYPE_OF_DRINK == typeOfDrink.WATER) {
				VendingMachine.waterQtt -= volume;
			} else {
				VendingMachine.milkQtt -= volume;
			}
			System.out.println(this);
			System.out.println("water in macine " + VendingMachine.waterQtt);
			System.out.println("milk in machine " + VendingMachine.milkQtt);

		} else {
			System.out.println("no water or milk");
		}

	}

	@Override
	public String toString() {
		return "chocolate " + super.toString() + " type of drink: " + TYPE_OF_DRINK;
	}

	enum typeOfDrink {
		WATER, MILK
	}

}
