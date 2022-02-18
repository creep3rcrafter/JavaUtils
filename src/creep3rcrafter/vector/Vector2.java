package creep3rcrafter.vector;

public class Vector2 {
	double x = 0;
	double y = 0;

	public Vector2() {
		this.x = 0;
		this.y = 0;
	}

	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double vector2Distance(Vector2 v1, Vector2 v2) {
		return Math.sqrt(Math.pow(v1.x - v2.x, 2) + Math.pow(v1.y - v2.y, 2));
	}

	public boolean equals(Vector2... vector2) {
		for (int i = 0; i < vector2.length; i++) {
			
		}
		return false;
	}

	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}

	public static String toString(Vector2 vector2) {
		return "(" + vector2.x + ", " + vector2.y + ")";
	}

	public static String toString(Vector2... vector2) {
		String total = "";
		for (int i = 0; i < vector2.length; i++) {
			total = total + "[(" + vector2[i].x + ", " + vector2[i].y + ")]";
		}
		return total;
	}
}
