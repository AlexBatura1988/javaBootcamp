package toy;

import java.time.LocalDate;

public abstract class Toy {
	protected String name;
	protected LocalDate purchaseDate;
	protected String serialNumber;
	protected ChildCategory childCategory;

	public Toy(String name, LocalDate purchaseDate, String serialNumber, ChildCategory childCategory) {
		this.name = name;
		this.purchaseDate = purchaseDate;
		this.serialNumber = serialNumber;
		this.childCategory = childCategory;
	}

	public String getName() {
		return name;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public abstract void play();

	@Override
	public String toString() {
		return "Toy{" + "name='" + name + '\'' + ", purchaseDate=" + purchaseDate + ", serialNumber='" + serialNumber
				+ '\'' + " " + childCategory + '}';
	}

	public enum ChildCategory {
		LOW_AGE, MEDIUM_AGE, HIGH_AGE
	}
}
