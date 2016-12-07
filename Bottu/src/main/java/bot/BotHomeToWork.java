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
	static Point clickNextToSelf;
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
	static int ballHealthColor80;
	private static Point town3FirstMove;
	private static Point town3SecondMove;
	private static Point town3ThirdMove;
	private static int[] pixelColorsCheck; // not used
	private static int loginNumbers;
	private static int ballHealthColorDead;
	private static int ballHealthColor80Dead;
	private static Point town3ThirdMoveGardens;
	private static Point clickNextToSelfLeft;
	private static int levelUpGemsColor;
	private static Point town4FirstMoveAqua;
	private static Point town4SecondMoveAqua;
	private static Point town4ClickingDoorAqua;
	private static Point lowerRight;

	// not using flask color now

	public static void main(String[] args) throws Exception {
		r = new Robot();
		r.setAutoDelay(20);
		r.setAutoWaitForIdle(true);
		ra = new Random();
		// town4FirstMove = new Point(900, 900); // work
		// town4SecondMove = new Point(570, 900);
		// town4ClickingDoor = new Point(700, 700);
		// newInstance = new Point(450, 365);
		// levelUpGemsLocation = new Point(1850,340);
		//
		// town1FirstMove = new Point(870,1100);
		// town1SecondMove = new Point(870,1100);
		// town1ThirdMove = new Point(870,770);
		// town1FourthMoveClickOnly = new Point(420,160);// selecting act2
		// town1FifthMoveClickOnly = new Point(460,490);// selecting TheSFor
		//
		// clickSelf = new Point(950, 550);
		// logout = new Point(1001, 525);
		// ballHealthPixelColorLocation = new Point(180, 1040);
		// ballHealthPixelColorLocation80 = new Point(130, 1000); // 80% health
		// left
		// lastCharge1stFlaskLocation = new Point(358, 1170);
		// ballHealthColor = -6875105;
		// lastChargeFlaskColor = -11070204;
		// timeAfterEnteringInstanceMS = 15000;
		// timeAfterLoggingInMS = 20000;

		// ballHealthColor80 = -1;
		//
		// left = new Point(500, 500);
		// right = new Point(1300, 501);
		// bot = new Point(902, 904);
		// top = new Point(903, 180);

		town1FirstMove = new Point(450, 700);
		town1SecondMove = new Point(450, 700);
		town1ThirdMove = new Point(500, 500);
		town1FourthMoveClickOnly = new Point(250, 105);// selecting act2
		town1FifthMoveClickOnly = new Point(295, 315);// selecting TheSFor

		town3FirstMove = new Point(696, 593);
		town3SecondMove = new Point(696, 593);
		town3ThirdMove = new Point(335, 305);
		town3ThirdMoveGardens = new Point(145, 185);

		town4FirstMove = new Point(420, 680);
		town4SecondMove = new Point(220, 650);
		town4ClickingDoor = new Point(440, 350);

		town4FirstMoveAqua = new Point(950, 365);
		town4SecondMoveAqua = new Point(950, 365);
		town4ClickingDoorAqua = new Point(760, 340);

		newInstance = new Point(190, 230);
		levelUpGemsLocation = new Point(980, 220);
		levelUpGemsColor = -4028666;

		clickSelf = new Point(525, 340);
		clickNextToSelf = new Point(500, 340);
		clickNextToSelfLeft = new Point(460, 300);

		logout = new Point(550, 336);
		ballHealthPixelColorLocation = new Point(85, 695); // 40% health left
		ballHealthPixelColorLocation80 = new Point(85, 640); // 80% health left
		lastCharge1stFlaskLocation = new Point(228, 748);
		ballHealthColor = -6479330;
		ballHealthColor80 = -5627091;
		ballHealthColorDead = -13685196;
		ballHealthColor80Dead = -14148323;
		lastChargeFlaskColor = -11399167;
		timeAfterEnteringInstanceMS = 5000;
		timeAfterLoggingInMS = 5000;
		pixelColorsCheck = new int[] { 1, 2, 3, 4 };

		left = new Point(200, 300);
		right = new Point(800, 302);
		top = new Point(502, 110);
		bot = new Point(501, 500);
		lowerRight = new Point(870,610);
		loginNumbers = 0;
		run();

	}

	private static void run() throws Exception {
		// fireFlicker();
		fStormOrBFall();

	}

	static void fStormOrBFall() throws Exception {
		while (true) {
			inCharSelect();
			System.out.println(++loginNumbers);
			// TODO make char leave the items in the stash every 50 logins
			// inTownAndOutsideAct1ToTSF();
			// outside2ndTownFall();
			// inTownAndOutsideAct3toTCS();
			// outside3rdTownFall();
			// inTownAndOutsideAct3toGardens();
			// outside3rdTownGardensFrostNova();
			// inTown4AndOutsideLakeFall();
			// outside4thTownFall();
			// inTown4AndOutsideLakeFall();
			// outside4thTownFrostNova();
			// inTown4AndOutsideAquaFall();
			// outside4thTownAquaFrostNova();
			inTown4AndOutsideAquaFall();
			outside4thTownAquaFlicker();
//			inTown4AndOutsideLake3CurseFlicker();
//			outside4thTownFlicker();

		}

	}

	public static void fireFlicker() throws Exception {
		while (true) {

			// inCharSelect();
			// inTownAndOutsideImprLakeFlicker();
			outside4thTownFlicker();
		}
	}

	private static void inCharSelect() throws Exception {
		// something must have clicked during char select
		r.delay(7000);
		logoutIfNotInCharSelect();
		r.keyPress(KeyEvent.VK_ENTER);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_ENTER);
		whenInLoadingScreenWait();
		r.delay(timeAfterLoggingInMS);

	}

	private static void logoutIfNotInCharSelect() throws Exception {
		// if health ball is present - you are not in char select => logout
		// again
		// check 2 pixels 50 & 80 - if they are gray = char is dead - logout
		// if not - proceed by setting breakCycle to false
		Color color80 = r.getPixelColor(ballHealthPixelColorLocation80.x,
				ballHealthPixelColorLocation80.y);
		Color color = r.getPixelColor(ballHealthPixelColorLocation.x,
				ballHealthPixelColorLocation.y);
		if (color80.getRGB() == ballHealthColor80
				|| (color80.getRGB() == ballHealthColor80Dead
						&& color.getRGB() == ballHealthColorDead)) {
			globalLogout();
			r.delay(7000);
		} else {
			breakCycle = false;
		}

	}

	private static void whenInLoadingScreenWait() throws Exception {
		r.delay(3000);
		long startTime = System.currentTimeMillis();
		boolean flag = true;
		while (flag) {
			long estimatedTime = System.currentTimeMillis() - startTime;
			if (estimatedTime > 80000) {
				globalLogout();
				break;
			}
			System.out.println(System.currentTimeMillis());
			Color color80 = r.getPixelColor(ballHealthPixelColorLocation80.x,
					ballHealthPixelColorLocation80.y);
			Color color = r.getPixelColor(ballHealthPixelColorLocation.x,
					ballHealthPixelColorLocation.y);
			// no health ball present => we are in loading screen
			if (color80.getRGB() != ballHealthColor80
					&& color.getRGB() != ballHealthColor) {
				r.delay(1000);
			} else {
				flag = false;
			}
		}

	}

	private static void inTownAndOutsideImprLakeFlicker() throws Exception {

		originalMoveVariationInTown4CTRLPressed();

		goingToTheInstanceButton();
		castCursesAndGolem();
		r.delay(1000);

		levelUpGems();

		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);

	}

	private static void outside4thTownFlicker() throws Exception {

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound(true);

			r.mousePress(InputEvent.BUTTON3_MASK);
			r.delay(20);
			drinkPots345();
			// 1 time guaranteed right and every other - 1 bot
			instaClickAndMoveWith1SDelay(right.x, right.y);
			testPosition(right.x, right.y);
			instaMoveMouse(clickNextToSelf.x, clickNextToSelf.y);
			if (ra.nextBoolean()) {
				instaClickAndMoveWith1SDelay(lowerRight.x, lowerRight.y);
				instaMoveMouse(clickNextToSelf.x, clickNextToSelf.y);
			}
			//350 - 74
			breakCycle = checkHealthWhileFlickering();
			// int temp = ra.nextInt(3);
			// if (temp == 0) {
			// instaClickAndMoveWith1SDelay(left.x, left.y);
			// } else
			// if (temp == 1) {
			// instaClickAndMoveWith1SDelay(right.x, right.y);
			// } else
			// if (temp == 1 || temp == 2) {
			// instaClickAndMoveWith1SDelay(bot.x, bot.y);
			// }
			// else if (temp == 3) {
			// instaClickAndMoveWith1SDelay(top.x, top.y);
			// }

			// checkIfHealthIsLow();
			r.delay(15);

			r.mouseRelease(InputEvent.BUTTON3_MASK);

			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 100000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}

	private static void inTownAndOutsideAct1ToTSF() throws Exception {

		moveVariationInTown1toTSF();
		castCursesAndGolem();
		r.delay(1000);

		levelUpGems();
		instaClickAndMoveWith2SDelay(left.x, left.y);
		instaClickAndMoveWith2SDelay(100, 100);
		instaClickAndMoveWith2SDelay(100, 100);
		instaClickAndMoveWith2SDelay(100, 100);
		instaClickAndMoveWith2SDelay(100, 100);

	}

	static void inTownAndOutsideAct3toTCS() throws Exception {
		moveVariationInTown3toTCS();
		castCursesAndGolem();
		r.delay(1000);

		levelUpGems();
		instaClickAndMoveWith2SDelay(100, 100);
		instaClickAndMoveWith2SDelay(100, 100);
	}

	static void inTownAndOutsideAct3toGardens() throws Exception {
		moveVariationInTown3toGardens();
		castCursesAndGolem();
		r.delay(1000);

		// levelUpGems();
		instaClickAndMoveWith2SDelay(bot.x, 700);
		instaClickAndMoveWith2SDelay(800, 580);
		instaClickAndMoveWith2SDelay(800, 580);
		instaClickAndMoveWith2SDelay(800, 580);
		instaClickAndMoveWith2SDelay(800, 580);
		instaClickAndMoveWith2SDelay(800, 580);
	}

	private static void outside2ndTownFall() throws Exception {

		// r.delay(2000);

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();
			// hold mouse click near char and check if he is stuck

			r.delay(200);
			// TODO checkIfCharHasMoved(); // bool check 4-5 colors if they have
			// changed
			// 1 time guaranteed top and left + right every other
			// instaClickAndMoveWith1SDelay(top.x, top.y);

			// instaClickAndMoveWirtqth1SDelay(left.x, left.y);
			// instaClickAndMoveWith2SDelay(100,100);
			// if (ra.nextBoolean()) {
			// instaClickAndMoveWith1SDelay(1800,200);
			// }
			int temp = ra.nextInt(10);
			if (temp > 4) {
				instaClickAndMoveWith2SDelay(500, 50);
			} else if (temp < 4) {
				instaClickAndMoveWith2SDelay(100, 100);
			}

			breakCycle = checkHealthAndCastTotems();

			// checkIfHealthIsLow();
			// castTotemAtSelf();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// castTotemAtSelf();
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(100);

			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 200000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}

	private static boolean checkHealthAndCastTotems() throws Exception {

		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		castTotemAtSelf();
		r.delay(1000);
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(1000);
		ifNiceItemFound();
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(1000);
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(1000);
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(1000);
		castTotemAtSelf();
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(1000);
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(1000);
		ifNiceItemFound();
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(100);
		return false;

	}

	private static boolean checkHealthAndCastSpells() throws Exception {

		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		castDecoyTotemAtSelf();
		cast5SpellsAtCenter();
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		castDecoyTotemAtSelf();
		cast5SpellsAtCenter();
		ifNiceItemFound();
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		// castDecoyTotemAtSelf();
		// cast3SpellsAtCenter();
		// checkIfHealthIsLow();
		// if (breakCycle == true) {
		// return true;
		// }
		// castDecoyTotemAtSelf();
		// cast3SpellsAtCenter();
		// checkIfHealthIsLow();
		// if (breakCycle == true) {
		// return true;
		// }
		// castDecoyTotemAtSelf();
		// cast3SpellsAtCenter();
		// checkIfHealthIsLow();
		// if (breakCycle == true) {
		// return true;
		// }
		// castDecoyTotemAtSelf();
		// cast3SpellsAtCenter();
		// checkIfHealthIsLow();
		// if (breakCycle == true) {
		// return true;
		// }
		// castDecoyTotemAtSelf();
		// cast3SpellsAtCenter();
		// ifNiceItemFound();
		// checkIfHealthIsLow();
		// if (breakCycle == true) {
		// return true;
		// }
		r.delay(100);
		return false;

	}

	private static boolean checkHealthWhileFlickering() throws Exception {

		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(300);
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(300);
		// ifNiceItemFound(true);
		checkIfHealthIsLow();
		if (breakCycle == true) {
			return true;
		}
		r.delay(100);
		return false;

	}

	private static void outside3rdTownFall() throws Exception {

		// r.delay(2000);

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();
			// hold mouse click near char and check if he is stuck

			r.delay(200);
			ifNiceItemFound();
			// TODO checkIfCharHasMoved(); // bool check 4-5 colors if they have
			// changed
			// 1 time guaranteed top and left + right every other
			// instaClickAndMoveWith1SDelay(top.x, top.y);
			// instaClickAndMoveWith1SDelay(left.x, left.y);
			// instaClickAndMoveWith2SDelay(100,100);
			// if (ra.nextBoolean()) {
			// instaClickAndMoveWith1SDelay(1800,200);
			// }
			int temp = ra.nextInt(10);
			if (temp > 9) {
				instaClickAndMoveWith2SDelay(500, 50);
			} else if (temp < 9) {
				instaClickAndMoveWith2SDelay(100, 100);
			}

			breakCycle = checkHealthAndCastTotems();

			// checkIfHealthIsLow();
			// ifNiceItemFound();
			// castTotemAtSelf();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// ifNiceItemFound();
			// castTotemAtSelf();
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(100);

			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 200000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}

	private static void outside3rdTownGardensFrostNova() throws Exception {

		// r.delay(2000);

		long startTime = System.currentTimeMillis();
		int moves = 0;
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();
			// hold mouse click near char and check if he is stuck

			r.delay(200);
			ifNiceItemFound();
			if (moves < 15) {
				instaClickAndMoveWith2SDelay(800, 580);
				++moves;
			} else if (moves >= 15 && moves <= 30) {
				instaClickAndMoveWith2SDelay(800, 100);
				++moves;
			} else if (moves > 30) {
				// reached the gate - relog
				break;
			}

			breakCycle = checkHealthAndCastSpells();

			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 200000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}

	private static void outside4thTownFrostNova() throws Exception {

		// r.delay(2000);

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();
			// hold mouse click near char and check if he is stuck

			r.delay(200);
			ifNiceItemFound();
			int temp = ra.nextInt(3);
			if (temp == 0) {
				// instaClickAndMoveWith1SDelay(right.x, right.y);
				instaClickAndMoveWith2SDelay(950, 550);
			} else if (temp == 1) {
				// instaClickAndMoveWith1SDelay(bot.x, bot.y);
				instaClickAndMoveWith2SDelay(500, 720);
			} else {
				if (temp == 2) {
					instaClickAndMoveWith2SDelay(right.x, right.y);
				}
			}

			// breakCycle = checkHealthAndCastSpells();
			breakCycle = checkHealthAndCastTotems();

			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 200000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}

	private static void outside4thTownAquaFrostNova() throws Exception {

		// r.delay(2000);

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();
			// hold mouse click near char and check if he is stuck

			r.delay(200);
			ifNiceItemFound();
			instaClickAndMoveWith2SDelay(870, 610);
			// int temp = ra.nextInt(3);
			// if (temp == 0) {
			// // instaClickAndMoveWith1SDelay(right.x, right.y);
			// instaClickAndMoveWith2SDelay(950, 550);
			// } else if (temp == 1) {
			// // instaClickAndMoveWith1SDelay(bot.x, bot.y);
			// instaClickAndMoveWith2SDelay(500, 720);
			// } else {
			// if (temp == 2) {
			// instaClickAndMoveWith2SDelay(right.x, right.y);
			// }
			// }

			// breakCycle = checkHealthAndCastSpells();
			breakCycle = checkHealthAndCastTotems();

			long estimatedTime = System.currentTimeMillis() - startTime;
			// if the time in the instance is more than 2 min - relog
			if (estimatedTime > 150000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}

	private static void outside4thTownAquaFlicker() throws Exception {

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound(true);

			r.mousePress(InputEvent.BUTTON3_MASK);
			r.delay(20);
			drinkPots345();
			instaClickAndMoveWith1SDelay(lowerRight.x, lowerRight.y);
			testPosition(lowerRight.x, lowerRight.y);
			instaMoveMouse(clickNextToSelf.x, clickNextToSelf.y);
			
			breakCycle = checkHealthWhileFlickering();
			r.delay(30);

			r.mouseRelease(InputEvent.BUTTON3_MASK);

			long estimatedTime = System.currentTimeMillis() - startTime;
			if (estimatedTime > 25000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}



	public static void inTown4AndOutsideLakeFall() throws Exception {
		originalMoveVariationInTown4CTRLPressed();

		goingToTheInstanceButton();

		castCursesAndGolem();
		r.delay(1000);
		levelUpGems();

		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);

	}

	public static void inTown4AndOutsideLake3CurseFlicker() throws Exception {
		originalMoveVariationInTown4CTRLPressed();

		goingToTheInstanceButton();

		castCursesAndGolem(true);
		levelUpGems();

		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);

		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(bot.x, bot.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		instaClickAndMoveWith1SDelay(right.x, right.y);
		r.mouseRelease(InputEvent.BUTTON3_MASK);

	}

	public static void inTown4AndOutsideAquaFall() throws Exception {
		originalMoveVariationInTown4ToAqua();

		goingToTheInstanceButton();
		levelUpGems();

		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);

		castCursesAndGolem(true);
		r.delay(1000);

		r.keyPress(KeyEvent.VK_1);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_1);
		r.delay(1500);

		instaClickAndMoveWith2SDelay(1000, 370);
		instaClickAndMoveWith2SDelay(980, 120);
		instaMoveMouse(clickSelf.x, clickSelf.y);
		 r.mouseRelease(InputEvent.BUTTON3_MASK);
		 r.delay(1000);

	}

	private static void outside4thTownFall() throws Exception {
		// r.delay(2000);

		long startTime = System.currentTimeMillis();
		while (true) {
			if (breakCycle) {
				break;
			}
			ifNiceItemFound();
			// hold mouse click near char and check if he is stuck

			r.delay(200);
			// TODO checkIfCharHasMoved(); // bool check 4-5 colors if they have
			// changed
			// 1 time guaranteed top and left + right every other
			// instaClickAndMoveWith1SDelay(top.x, top.y);
			// instaClickAndMoveWith1SDelay(left.x, left.y);
			// instaClickAndMoveWith2SDelay(100,100);
			// if (ra.nextBoolean()) {
			// instaClickAndMoveWith1SDelay(1800,200);
			// }
			int temp = ra.nextInt(3);
			if (temp == 0) {
				// instaClickAndMoveWith1SDelay(right.x, right.y);
				instaClickAndMoveWith2SDelay(950, 550);
			} else if (temp == 2 || temp == 1) {
				// instaClickAndMoveWith1SDelay(bot.x, bot.y);
				instaClickAndMoveWith2SDelay(500, 720);
			}
			// TODO sometimes totem is not cast when char is inside a
			// no collision building

			breakCycle = checkHealthAndCastTotems();
			// checkIfHealthIsLow();
			// ifNiceItemFound();
			// castTotemAtSelf();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// ifNiceItemFound();
			// castTotemAtSelf();
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(1000);
			// checkIfHealthIsLow();
			// r.delay(100);

			long estimatedTime = System.currentTimeMillis() - startTime;
			if (estimatedTime > 200000) {
				if (breakCycle == false) {
					// if it is true, then we have already logged out from the
					// low health method
					globalLogout();
					break;
				}
			}
		}
	}

	private static void castTotemAtSelf() {
		if (ra.nextBoolean()) {
			instaMoveMouse(clickNextToSelfLeft.x, clickNextToSelfLeft.y);
		} else {
			instaMoveMouse(clickNextToSelf.x, clickNextToSelf.y);
		}
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
		r.delay(500);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(500);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(100);

	}

	private static void cast5SpellsAtCenter() {
		instaMoveMouse(clickSelf.x, clickSelf.y);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(500);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(500);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(500);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(500);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(100);

	}

	private static void castDecoyTotemAtSelf() {
		r.delay(200);
		instaMoveMouse(clickSelf.x, clickSelf.y);
		r.keyPress(KeyEvent.VK_E);
		r.delay(20);
		r.keyRelease(KeyEvent.VK_E);
	}

	private static void levelUpGems() {
		// level up gems
		instaMoveMouse(levelUpGemsLocation.x, levelUpGemsLocation.y);
		Color color = r.getPixelColor(levelUpGemsLocation.x, levelUpGemsLocation.y);
		if (color.getRGB() == levelUpGemsColor) {
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.delay(40);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			r.delay(40);
		} else {
			r.delay(150);
		}
		// TODO to be removed
		// int temp = ra.nextInt(100);
		// if (temp < 20) {
		// instaMoveMouse(levelUpGemsLocation.x, levelUpGemsLocation.y);
		// for (int i = 0; i < 10; i++) {
		// r.delay(40);
		// r.mousePress(InputEvent.BUTTON1_MASK);
		// r.delay(40);
		// r.mouseRelease(InputEvent.BUTTON1_MASK);
		// r.delay(40);
		// }
		// }
	}

	private static void moveVariationInTown3toTCS() throws Exception {
		// r.delay(6000);
		// first step after login
		instaClickAndMoveWith1SDelay(town3FirstMove.x, town3FirstMove.y);
		instaClickAndMoveWith1SDelay(town3SecondMove.x, town3SecondMove.y);
		r.keyPress(KeyEvent.VK_CONTROL);
		instaClickAndMoveWith1SDelay(town3ThirdMove.x, town3ThirdMove.y);
		r.delay(60);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(150);
		goingToTheInstanceButton();

	}

	private static void moveVariationInTown3toGardens() throws Exception {
		// r.delay(6000);
		// first step after login
		instaClickAndMoveWith1SDelay(town3FirstMove.x, town3FirstMove.y);
		instaClickAndMoveWith1SDelay(town3SecondMove.x, town3SecondMove.y);
		r.keyPress(KeyEvent.VK_CONTROL);
		instaClickAndMoveWith1SDelay(town3ThirdMoveGardens.x, town3ThirdMoveGardens.y);
		r.delay(60);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(150);
		goingToTheInstanceButton();

	}

	private static void moveVariationInTown1toTSF() throws Exception {
		// r.delay(6000);
		// first step after login
		instaClickAndMoveWith1SDelay(town1FirstMove.x, town1FirstMove.y);
		instaClickAndMoveWith1SDelay(town1SecondMove.x, town1SecondMove.y);
		instaClickAndMoveWith1SDelay(town1ThirdMove.x, town1ThirdMove.y);
		instaClickAndMoveWith1SDelay(town1FourthMoveClickOnly.x,
				town1FourthMoveClickOnly.y);
		r.keyPress(KeyEvent.VK_CONTROL);
		instaClickAndMoveWith1SDelay(town1FifthMoveClickOnly.x,
				town1FifthMoveClickOnly.y);
		r.delay(60);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(150);
		goingToTheInstanceButton();

	}

	public static void goingToTheInstanceButton() throws Exception {
		instaMoveMouse(newInstance.x, newInstance.y);
		r.delay(40);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(40);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		whenInLoadingScreenWait();
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
				// //work ballHealth detecting as item
				// //XXX check if problems at h
				// if(i >135 && i < 157 && p > 1045 && p < 1063 ){
				// continue;
				// }
				if (i > 935 && i < 955 && p > 660 && p < 685) {
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

	private static void ifNiceItemFound(boolean isFlicker) {
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
				// //work ballHealth detecting as item
				// //XXX check if problems at h
				// if(i >135 && i < 157 && p > 1045 && p < 1063 ){
				// continue;
				// }
				if (i > 935 && i < 955 && p > 660 && p < 685) {
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
			if (isFlicker) {
				r.mouseRelease(InputEvent.BUTTON3_MASK);
			}

			instaMoveMouse(clickSelf.x, clickSelf.y);
			r.mousePress(InputEvent.BUTTON1_MASK);
			r.delay(50);
			r.mouseRelease(InputEvent.BUTTON1_MASK);
			instaClickAndMoveWith2SDelay(point.x + 5, point.y + 5);
			if (isFlicker) {
				r.mousePress(InputEvent.BUTTON3_MASK);
			}
		}
	}

	public static void originalMoveVariationInTown4CTRLPressed() {
		// r.delay(6000);
		// first step after login
		instaClickAndMoveWith2SDelay(town4FirstMove.x, town4FirstMove.y);
		// going to above potion location before the gate
		instaClickAndMoveWith2SDelay(town4SecondMove.x, town4SecondMove.y);
		// clicking the door
		instaMoveMouse(town4ClickingDoor.x, town4ClickingDoor.y);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.delay(200);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(60);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(1000);
	}

	public static void originalMoveVariationInTown4ToAqua() {
		// r.delay(6000);
		// first step after login
		instaClickAndMoveWith2SDelay(town4FirstMoveAqua.x, town4FirstMoveAqua.y);
		// going to above potion location before the gate
		instaClickAndMoveWith2SDelay(town4SecondMoveAqua.x, town4SecondMoveAqua.y);
		// clicking the door
		instaMoveMouse(town4ClickingDoorAqua.x, town4ClickingDoorAqua.y);
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
		instaMoveMouse(clickSelf.x, clickSelf.y);

		r.keyPress(KeyEvent.VK_R);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_R);
		r.delay(1500);

		r.keyPress(KeyEvent.VK_T);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_T);
		r.delay(1500);

		r.keyPress(KeyEvent.VK_Q);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_Q);
		r.delay(500);

	}

	private static void castCursesAndGolem(boolean triCurse) {
		r.delay(100);
		instaMoveMouse(clickSelf.x, clickSelf.y);

		r.keyPress(KeyEvent.VK_R);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_R);
		r.delay(1500);

		r.keyPress(KeyEvent.VK_W);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_W);
		r.delay(1500);

		r.keyPress(KeyEvent.VK_T);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_T);
		r.delay(1500);

		r.keyPress(KeyEvent.VK_Q);
		r.delay(40);
		r.keyRelease(KeyEvent.VK_Q);
		r.delay(500);

	}

	private static void checkIfHealthIsLow() throws Exception {
		Color color = r.getPixelColor(ballHealthPixelColorLocation.x,
				ballHealthPixelColorLocation.y);
		Color color80 = r.getPixelColor(ballHealthPixelColorLocation80.x,
				ballHealthPixelColorLocation80.y);
		if (color80.getRGB() != ballHealthColor80) {
			if (ra.nextBoolean()) {
				useHealthPotion();
				r.delay(100);
			} else {
				useHealthPotion2();
				r.delay(100);
			}
		}
		if (color.getRGB() != ballHealthColor) {
			// lowHealth = true;
			// ifPotionEmptyLogout();
			useHealthPotion();
			r.delay(102);
			useHealthPotion2();
			globalLogout();

		}
	}

	private static void ifPotionEmptyLogout() throws Exception {
		// not same color as lvl 60 flask color
		Color color = r.getPixelColor(lastCharge1stFlaskLocation.x,
				lastCharge1stFlaskLocation.y);
		if (color.getRGB() != lastChargeFlaskColor) {
			// flask is empty - drink next one or logout
			globalLogout();
		}

	}

	private static void globalLogout() throws Exception {
		int randomDelay = ra.nextInt(250 - 150 + 1) + 150;
		// r.delay(randomDelay);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.delay(20);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		instaMoveMouse(logout.x, logout.y);
		breakCycle = true;
		// useHealthPotion2(); can't drink pot with esc menu up
		r.delay(randomDelay);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(20);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(1500);
	}

	private static void useHealthPotion() {
		r.delay(100);
		r.keyPress(KeyEvent.VK_1);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_1);
		r.delay(100);

	}

	private static void useHealthPotion2() {
		r.delay(100);
		r.keyPress(KeyEvent.VK_2);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_2);
		r.delay(100);

	}

	private static void emergency3rdPotDrinkMana() {
		r.delay(100);
		r.keyPress(KeyEvent.VK_3);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_3);
		r.delay(100);
	}

	private static void drinkPots4and5() {
		r.delay(20);
		r.keyPress(KeyEvent.VK_4);
		r.keyPress(KeyEvent.VK_5);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_5);
		r.delay(100);

	}
	
	private static void drinkPots345() {
		r.delay(20);
		r.keyPress(KeyEvent.VK_3);
		r.keyPress(KeyEvent.VK_4);
		r.keyPress(KeyEvent.VK_5);
		r.delay(100);
		r.keyRelease(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_5);
		r.delay(100);

		
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
