import java.util.Scanner;

public class Task1 {
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		double a;
		double h;
		a = Reader.readDoubleNumber("¬ведите высоту: ");
		h = Reader.readDoubleNumber("¬ведите основу: ");
		System.out.println("P = " + Task1.P(a, h));
	}
	/**
	 * Triangle area counting
	 * 
	 * @param a base triangle
	 * @param h height triangle
	 * @return double
	 */
	public static double P(double a, double h) {
		return 0.5 * a * h;
	}
}
