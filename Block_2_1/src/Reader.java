import java.util.Scanner;

public class Reader {
	public static Scanner in = new Scanner(System.in);
	/**
	 * Out text in console and read digit
	 * 
	 * @param outString string to out console
	 * @return double entered digit
	 */
	public static double readDoubleNumber(String outString) {
		System.out.println(outString);
		return  in.nextDouble();
	}
	
	/**
	 * Out text in console and read digit
	 * 
	 * @param outString string to out console
	 * @return double entered digit
	 */
	public static long readLongNumber(String outString) {
		System.out.println(outString);
		return  in.nextLong();
	}
}
