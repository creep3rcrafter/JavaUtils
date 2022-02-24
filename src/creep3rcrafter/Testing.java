package creep3rcrafter;

import creep3rcrafter.math.BetterMath;
import creep3rcrafter.math.Fraction;

public class Testing {

	public static void main(String[] args) {
		double[] nums = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0 };
		double num = 1234.123456789;
		System.out.println("Closest double: " + BetterMath.findClosest(4.5, nums));
		System.out.println("Floating point subtract: " + (5.2 - 5) + "\nBetterSubtract: " + BetterMath.betterSubtract(5.2, 5));
		for (int i = 1; i < 9; i++) {
			System.out.println("RoundToDecPlace: " + BetterMath.roundToDecPlace(num, i));
		}
		System.out.println("UnitCircle Angle to Rad: " + BetterMath.unitCircle(BetterMath.Unit.DEGREES, BetterMath.Unit.RADIANS, 60));
		System.out.println("Map: " + BetterMath.map(567, 0, 1000, 27, 4324));
		System.out.println("Min: " + BetterMath.min(nums));
		System.out.println("Max: " + BetterMath.max(nums));
		System.out.println("Add: " + BetterMath.add(nums));
		System.out.println("Subtract: " + BetterMath.subtract(nums));
		System.out.println("Multiply: " + BetterMath.multiply(nums));
		System.out.println("Divide: " + BetterMath.divide(nums));
		System.out.println("Mode: " + BetterMath.mode(nums));
		System.out.println("Mean: " + BetterMath.mean(nums));
		System.out.println("Median: " + BetterMath.median(nums));
		System.out.println("Range: " + BetterMath.range(nums));
		System.out.println("Mid Range: " + BetterMath.midRange(nums));
		System.out.println("Random Range: " + BetterMath.randRange(0, 1000));
		System.out.println("Greatest Common Factor: " + BetterMath.greatestCommonFactor(256, 32));
		System.out.println("Greatest Common Factor: " + BetterMath.greatestCommonFactor(63, 257));
		System.out.println("Greatest Common Factor: " + BetterMath.greatestCommonFactor(63*2, 257*2));
		System.out.println("Greatest Common Factor: " + BetterMath.greatestCommonFactor(3, 11));
		System.out.println("Greatest Common Factor: " + BetterMath.greatestCommonFactor(6, 27));
		
		Fraction fraction1 = new Fraction(32, 256);
		Fraction fraction2 = new Fraction(134, 322);
		Fraction fraction3 = new Fraction(326, 414);
		System.out.println(fraction1.toString());
		System.out.println(fraction1.getDecimal());
		System.out.println(fraction1.getPercent());
		fraction1.simplify();
		System.out.println(fraction1.toString());

		System.out.println(fraction2.toString());

		System.out.println(fraction2.getDecimal());
		System.out.println(fraction3.getDecimal());
		fraction2.add(fraction3);
		System.out.println(fraction2.toString());
		System.out.println(fraction2.getDecimal());
	}

}
