package lights;

public class Runner {

	public static void main(String[] args) {
		Light light = new Light();
		Light light2 = new Light(5,true);
		
		light.print();
		light2.print();
		
		light.turnOff();
		light2.setNumberBulbs(15); 
		
		light.print();
		light2.print();
		
		light.turnOn();
		light2.turnOn();
		
		light.print();
		light2.print();

	}

}
