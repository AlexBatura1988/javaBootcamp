package oopFixExam2;

import java.time.LocalDate;
import java.time.Period;

public class Kid {
	protected String name;
	protected LocalDate birthDate;

	public Kid(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		LocalDate today = LocalDate.now();
		Period period = Period.between(birthDate, today);
		int birthday = period.getYears() + period.getMonths() + period.getDays();
		return "Kid{" + "name='" + name + '\'' + ", dateOfBirth=" + period.getYears() + "year " + period.getMonths()
				+ "month " + period.getDays() + "days " + '}';
	}

}
