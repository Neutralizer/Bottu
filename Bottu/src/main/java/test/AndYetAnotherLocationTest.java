package test;

import java.awt.AWTException;
import java.awt.Robot;

public class AndYetAnotherLocationTest {

	public static void main(String[] args) throws AWTException {
		Robot r = new Robot();
		
		r.delay(1000);
		r.mouseMove(980, 220);

	}

}
