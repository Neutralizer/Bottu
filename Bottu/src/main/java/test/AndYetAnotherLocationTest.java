package test;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;

public class AndYetAnotherLocationTest {

	public static void main(String[] args) throws Exception {
		Robot r = new Robot();
		
		r.delay(1000);
		Point p = new Point(335,305);
		r.mouseMove(p.x, p.y);
		
		Color color = r.getPixelColor(p.x, p.y);
		
		System.out.println(color.getRGB());
		System.out.println(color);

	}

}
