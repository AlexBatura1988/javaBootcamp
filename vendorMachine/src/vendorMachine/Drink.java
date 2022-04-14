package vendorMachine;

public abstract class Drink implements Produceable {
   
	protected  int temperature;
	protected int price;
	protected int volume;

	public Drink(int temperature, int price, int volume) {
		setTemperature( temperature);
		setVolume(volume);
		this.price = price;
	}
	public Drink() {
		
	}

	public  void setTemperature(int temperature) {
		if (temperature > 61 && temperature < 91)
			this.temperature = temperature;
		else {
			this.temperature = 90;
		}
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setVolume(int volume) {
		if(volume > 49 && volume < 201)
		this.volume = volume;
		else 
			this.volume = 200;
		
	}
	public abstract void produce();

	@Override
	public String toString() {
		return "Drink [temperature=" + temperature + ", price=" + price + ", volume=" + volume + "]";
	}

}
