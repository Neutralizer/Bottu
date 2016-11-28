package bot;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Random;

public class BotHomeToWork {

	static Robot r;
	static Random ra;
	static Point newInstance;
	static Point left;
	static Point right;
	static Point bot;
	static Point top;
	static Point logout;
	static Point town4FirstMove;
	static Point town4SecondMove;
	static Point town4ClickingDoor;
	static Point clickSelf;
	static Point ballHealthPixelColorLocation;
	static Point lastCharge1stFlaskLocation;
	static Point levelUpGemsLocation;
	static boolean lowHealth = false; // not used
	static boolean breakCycle = false;
	static boolean logoutBoolean = false;
	static int ballHealthColor;
	static int lastChargeFlaskColor;
	static int timeAfterEnteringInstanceMS;
	static int timeAfterLoggingInMS;
	static Point town1FirstMove;
	static Point town1SecondMove;
	static Point town1ThirdMove;
	static Point town1FourthMoveClickOnly;
	static Point town1FifthMoveClickOnly;
	static Point ballHealthPixelColorLocation80;

	// commented checkIfHealthIsLow(); not commented

	public static void main(String[] args) throws Exception {
		r = new Robot();
		r.setAutoDelay(20);
		r.setAutoWaitForIdle(true);
		ra = new Random();
//		Point customMove1_1 = new Point(900, 900);old
//		Point customMove1_2 = new Point(570, 900);old
//		Point customMove1_3 = new Point(700, 700);old
		 town4FirstMove = new Point(900, 900); // work
		 town4SecondMove = new Point(570, 900);
		 town4ClickingDoor = new Point(700, 700);
		 newInstance = new Point(450, 365);
		 levelUpGemsLocation = new Point(1850,340);
		
		 town1FirstMove = new Point(870,1100);
		 town1SecondMove = new Point(870,1100);
		 town1ThirdMove = new Point(870,770);
		 town1FourthMoveClickOnly = new Point(420,160);// selecting act2
		 town1FifthMoveClickOnly = new Point(460,490);// selecting TheSFor
		
		 clickSelf = new Point(950, 550);
		 logout = new Point(1001, 525);
		 ballHealthPixelColorLocation = new Point(180, 1040);
		 ballHealthPixelColorLocation80 = new Point(130, 1000); // 80% health left
		 //TODO make pot drink at 80%
		 lastCharge1stFlaskLocation = new Point(358, 1170);
		 ballHealthColor = -6875105;
		 lastChargeFlaskColor = -11070204;
		 timeAfterEnteringInstanceMS = 15000;
		 timeAfterLoggingInMS = 20000;
		
		 left = new Point(500, 500);
		 right = new Point(1300, 501);
		 bot = new Point(902, 904);
		 top = new Point(903, 180);

//		town4FirstMove = new Point(420, 680); // home
//		town4SecondMove = new Point(220, 650);
//		town4ClickingDoor = new Point(440, 350);
//		newInstance = new Point(190, 230);
//		levelUpGemsLocation = new Point(980, 220);
//
//		town1FirstMove = new Point(450, 700);
//		town1SecondMove = new Point(450, 700);
//		town1ThirdMove = new Point(500, 500);
//		town1FourthMoveClickOnly = new Point(250, 105);// selecting act2
//		town1FifthMoveClickOnly = new Point(295, 315);// selecting TheSFor
//
//		clickSelf = new Point(525, 340);
//		logout = new Point(550, 336);
//		ballHealthPixelColorLocation = new Point(130, 680);
//		lastCharge1stFlaskLocation = new Point(228, 748);
//		ballHealthColor = -8778219;
//		lastChargeFlaskColor = -11399167;
//		timeAfterEnteringInstanceMS = 25000;
//		timeAfterLoggingInMS = 30000;
//
//		left = new Point(200, 300);
//		right = new Point(800, 302);
//		bot = new Point(501, 500);
//		top = new Point(502, 110);

		run();

	}

