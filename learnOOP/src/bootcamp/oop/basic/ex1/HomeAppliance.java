package bootcamp.oop.basic.ex1;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public abstract class HomeAppliance implements Appendable {
	protected String manufacturer;
	protected  int purchaseYear;
	protected  int powerConsumption;
	
	
	public HomeAppliance(String manufacture,int purchaseYear,int powerCon) {
		setManufacturer(manufacture);
		setPurchaseYear(purchaseYear);
		setPowConsuption(powerCon);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		if (manufacturer != null) {
			this.manufacturer = manufacturer.toUpperCase();
		}
	}
	public void setPowConsuption(int powCon ) {
		this.powerConsumption = powCon;
	}

	public int getPurchaseYear() {
		return purchaseYear;
	}
	

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public void setPurchaseYear(int purchaseYear) {
		 int currYear = Calendar.getInstance().get(Calendar.YEAR);
		 if(purchaseYear > 1900 && purchaseYear <= currYear) {
		this.purchaseYear = purchaseYear;
		 }else {
			 this.purchaseYear = currYear;
		 }
	}
	public abstract int getConsuption(int powerConsumption, int hour );
	
	public LocalTime turnOn() {
		System.out.println("local time tern on is " +LocalTime.now());
		return LocalTime.now();		
	}
	 public long turnOffSec(LocalTime on) {
		 
		Long numberOfSec = on.until(LocalTime.now(), ChronoUnit.SECONDS) ;
		numberOfSec = (long) on.getSecond() - turnOn().getSecond();
		System.out.println("Appliance was turned of: " +numberOfSec);
		return numberOfSec;
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "HomeAppliance [manufacturer=" + manufacturer + ", purchaseYear=" + purchaseYear +
				" power consumption " + powerConsumption + "]";
	}
	

}
