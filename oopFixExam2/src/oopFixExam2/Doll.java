package oopFixExam2;

import java.time.LocalDate;

public class Doll extends Toy implements Playable {
	protected int dirtinessScale;
	protected TypeDoll typeDoll;

	public Doll(Kid kid, String name, LocalDate purchaseDate, String serialNumber, int dirtinessScale,
			TypeDoll typeDoll) {
		super(kid, name, purchaseDate, serialNumber);
		setDirtinessScale(dirtinessScale);
		this.typeDoll = typeDoll;
	}

	public int getDirtinessScale() {
		return dirtinessScale;
	}

	public void setDirtinessScale(int dirtinessScale) {
		this.dirtinessScale = dirtinessScale < 1 || dirtinessScale > 10 ? 1 : dirtinessScale;
	}

	@Override
	public void play() {
		int yearsOfToy = LocalDate.now().getYear() - purchaseDate.getYear();
		if (yearsOfToy == 0 && kid.getChildAgeInYears() >= 0 && kid.getChildAgeInYears() < 5) {
			dirtinessScale++;
			System.out.println(this);
		} else {
			System.out.println("kid cannot play because years of toy is: " + yearsOfToy + ",kid age is: "
					+ kid.getChildAgeInYears());

		}

	}

	@Override
	public String toString() {
		return "Doll{" + kid + "name='" + name + '\'' + "purchaseDate=" + purchaseDate + ", serialNumber='"
				+ serialNumber + '\'' + "dirtinessScale=" + dirtinessScale + ", typeDoll=" + typeDoll + '}';
	}

	public enum TypeDoll {
		SOFT, HARD
	}
}
