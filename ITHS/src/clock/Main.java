package clock;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		clock c = new clock();
		c.setHours(0);
		c.setMinutes(-45);
		c.setSeconds(522);
		
		c.setTime(26, 62, 65);	//1:3:5
		
		c.printTime();
		
		c.setTime(0, 0, 0);
		while(true) {
			TimeUnit.SECONDS.sleep(1);	// sleep 1 second
			c.tick();
			c.printTime();
		}
	}

}