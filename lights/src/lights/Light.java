package lights;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Light {
	private int numberBulbs;
	private boolean isOn;
	
	public Light() {
		this(3,true);
		
		
	}
	public Light(int numberBulbs,boolean isOn) {
		this.numberBulbs = numberBulbs;
		this.isOn = isOn ;
		
	}
	
	public int getNumberBulbs() {
		return numberBulbs;
	}
	public void setNumberBulbs(int numberBulbs) {
		if(numberBulbs > 0 && numberBulbs <= 50) {
		this.numberBulbs = numberBulbs;
		}
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public void turnOn() {
		isOn = true;
		System.out.println("On");
	}
	public void turnOff() {
		isOn = false;
		System.out.println("Off");
	}
	public void toggle(Light light) {
		light.isOn = !light.isOn;
	}
	public void toggle() {
		toggle(this);
	}
	public void print() {
		System.out.println("the number of bulbs is " + numberBulbs + " isOn is " + isOn);
	}

}
