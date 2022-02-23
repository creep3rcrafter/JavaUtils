package creep3rcrafter.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Random;

public class BetterMath {

	public void Example() {
		float f = 0f;
		double d = 0;
		int i = 0;
		long l = 0;

		f = totalDistance(1f);
		d = totalDistance(1.0);
		i = totalDistance(1);
		l = totalDistance((long) 1);
		f = radiusToCircumference(1f);
		d = radiusToCircumference(1.0);
	}

	public enum Axis {
		X, Y, Z
	}

	public enum Unit {
		DEGREES, RADIANS, MAGNITUDE_X, MAGNITUDE_Y
	}

	public enum Directions {
		NORTH(0, 1, 0), SOUTH(0, -1, 0), EAST(1, 0, 0), WEST(-1, 0, 0), UP(0, 0, 1), DOWN(0, 0, -1), Left(-1, 0, 0),
		RIGHT(1, 0, 0), FORWARD(0, 1, 0), BACKWARD(0, -1, 0), ZERO(0, 0, 0);

		Directions(int x, int y, int z) {
		}
	}

	public static int clamp(int val, int min, int max) {
		return Math.max(min, Math.min(max, val));
	}

	public static float clamp(float val, float min, float max) {
		return Math.max(min, Math.min(max, val));
	}

	public static double clamp(double val, double min, double max) {
		return Math.max(min, Math.min(max, val));
	}

	public static long clamp(long val, long min, long max) {
		return Math.max(min, Math.min(max, val));
	}

	/**
	 * Gets the distance between 2 or more numbers if more than 2 parameters are
	 * added it adds the total of all of them.
	 * 
	 * @param var Enter 2 or more floats if only one is entered it will return the
	 *            abs of var
	 **/
	public static float totalDistance(float... var) {
		float total = 0;
		for (float Var : var) {
			total = total + Math.abs(Var);
		}
		return total;
	}

	/**
	 * Gets the distance between 2 or more numbers if more than 2 parameters are
	 * added it adds the total of all of them.
	 * 
	 * @param var Enter 2 or more doubles if only one is entered it will return the
	 *            abs of var
	 **/
	public static double totalDistance(double... var) {
		double total = 0;
		for (double Var : var) {
			total = total + Math.abs(Var);
		}
		return total;
	}

	/**
	 * Gets the distance between 2 or more numbers if more than 2 parameters are
	 * added it adds the total of all of them.
	 * 
	 * @param var Enter 2 or more ints if only one is entered it will return the abs
	 *            of var
	 **/
	public static int totalDistance(int... var) {
		int total = 0;
		for (int Var : var) {
			total = total + Math.abs(Var);
		}
		return total;
	}

	/**
	 * Gets the distance between 2 or more numbers if more than 2 parameters are
	 * added it adds the total of all of them.
	 * 
	 * @param var Enter 2 or more longs if only one is entered it will return the
	 *            abs of var
	 **/
	public static long totalDistance(long... var) {
		long total = 0;
		for (long Var : var) {
			total = total + Math.abs(Var);
		}
		return total;
	}

	/**
	 * Converts Radius to Circumference
	 * 
	 * @param radius
	 **/
	public static float radiusToCircumference(float radius) {
		return (float) (2 * Math.PI * radius);
	}

	/**
	 * Converts Radius to Circumference
	 * 
	 * @param radius
	 **/
	public static double radiusToCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	/**
	 * Converts Degrees to Radians
	 * 
	 * @param degrees
	 **/
	public static float degToRad(float degrees) {
		return (float) ((degrees / 180) * Math.PI);
	}

	/**
	 * Converts Degrees to Radians
	 * 
	 * @param degrees
	 **/
	public static double degToRad(double degrees) {
		return (degrees / 180) * Math.PI;
	}

	/**
	 * Converts Radians to Degrees
	 * 
	 * @param Radians
	 **/
	public static float radToDeg(float radians) {
		return (float) (radians * 180 / Math.PI);
	}

	/**
	 * Converts Radians to Degrees
	 * 
	 * @param Radians
	 **/
	public static double radToDeg(double radians) {
		return radians * 180 / Math.PI;
	}

