import java.util.Scanner;

public class ETwelveSeriesSelector {

/*
 * Created by Maalv on 10/18/18
 */
	
    static double lowestVal;
	public static void main(String[] args) {
		double[] resList = {1.0, 1.2, 1.5, 1.8, 2.2, 2.7, 3.3, 3.9, 4.7, 5.6, 6.0, 8.2};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your needed resistance value: ");
		double initVal = input.nextDouble();
		double baseVal, iterativeVal, valThree, returnVal = 0;
		int j = 0;
        if (initVal == 0 || initVal < 0) System.out.println("Not valid");
		while (!(initVal > 0 && initVal < 10)) {
			initVal /= 10;
//			System.out.println(initVal + "After division");
		}
		if (initVal == 1) returnVal = resList[0];
//		System.out.println(initVal + " AFTER FIRst");
		for (int i = 1; i < resList.length; i++) {
			baseVal = Math.abs(initVal - resList[0]);
			iterativeVal = Math.abs(initVal - resList[i]);
//			valThree = resList[i];
//			System.out.println("baseVal, iterativeVal, ValThree " + baseVal + " "+ iterativeVal + " " + valThree);
		    if (iterativeVal < baseVal && j == 0) {
			lowestVal = iterativeVal;
			j = 1;
//			System.out.println(lowestVal + " lowestVal after j ==1");
		    }
		    if (iterativeVal < lowestVal && j != 0) {
		        lowestVal = iterativeVal;
//		        System.out.println(lowestVal + " after second if");
		        returnVal = resList[i];
		    }
		}
	System.out.println(returnVal);
	}
}