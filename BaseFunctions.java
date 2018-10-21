import java.util.Scanner;

public class BaseFunctions {

	protected final static double[] resList = { 1.0, 1.2, 1.5, 1.8, 2.2, 2.7, 3.3, 3.9, 4.7, 5.6, 6.0, 8.2 };
	protected static double lowestVal, returnVal, finalVal;

	protected static double resSelector() {
		Scanner input = new Scanner(System.in);
		System.out.println("*****NOT MEANT TO BE USED IN CALCULATIONS. EXPERIMENT ONLY*****");
		System.out.println("*****NOT LIABLE FOR DAMAGED COMPONENTS DUE TO IMPROPER RESISTANCE CALUATIONS*****");
		for (int i = 0; i < 3; i++) System.out.println("*");
		System.out.print("Enter your needed resistance value: ");
		double initVal = input.nextDouble();
		double finalVal = initVal;
		double baseVal, iterativeVal, valThree;
		finalVal = 0;
		int j = 0;
		if (initVal <= 0)
			System.out.println("Not valid");
		while (!(initVal > 0 && initVal < 10)) initVal /= 10;
		if (initVal == 1) returnVal = resList[0];
		for (int i = 1; i < resList.length; i++) {
			baseVal = Math.abs(initVal - resList[0]);
			iterativeVal = Math.abs(initVal - resList[i]);
			if (iterativeVal < baseVal && j == 0) {
				lowestVal = iterativeVal;
				j = 1;
			}
			if (iterativeVal < lowestVal && j != 0) {
				lowestVal = iterativeVal;
				returnVal = resList[i];
			}
		}
		return returnVal;
	}

	protected static double fullResValFinder() {
		while (returnVal <= finalVal / 10) {
			returnVal *= 10;
		}
		return returnVal;
	}
	protected static double ohmsLawCalc(double voltage, double current) {
		double resistance = voltage / current;
		return resistance;
	}
}