	/**
	 * Lerps between a and b Using t
	 * 
	 * @param a
	 * @param b
	 * @param t 0.0f to 1.0f
	 **/
	public static float lerp(float a, float b, float t) {
		return a + (b - a) * t;
	}

	/**
	 * Lerps between a and b Using t
	 * 
	 * @param a
	 * @param b
	 * @param t 0.0f to 1.0f
	 **/
	public static double lerp(double a, double b, double t) {
		return a + (b - a) * t;
	}

	/**
	 * Lerps between a and b Using t
	 * 
	 * @param a
	 * @param b
	 * @param t 0.0f to 1.0f
	 **/
	public static int lerp(int a, int b, int t) {
		return a + (b - a) * t;
	}

	/**
	 * Lerps between a and b Using t
	 * 
	 * @param a
	 * @param b
	 * @param t 0.0f to 1.0f
	 **/
	public static long lerp(long a, long b, long t) {
		return a + (b - a) * t;
	}

	/**
	 * Gets the X or Y magnitude of angle
	 * 
	 * @param input either degrees or radians based on unit
	 * @param axis  x or y
	 * @param unit  = MAGNITUDE_X or MAGNITUDE_Y
	 **/
	public static float getXorYMagnitudeOfAngle(float input, Axis axis, Unit unit) {
		if (unit == Unit.RADIANS) {
			if (axis == Axis.X) {
				return (float) Math.cos(input);
			} else if (axis == Axis.Y) {
				return (float) Math.sin(input);
			} else {
				return 0f;
			}
		} else if (unit == Unit.DEGREES) {
			if (axis == Axis.X) {
				return (float) Math.cos(degToRad(input));
			} else if (axis == Axis.Y) {
				return (float) Math.sin(degToRad(input));
			} else {
				return 0f;
			}
		} else {
			return 0f;
		}
	}

	/**
	 * Gets the X or Y magnitude of angle
	 * 
	 * @param input either degrees or radians based on unit
	 * @param axis  x or y
	 * @param unit  = MAGNITUDE_X or MAGNITUDE_Y
	 **/
	public static double getXorYMagnitudeOfAngle(double input, Axis axis, Unit unit) {
		if (unit == Unit.RADIANS) {
			if (axis == Axis.X) {
				return Math.cos(input);
			} else if (axis == Axis.Y) {
				return Math.sin(input);
			} else {
				return 0.0;
			}
		} else if (unit == Unit.DEGREES) {
			if (axis == Axis.X) {
				return Math.cos(degToRad(input));
			} else if (axis == Axis.Y) {
				return Math.sin(degToRad(input));
			} else {
				return 0.0;
			}
		} else {
			return 0.0;
		}
	}

	/**
	 * Generates a random number between your minimum and maximum
	 * 
	 * @param min
	 * @param max
	 **/
	public static float randRange(float min, float max) {
		Random rand = new Random();
		return rand.nextFloat() * (max - min) + min;
	}

	/**
	 * Generates a random number between your minimum and maximum
	 * 
	 * @param min
	 * @param max
	 **/
	public static double randRange(double min, double max) {
		Random rand = new Random();
		return rand.nextDouble() * (max - min) + min;
	}

