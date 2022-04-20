package bootcamp.oop.basic.enumeration;

import bootcamp.oop.basic.enumeration.StatusCode.Status;

public class Runner {

	public static void main(String[] args) {
		
		Status status = Status.FAIL;
		for(Status stat : Status.values()) {
			System.out.println(stat.code);
		}
		StatusCode statusCode = new StatusCode("Stam msg", Status.OK);
		statusCode.checkIfMsgSent();
		
		
		
		
//		Level level = Level.HIGHT;
//		for (Level lev : Level.values()) {
//			System.out.println(lev);
//		}

	}

	public static int numByLevel(Level lev) {
		switch (lev) {
		case HIGHT:
			return 1;
		case MEDIUM:
			return 2;
		case LOW:
			return 3;

		}
		return 0;
	}

	public static Level checkTemp(double temp) {

		if (temp > 100)
			return Level.HIGHT;
		else
			return Level.LOW;
	}

	enum Level {
		LOW, MEDIUM, HIGHT
	}

}
