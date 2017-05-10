import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		double a = 0;
		double h = 0;
		a = readDoubleNumber("¬ведите высоту: ");
		h = readDoubleNumber("¬ведите основу: ");
		System.out.println("P = " + Task1.P(a, h));
	}
	
	public static double readDoubleNumber(String outString) {
		String str;
		try {
			System.out.println(outString);
			str = br.readLine();
			return Double.parseDouble(str);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return  0;
	} 
}