	/**
	 * Generates a random number between your minimum and maximum
	 * 
	 * @param min
	 * @param max
	 **/
	public static int randRange(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min) + min;
	}

	/**
	 * Generates a random number between your minimum and maximum
	 * 
	 * @param min
	 * @param max
	 **/
	public static long randRange(long min, long max) {
		Random rand = new Random();
		return rand.nextLong() * (max - min) + min;
	}

	public static float roundToDecPlace(float input, int decimalPlaces) {
		int places = (int) Math.pow(10, decimalPlaces);
		return (float) Math.round(input * places) / (float) places;
	}

	public static double roundToDecPlace(double input, int decimalPlaces) {
		int places = (int) Math.pow(10, decimalPlaces);
		return (double) Math.round(input * places) / (double) places;
	}

	public static float map(float x, float inMin, float inMax, float outMin, float outMax) {
		return (x - inMin) * (outMax - outMin) / (inMax - inMin) + outMin;
	}

	public static double map(double x, double inMin, double inMax, double outMin, double outMax) {
		return (x - inMin) * (outMax - outMin) / (inMax - inMin) + outMin;
	}

	public static int map(int x, int inMin, int inMax, int outMin, int outMax) {
		return (x - inMin) * (outMax - outMin) / (inMax - inMin) + outMin;
	}

	public static long map(long x, long inMin, long inMax, long outMin, long outMax) {
		return (x - inMin) * (outMax - outMin) / (inMax - inMin) + outMin;
	}

	public static float max(float... var) {
		float lastMax = var[0];
		for (Float Var : var) {
			lastMax = Math.max(lastMax, Var);
		}
		return lastMax;
	}

	public static double max(double... var) {
		double lastMax = var[0];
		for (double Var : var) {
			lastMax = Math.max(lastMax, Var);
		}
		return lastMax;
	}

	public static int max(int... var) {
		int lastMax = var[0];
		for (int Var : var) {
			lastMax = Math.max(lastMax, Var);
		}
		return lastMax;
	}

	public static long max(long... var) {
		long lastMax = var[0];
		for (long Var : var) {
			lastMax = Math.max(lastMax, Var);
		}
		return lastMax;
	}

	public static float min(float... var) {
		float lastMin = var[0];
		for (Float Var : var) {
			lastMin = Math.min(lastMin, Var);
		}
		return lastMin;
	}

	public static double min(double... var) {
		double lastMin = var[0];
		for (double Var : var) {
			lastMin = Math.min(lastMin, Var);
		}
		return lastMin;
	}

	public static int min(int... var) {
		int lastMin = var[0];
		for (int Var : var) {
			lastMin = Math.min(lastMin, Var);
		}
		return lastMin;
	}

	public static long min(long... var) {
		long lastMin = var[0];
		for (long Var : var) {
			lastMin = Math.min(lastMin, Var);
		}
		return lastMin;
	}

	// Basic Math Operations
	// Add
	public static float add(float... var) {
		float total = 0;
		for (float Var : var) {
			total = total + Var;
		}
		return total;
	}

	public static double add(double... var) {
		double total = 0;
		for (double Var : var) {
			total = total + Var;
		}
		return total;
	}

	public static int add(int... var) {
		int total = 0;
		for (int Var : var) {
			total = total + Var;
		}
		return total;
	}

	public static long add(long... var) {
		long total = 0;
		for (long Var : var) {
			total = total + Var;
		}
		return total;
	}

	// Subtract
	public static float subtract(float... var) {
		float total = 0;
		for (float Var : var) {
			total = total - Var;
		}
		return total;
	}

	public static double subtract(double... var) {
		double total = 0;
		for (double Var : var) {
			total = total - Var;
		}
		return total;
	}

	public static int subtract(int... var) {
		int total = 0;
		for (int Var : var) {
			total = total - Var;
		}
		return total;
	}

	public static long subtract(long... var) {
		long total = 0;
		for (long Var : var) {
			total = total - Var;
		}
		return total;
	}

	// multiply
	public static float multiply(float... var) {
		float total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total * var[i];
		}
		return total;
	}

	public static double multiply(double... var) {
		double total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total * var[i];
		}
		return total;
	}

	public static int multiply(int... var) {
		int total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total * var[i];
		}
		return total;
	}

	public static long multiply(long... var) {
		long total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total * var[i];
		}
		return total;
	}

	// divide
	public static float divide(float... var) {
		float total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total / var[i];
		}
		return total;
	}

	public static double divide(double... var) {
		double total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total / var[i];
		}
		return total;
	}

	public static int divide(int... var) {
		int total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total / var[i];
		}
		return total;
	}

	public static long divide(long... var) {
		long total = var[0];
		for (int i = 1; i < var.length; i++) {
			total = total / var[i];
		}
		return total;
	}

	// mean
	public static float mean(float... var) {
		return add(var) / var.length;
	}

	public static double mean(double... var) {
		return add(var) / var.length;
	}

	public static int mean(int... var) {
		return add(var) / var.length;
	}

	public static long mean(long... var) {
		return add(var) / var.length;
	}

	// median
	public static float median(float... var) {
		if (var.length % 2 == 1) {
			return var[(var.length + 1) / 2 - 1];
		} else {
			return (var[var.length / 2 - 1] + var[var.length / 2]) / 2;
		}
	}

	public static double median(double... var) {
		if (var.length % 2 == 1) {
			return var[(var.length + 1) / 2 - 1];
		} else {
			return (var[var.length / 2 - 1] + var[var.length / 2]) / 2;
		}
	}

	public static int median(int... var) {
		if (var.length % 2 == 1) {
			return var[(var.length + 1) / 2 - 1];
		} else {
			return (var[var.length / 2 - 1] + var[var.length / 2]) / 2;
		}
	}

	public static long median(long... var) {
		if (var.length % 2 == 1) {
			return var[(var.length + 1) / 2 - 1];
		} else {
			return (var[var.length / 2 - 1] + var[var.length / 2]) / 2;
		}
	}

	// mode
	public static float mode(float... var) {
		float mostOccured = 0;
		int maxCount = 0;
		for (int i = 0; i < var.length; i++) {
			int count = 0;
			for (int j = 0; j < var.length; j++) {
				if (var[j] == var[i]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostOccured = var[i];
			}
		}
		return mostOccured;
	}

	public static double mode(double... var) {
		double mostOccured = 0;
		int maxCount = 0;
		for (int i = 0; i < var.length; i++) {
			int count = 0;
			for (int j = 0; j < var.length; j++) {
				if (var[j] == var[i]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostOccured = var[i];
			}
		}
		return mostOccured;
	}

	public static int mode(int... var) {
		int mostOccured = 0;
		int maxCount = 0;
		for (int i = 0; i < var.length; i++) {
			int count = 0;
			for (int j = 0; j < var.length; j++) {
				if (var[j] == var[i]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostOccured = var[i];
			}
		}
		return mostOccured;
	}

	public static long mode(long... var) {
		long mostOccured = 0;
		int maxCount = 0;
		for (int i = 0; i < var.length; i++) {
			int count = 0;
			for (int j = 0; j < var.length; j++) {
				if (var[j] == var[i]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostOccured = var[i];
			}
		}
		return mostOccured;
	}

	// range
	public static float range(float... var) {
		return max(var) - min(var);
	}

	public static double range(double... var) {
		return max(var) - min(var);
	}

	public static int range(int... var) {
		return max(var) - min(var);
	}

	public static long range(long... var) {
		return max(var) - min(var);
	}

	// midRange
	public static float midRange(float... var) {
		return (min(var) + max(var) / 2);
	}

	public static double midRange(double... var) {
		return (min(var) + max(var) / 2);
	}

	public static int midRange(int... var) {
		return (min(var) + max(var) / 2);
	}

	public static long midRange(long... var) {
		return (min(var) + max(var) / 2);
	}

	// rectangleVolume
	public static float cuboidVolume(float length, float width, float height) {
		return multiply(length, width, height);
	}

	public static double cuboidVolume(double length, double width, double height) {
		return multiply(length, width, height);
	}

	public static int cuboidVolume(int length, int width, int height) {
		return multiply(length, width, height);
	}

	public static long cuboidVolume(long length, long width, long height) {
		return multiply(length, width, height);
	}

	public static double unitCircle(Unit inputUnit, Unit outPutUnit, double input) {
		switch (outPutUnit) {
		case RADIANS:
			switch (inputUnit) {
			case DEGREES:
				return degToRad(input);
			case MAGNITUDE_X:
				return Math.asin(input);
			case MAGNITUDE_Y:
				return Math.acos(input);
			case RADIANS:
				return input;
			}
		case DEGREES:
			switch (inputUnit) {
			case DEGREES:
				return input;
			case MAGNITUDE_X:
				return radToDeg(Math.asin(input));
			case MAGNITUDE_Y:
				return radToDeg(Math.acos(input));
			case RADIANS:
				return radToDeg(input);
			}
		case MAGNITUDE_X:
			switch (inputUnit) {
			case DEGREES:
				return radToDeg(Math.asin(input));
			case RADIANS:
				return Math.asin(input);
			}
		case MAGNITUDE_Y:
			switch (inputUnit) {
			case DEGREES:
				return radToDeg(Math.acos(input));
			case RADIANS:
				return Math.acos(input);
			}
		default:
			return 0.0;
		}
	}

	public static double findClosest(double target, double... input) {
		int closestPos = 0;
		double lastClosest = 0;
		double lastMax = input[0];
		for (double Var : input) {
			lastMax = Math.max(lastMax, Math.abs(Var));
		}
		lastClosest = lastMax;
		for (int j = 0; j < input.length; j++) {
			if (input[j] == target) {
				return input[j];
			}
			if (Math.abs(betterSubtract(target, input[j])) < lastClosest) {
				lastClosest = Math.abs(betterSubtract(target, input[j]));
				closestPos = j;
			}
		}
		return input[closestPos];
	}

	public static float findClosest(double target, float... input) {
		int closestPos = 0;
		double lastClosest = 0;
		double lastMax = input[0];
		for (double Var : input) {
			lastMax = Math.max(lastMax, Math.abs(Var));
		}
		lastClosest = lastMax;
		for (int j = 0; j < input.length; j++) {
			if (input[j] == target) {
				return input[j];
			}
			if (Math.abs(betterSubtract(target, input[j])) < lastClosest) {
				lastClosest = Math.abs(betterSubtract(target, input[j]));
				closestPos = j;
			}
		}
		return input[closestPos];
	}

	public static int findClosest(double target, int... input) {
		int closestPos = 0;
		double lastClosest = 0;
		double lastMax = input[0];
		for (double Var : input) {
			lastMax = Math.max(lastMax, Math.abs(Var));
		}
		lastClosest = lastMax;
		for (int j = 0; j < input.length; j++) {
			if (input[j] == target) {
				return input[j];
			}
			if (Math.abs(betterSubtract(target, input[j])) < lastClosest) {
				lastClosest = Math.abs(betterSubtract(target, input[j]));
				closestPos = j;
			}
		}
		return input[closestPos];
	}

	public static long findClosest(double target, long... input) {
		int closestPos = 0;
		double lastClosest = 0;
		double lastMax = input[0];
		for (double Var : input) {
			lastMax = Math.max(lastMax, Math.abs(Var));
		}
		lastClosest = lastMax;
		for (int j = 0; j < input.length; j++) {
			if (input[j] == target) {
				return input[j];
			}
			if (Math.abs(betterSubtract(target, input[j])) < lastClosest) {
				lastClosest = Math.abs(betterSubtract(target, input[j]));
				closestPos = j;
			}
		}
		return input[closestPos];
	}

	public static double betterSubtract(double a, double b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.subtract(d);
		return c.doubleValue();
	}

	public static float betterSubtract(float a, float b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.subtract(d);
		return c.floatValue();
	}

	public static int betterSubtract(int a, int b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.subtract(d);
		return c.intValue();
	}

	public static long betterSubtract(long a, long b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.subtract(d);
		return c.longValue();
	}

	public static double betterAdd(double a, double b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.add(d);
		return c.doubleValue();
	}

	public static float betterAdd(float a, float b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.add(d);
		return c.floatValue();
	}

	public static int betterAdd(int a, int b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.add(d);
		return c.intValue();
	}

	public static long betterAdd(long a, long b) {
		BigDecimal c = new BigDecimal(a, MathContext.DECIMAL64);
		BigDecimal d = new BigDecimal(b, MathContext.DECIMAL64);
		c = c.add(d);
		return c.longValue();
	}

	public static double farthest(double target, double... input) {
		return 0;
	}

	public static double probablity(int numOfFavorableOutcomes, Object... sample) {
		return (double) sample.length / numOfFavorableOutcomes;
	}

	public static float celsiusToFahrenheit(float c) {
		return 1.8f * c + 32f;
	}

	public static double celsiusToFahrenheit(double c) {
		return 1.8 * c + 32.0;
	}

	public static float fahrenheitToCelsius(float f) {
		return (f - 32f) / 1.8f;
	}

	public static double fahrenheitToCelsius(double f) {
		return (f - 32.0) / 1.8;
	}

	// Slope

	// slope intercept y=mx+b.
	// vector2 midpoint
	// triangle area a = 1/2 (5)(8) (base)(Height)
	// Pythagorean Theorem
	// Area of Rectangle: area = length x width
	// Area of Circle
	// The perimeter of Square
	// Perimeter of Rectangle = P = 2(l + b)
	// The area of Square
}
