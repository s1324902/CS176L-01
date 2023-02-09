import java.util.Scanner;

public class HousePainting1 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		
	double costSquareFt, Houselength, Housewidth, Househeight, numWindows, Windowwidth, Windowlength, numDoor, doorlength, doorWidth, side, Peakside, windowSquareFoot, HouseNoWin, howMuch, totalPaintArea;
		
		System.out.print("Please enter the cost per square foot: ");
		costSquareFt = sc.nextDouble();
		System.out.print("Please enter the length of the house: ");
		Houselength = sc.nextDouble();
		System.out.print("Please enter the width of the house: ");
		Housewidth = sc.nextDouble();
		System.out.print("Please enter the height of the house: ");
		Househeight = sc.nextDouble();
		System.out.print("Please enter the number of windows: ");
		numWindows = sc.nextDouble();
		System.out.print("Please enter the length of a window: ");
		Windowlength = sc.nextDouble();
		System.out.print("Please enter the width of a window: ");
		Windowwidth = sc.nextDouble();
		System.out.print("Please enter the number of doors: ");
		numDoor = sc.nextDouble();
		System.out.print("Please enter the length of a door: ");
		doorlength = sc.nextDouble();
		System.out.print("Please enter the width of a door: ");
		doorWidth = sc.nextDouble();
		side = Housewidth * Houselength;
		Peakside = Housewidth * Houselength + 0.5 * (Houselength*(Househeight-Housewidth));
		windowSquareFoot = numWindows * ( Windowlength * Windowwidth);
		totalPaintArea = 
				Peakside * 2 + windowSquareFoot + side * 2;
		howMuch = totalPaintArea * costSquareFt;
		System.out.println("Your total paintable surface area is: " + totalPaintArea + " square feet.");
		System.out.println("Your estimate is: " + howMuch + " dollars.");
		sc.close();
				
		

		
		
		}

}