	private static void run() throws Exception {
		fireFlicker();
//		fStormOrBFall();

	}
	
	static void fStormOrBFall() throws Exception {
		while (true) {
			breakCycle = false;
			inCharSelect();
			inTownAndOutsideAct1ToTSF();
			outside2ndTownTSFfStormOrBFall();
		}
		
	}

	public static void fireFlicker() throws Exception{
		while (true) {
			breakCycle = false;
//			inCharSelect();
//			inTownAndOutsideImprLakeFlicker();
			outside4thTownFlicker();
		}
	}

	private static void inCharSelect() {
		r.delay(7000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.delay(timeAfterLoggingInMS);

	}

	//TODO - add levelupgems method 
	private static void inTownAndOutsideImprLakeFlicker() throws Exception {

		originalMoveVariationInTown4CTRLPressed();

		// going to the instance button
		instaMoveMouse((int) newInstance.getX(), (int) newInstance.getY());
		r.delay(40);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(40);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(timeAfterEnteringInstanceMS);

		castCursesAndGolem();
		r.delay(1000);

		int temp = ra.nextInt(100);
		// level up gems
		if (temp < 20) {
			instaMoveMouse(levelUpGemsLocation.x, levelUpGemsLocation.y);
			for (int i = 0; i < 10; i++) {
				r.delay(40);
				r.mousePress(InputEvent.BUTTON1_MASK);
				r.delay(40);
				r.mouseRelease(InputEvent.BUTTON1_MASK);
				r.delay(40);
			}
		}

		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);

		// instaClickAndMoveWith1SDelay(right.x,right.y);
	}

