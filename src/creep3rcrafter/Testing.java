package creep3rcrafter;

import creep3rcrafter.math.BetterMath;

public class Testing {

	public static void main(String[] args) {
		int[] numsi = { 1, 2, 3, 4, 5, 6, 7 };
		long[] numsl = { 1, 2, 3, 4, 5, 6, 7 };
		float[] numsf = { 1, 2, 3, 4, 5, 6, 7 };
		double[] numsd = { 1, 2, 3, 4, 5, 6, 7 };
		double num = 1234.123456789;
		System.out.println("Closest int: " + BetterMath.findClosest(4.5, numsi));
		System.out.println("Closest long: " + BetterMath.findClosest(4.6, numsl));
		System.out.println("Closest float: " + BetterMath.findClosest(4.5, numsf));
		System.out.println("Closest double: " + BetterMath.findClosest(4.5, numsf));
		System.out.println("Floating point subtract: " + (5.2 - 5) + "\nBetterSubtract: " + BetterMath.betterSubtract(5.2, 5));
		for (int i = 1; i < 9; i++) {
			System.out.println("RoundToDecPlace: " + BetterMath.roundToDecPlace(num, i));
		}
		System.out.println("UnitCircle Angle to Rad: " + BetterMath.unitCircle(BetterMath.Unit.DEGREES, BetterMath.Unit.RADIANS, 60));
		System.out.println("Map: " + BetterMath.map(567, 0, 1000, 27, 4324));
		System.out.println("Min: " + BetterMath.min(numsd));
		System.out.println("Max: " + BetterMath.max(numsd));
		System.out.println("Add: " + BetterMath.add(numsd));
		System.out.println("Subtract: " + BetterMath.subtract(numsd));
		System.out.println("Multiply: " + BetterMath.multiply(numsd));
		System.out.println("Divide: " + BetterMath.divide(numsd));
		System.out.println("Mode: " + BetterMath.mode(numsd));
		System.out.println("Mean: " + BetterMath.mean(numsd));
		System.out.println("median: " + BetterMath.median(numsd));
		System.out.println("Range: " + BetterMath.range(numsd));
		System.out.println("Mid Range: " + BetterMath.midRange(numsd));
		System.out.println("Random Range: " + BetterMath.randRange(0, 1000));
	}

}
