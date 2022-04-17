import java.time.LocalDate;
import java.time.LocalTime;

public class Runner {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(LocalTime.of(14, 21), LocalDate.now(), 2);
		System.out.println(airplane);
		
	}

}
