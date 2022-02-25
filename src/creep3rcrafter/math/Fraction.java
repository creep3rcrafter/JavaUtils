package creep3rcrafter.math;

public class Fraction {
	public int numerator;
	public int denominator;

	public boolean isImproperFraction = false;

	public Fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		if (numerator > denominator) {
			isImproperFraction = true;
		}
		simplify();
	}

	public Fraction(int numerator, int denominator, boolean simplify) {
		this.numerator = numerator;
		this.denominator = denominator;
		if (numerator > denominator) {
			isImproperFraction = true;
		}
		if (simplify) {
			simplify();
		}
	}

	public void simplify() {
		int gcf = BetterMath.greatestCommonFactor(this.numerator, this.denominator);
		this.numerator = this.numerator / gcf;
		this.denominator = this.denominator / gcf;
	}

	public void multiply(Fraction fraction) {
		this.numerator = this.numerator * fraction.numerator;
		this.denominator = this.denominator * fraction.denominator;
		simplify();
	}

	public void multiply(Fraction fraction, boolean simplify) {
		this.numerator = this.numerator * fraction.numerator;
		this.denominator = this.denominator * fraction.denominator;
		if (simplify) {
			simplify();
		}
	}

	public void divide(Fraction fraction) {
		this.numerator = this.numerator * fraction.denominator;
		this.denominator = this.denominator * fraction.numerator;
		simplify();
	}

	public void divide(Fraction fraction, boolean simplify) {
		this.numerator = this.numerator * fraction.denominator;
		this.denominator = this.denominator * fraction.numerator;
		if (simplify) {
			simplify();
		}
	}

	public void add(Fraction fraction) {
		int numerator1 = this.numerator * fraction.denominator;
		int numerator2 = fraction.numerator * this.denominator;
		int denominator = fraction.denominator * this.denominator;
		this.numerator = numerator1 + numerator2;
		this.denominator = denominator;
		simplify();
	}

	public void add(Fraction fraction, boolean simplify) {
		int numerator1 = this.numerator * fraction.denominator;
		int numerator2 = fraction.numerator * this.denominator;
		int denominator = fraction.denominator * this.denominator;
		this.numerator = numerator1 + numerator2;
		this.denominator = denominator;
		if (simplify) {
			simplify();
		}
	}

	public void subtract(Fraction fraction) {
		int numerator1 = this.numerator * fraction.denominator;
		int numerator2 = fraction.numerator * this.denominator;
		int denominator = fraction.denominator * this.denominator;
		this.numerator = numerator1 - numerator2;
		this.denominator = denominator;
		simplify();
	}

	public void subtract(Fraction fraction, boolean simplify) {
		int numerator1 = this.numerator * fraction.denominator;
		int numerator2 = fraction.numerator * this.denominator;
		int denominator = fraction.denominator * this.denominator;
		this.numerator = numerator1 - numerator2;
		this.denominator = denominator;
		if (simplify) {
			simplify();
		}
	}

	public double getcDecimal() {
		return (double) this.numerator / (double) this.denominator;
	}

	public double getPercent() {
		return getDecimal() * 100.0;
	}

	public void setFraction(double decimal) {
		int length = (int) String.valueOf(decimal).split("\\.")[1].length();
		int decimalInt = (int) Math.pow(10, length);
		int gcf = BetterMath.greatestCommonFactor(decimalToInt, 100);
		int n = decimalToInt;
		int d = (int) Math.pow(10, length);
		this.numerator = n;
		this.denominator = d;
		simplify();
	}

	public void setFraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = numerator;
	}

	public boolean isProperFraction() {
		return this.isImproperFraction;
	}

	public String toString() {
		return "(" + this.numerator + "\\" + this.denominator + ")";
	}

}
