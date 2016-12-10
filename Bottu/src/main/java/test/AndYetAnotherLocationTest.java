package test;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;

public class AndYetAnotherLocationTest {
	
	int ballHealthColor80 = -5627091;

	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		testSinglePosition(robot);
//		test4Positions(robot);
		// 80 gray -14148323
		//java.awt.Color[r=40,g=29,b=29]
		//-13884117
		//java.awt.Color[r=44,g=37,b=43]
//		(935, 660);.
//		(955, 685);
		
		//-16051178
	}
	
	public static void testSinglePosition(Robot r){
		r.delay(1000);
		Point p = new Point(555, 480);
		r.mouseMove(p.x, p.y);
		r.delay(250);
		Color color = r.getPixelColor(p.x, p.y);
		
		System.out.println(color.getRGB());
		System.out.println(color);
	}
	
	private static void test4Positions(Robot r) {
		r.delay(1000);
		Point left = new Point(200, 300);
		Point right = new Point(800, 302);
		Point top = new Point(502, 110);
		Point bot = new Point(501, 500);
		
		Color colorL = r.getPixelColor(left.x, left.y);
		Color colorR = r.getPixelColor(right.x, right.y);
		Color colorT = r.getPixelColor(top.x, top.y);
		Color colorB = r.getPixelColor(bot.x, bot.y);
		
		System.out.println(colorL.getRGB());
		System.out.println(colorL);
		
		System.out.println(colorR.getRGB());
		System.out.println(colorR);
		
		System.out.println(colorT.getRGB());
		System.out.println(colorT);
		
		System.out.println(colorB.getRGB());
		System.out.println(colorB);
	}



}
