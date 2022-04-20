package bootcamp.oop.basic;
/**
 * 
 * @author alexb
 *
 */
public class Clock {
	//fields
	int timeInMin ;
	
	public Clock(int time) {
		timeInMin = time;
	}
	
	public Clock() {
		// TODO Auto-generated constructor stub
	}
	public Clock(int hours, int minutes) {
		timeInMin = minutes;
		timeInMin  += 60*hours;
	}

	//methods
	public void printTime() {
		int hours  = timeInMin/60;
		int minutes = timeInMin%60;
		System.out.printf("%02d : %02d",hours,minutes);
	}

}
