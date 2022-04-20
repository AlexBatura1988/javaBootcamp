package bootcamp.oop.basic.ex1.runner;

import java.time.LocalTime;

import bootcamp.oop.basic.ex1.HomeAppliance;
import bootcamp.oop.basic.ex1.Television;

public class Runner {

	public static void main(String[] args)   {
		//HomeAppliance homeApp1 = new HomeAppliance("TUSHIBA", 2001);

		//HomeAppliance homeApp2 = new HomeAppliance("Tushiba", 222);
		//System.out.println(homeApp1);
		//System.out.println(homeApp2);
		Television tv1 = new Television("TUSHIBA", 2001, 10, 6.7f,"RF");
		tv1.setModel("G45");

//		Television tv2 = new Television("Panasonic", 111, 0, 1f,"IR");
//		tv2.setModel("3333");
//
//		System.out.println(tv1);
//		System.out.println(tv2);
//
//		int res = tv1.isBigger(tv2);
//		String resText = "The Same as";
//		if (res == 1)
//			resText = "Bigger than";
//		else if (res == -1)
//			resText = "Smaller than";
//
//		resText = "TV1 is " + resText + " Tv2";
//		System.out.println(resText);
//		System.out.println(tv1);
		LocalTime onTime = tv1.turnOn();
		tv1.turnOffSec(onTime);
		
		
		tv1.turnOffSec(LocalTime.now());

	}

}
