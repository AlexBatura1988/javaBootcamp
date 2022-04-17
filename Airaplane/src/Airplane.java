
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Airplane {
	private final int flidhtNumber = 101;
	protected LocalTime departureTime;
	protected LocalDate date;
	protected int flightDuration;
	protected int minutesOfDelay;
	protected ClubMember[] members;

	public Airplane(LocalTime departureTime, LocalDate date, int flightDuration) {
		this.departureTime = departureTime;
		this.date = date;
		this.flightDuration = flightDuration;
	}

	public LocalTime getTime() {
		return departureTime;
	}

	public double getFlightDuration() {
		return flightDuration;
	}

	public void delayFlight(int minutes) {
		minutesOfDelay += minutes;
	}

	public LocalTime plainArrival() {
		return departureTime.plusMinutes(flightDuration + minutesOfDelay);
	}

	@Override
	public String toString() {
		return "Airplane [flidhtNumber=" + flidhtNumber + ", departureTime=" + departureTime + ", date=" + date
				+ ", flightDuration=" + flightDuration + "]";
	}

}