	private static void outside4thTownFlicker() throws Exception {

		r.delay(2000);

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();

			r.mousePress(InputEvent.BUTTON3_MASK);
			r.delay(200);
			
			// 1 time guaranteed right and every other - 1 bot
			instaClickAndMoveWith1SDelay(right.x, right.y);
			testPosition(right.x, right.y);
			if (ra.nextBoolean()) {
				instaClickAndMoveWith1SDelay(bot.x, bot.y);
			}
			checkIfHealthIsLow();
			int temp = ra.nextInt(2);
			if (temp == 0) {
				instaClickAndMoveWith1SDelay(left.x, left.y);
			} else
			// if (temp == 1) {
			// instaClickAndMoveWith1SDelay(right.x, right.y);
			// } else
			if (temp == 2 || temp == 1) {
				instaClickAndMoveWith1SDelay(bot.x, bot.y);
			}
			// else if (temp == 3) {
			// instaClickAndMoveWith1SDelay(top.x, top.y);
			// }
			
			checkIfHealthIsLow();
			r.delay(100);

			r.mouseRelease(InputEvent.BUTTON3_MASK);

			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 100000) {
				globalLogout();
				break;
			}
		}
	}

	private static void inTownAndOutsideAct1ToTSF() throws Exception {

		originalMoveVariationInTown1toTSF();
		createNewInstanceFromMinimap();
		castCursesAndGolem();
		r.delay(1000);
		
		levelUpGems();


	}
	
	private static void outside2ndTownTSFfStormOrBFall() throws Exception {

		r.delay(2000);

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();
			// hold mouse click near char and check if he is stuck

			r.delay(200);
			//TODO - first logout then drinks potion 2, no pot 1 drink
//TODO			checkIfCharHasMoved(); // bool check 4-5 colors if they have changed
			// 1 time guaranteed top and left +  right every other
//			instaClickAndMoveWith1SDelay(top.x, top.y);
//			instaClickAndMoveWith1SDelay(left.x, left.y);
			instaClickAndMoveWith2SDelay(100,100);
			if (ra.nextBoolean()) {
				instaClickAndMoveWith1SDelay(1800,200);
			}
			checkIfHealthIsLow();
			
			
			//TODO he doesn't wait for the totem
			castTotemAtSelf();
			r.delay(1000);
			checkIfHealthIsLow();
			r.delay(1000);
			checkIfHealthIsLow();
			r.delay(1000);
			checkIfHealthIsLow();
			r.delay(1000);
			checkIfHealthIsLow();
			r.delay(1000);
			checkIfHealthIsLow();
			r.delay(100);


			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 100000) {
				globalLogout();
				break;
			}
		}
	}

	private static void castTotemAtSelf() {
		instaClickAndMoveWith1SDelay(clickSelf.x, clickSelf.y);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(100);
		
	}

	private static void cast3SpellsAtCenter() {
		instaMoveMouse(clickSelf.x, clickSelf.y);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(600);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(600);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(100);
		
	}

	private static void levelUpGems() {
		// level up gems
		int temp = ra.nextInt(100);
		if (temp < 20) {
			instaMoveMouse(levelUpGemsLocation.x, levelUpGemsLocation.y);
			for (int i = 0; i < 10; i++) {
				r.delay(40);
				r.mousePress(InputEvent.BUTTON1_MASK);
				r.delay(40);
				r.mouseRelease(InputEvent.BUTTON1_MASK);
				r.delay(40);
			}
		}
	}

	private static void originalMoveVariationInTown1toTSF() {
		// r.delay(6000);
		// first step after login
		instaClickAndMoveWith1SDelay(town1FirstMove.x, town1FirstMove.y);
		instaClickAndMoveWith1SDelay(town1SecondMove.x, town1SecondMove.y);
		instaClickAndMoveWith1SDelay(town1ThirdMove.x, town1ThirdMove.y);
		instaClickAndMoveWith1SDelay(town1FourthMoveClickOnly.x,
				town1FourthMoveClickOnly.y);
		// TODO from createNewInstanceFromMinimap get ctrl pressed in this method

	}

	public static void goingToTheInstanceButton() {
		instaMoveMouse((int) newInstance.getX(), (int) newInstance.getY());
		r.delay(40);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(40);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(timeAfterEnteringInstanceMS);
	}

	public static void createNewInstanceFromMinimap() {
		r.keyPress(KeyEvent.VK_CONTROL);
		instaClickAndMoveWith1SDelay(town1FifthMoveClickOnly.x,
				town1FifthMoveClickOnly.y);
//		r.delay(200);
//		r.mousePress(InputEvent.BUTTON1_MASK);
//		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(60);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
		instaMoveMouse((int) newInstance.getX(), (int) newInstance.getY());
		r.delay(40);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(40);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(timeAfterEnteringInstanceMS);
	}

	private static void ifNiceItemFound() {
		Rectangle scr = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage image = r.createScreenCapture(scr);
		Point point = null;
		boolean found = false;

		for (int i = 0; i < image.getWidth(); i++) {
			if (found) {
				break;
			}
			for (int p = 0; p < image.getHeight(); p++) {
				if (found) {
					break;
				}
				//work ballHealth detecting as item
				//TODO check if problems at h
				if(i >135 && i < 157 && p > 1045 && p < 1063 ){
					continue;
				}
				if (image.getRGB(i, p) == -394503 || image.getRGB(i, p) == -3629439) {
					// there is an exalt here // or an alchemy
					point = new Point(i + 5, p + 5);
					found = true;
				}

			}

		}

		if (point != null) {
			// r.delay(50);
			// r.mouseRelease(InputEvent.BUTTON3_MASK);
			instaMoveMouse(clickSelf.x, clickSelf.y);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.delay(50);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			instaClickAndMoveWith2SDelay(point.x + 5, point.y + 5);

			// r.mousePress(InputEvent.BUTTON3_MASK);
		}
	}

	public static void originalMoveVariationInTown4CTRLPressed() {
		// r.delay(6000);
		// first step after login
		instaClickAndMoveWith2SDelay((int) town4FirstMove.getX(),
				(int) town4FirstMove.getY());
		// going to above potion location before the gate
		instaClickAndMoveWith2SDelay((int) town4SecondMove.getX(),
				(int) town4SecondMove.getY());
		// clicking the door
		instaMoveMouse((int) town4ClickingDoor.getX(), (int) town4ClickingDoor.getY());
		r.keyPress(KeyEvent.VK_CONTROL);
		r.delay(200);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(60);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
	}


	private static void castCursesAndGolem() {
		r.delay(100);
		// instaMoveMouse(540, 330);//click self
		instaMoveMouse((int) clickSelf.getX(), (int) clickSelf.getY());

		r.keyPress(KeyEvent.VK_R);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_R);
		r.delay(1000);

		r.keyPress(KeyEvent.VK_T);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_T);
		r.delay(1000);

		r.keyPress(KeyEvent.VK_Q);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_Q);
		r.delay(500);

	}

	private static void checkIfHealthIsLow() throws Exception {
		Color color = r.getPixelColor(ballHealthPixelColorLocation.x,
				ballHealthPixelColorLocation.y);
		if (color.getRGB() != ballHealthColor) {
			// lowHealth = true;
			ifPotionEmptyLogout();
			useHealthPotion();
		}
	}

	private static void ifPotionEmptyLogout() throws Exception {
		//TODO not same color as lvl 60 flask color
		Color color = r.getPixelColor(lastCharge1stFlaskLocation.x,
				lastCharge1stFlaskLocation.y);
		if (color.getRGB() != lastChargeFlaskColor) {
			// flask is empty - drink next one or logout
			globalLogout();
		}

	}

	private static void globalLogout() throws Exception {
		int randomDelay = ra.nextInt(450 - 250 + 1) + 250;
		r.delay(randomDelay);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.delay(200);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		instaMoveMouse(logout.x, logout.y);
		breakCycle = true;
		emergency2ndPotDrink();
		r.delay(randomDelay);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(150);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		// r.delay(10000);
	}

	private static void useHealthPotion() {
		r.delay(100);
		r.keyPress(KeyEvent.VK_1);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_1);

	}
	
	private static void emergency2ndPotDrink() {
		r.delay(100);
		r.keyPress(KeyEvent.VK_2);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_2);

	}
	
	private static void emergency3rdPotDrinkMana() {
		r.delay(100);
		r.keyPress(KeyEvent.VK_3);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_3);
	}



	private static void instaMoveMouse(int x, int y) {
		r.delay(50);
		r.mouseMove(x, y);
		int randomDelay = ra.nextInt(260 - 140 + 1) + 140;
		r.delay(randomDelay);
	}

	private static void instaClickAndMoveWith1SDelay(int x, int y) {
		r.delay(50);
		r.mouseMove(x, y);
		int randomDelay = ra.nextInt(260 - 140 + 1) + 140;
		r.delay(randomDelay);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(1000);
	}

	private static void instaClickAndMoveWith2SDelay(int x, int y) {
		r.delay(50);
		r.mouseMove(x, y);
		int randomDelay = ra.nextInt(260 - 140 + 1) + 140;
		r.delay(randomDelay);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(2000);
	}

	private static void testPosition(int x, int y) throws Exception {
		Point p = MouseInfo.getPointerInfo().getLocation();
		if (p.x != x || p.y != y) {
			throw new Exception();
		}

	}

	// full -11070204
	// empty -11848175

	// alch
	// -3629439
	// java.awt.Color[r=200,g=158,b=129]

	// divine, exalted, 6L
	// -395017
	// java.awt.Color[r=249,g=248,b=247]

	// SetBackgroundColor 254 253 252 251
	// SetBackgroundColor 252 253 252 253 - home

	// ilvl 80 - nightmare bascinet
	// -3645668
	// java.awt.Color[r=200,g=95,b=28]
}
