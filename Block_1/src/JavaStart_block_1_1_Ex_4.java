
public class JavaStart_block_1_1_Ex_4 implements calcingArea{
	@Override
	public double calcArea() {
		double a = Reader.readDoubleNumber("¬ведите основание 1");
		double b = Reader.readDoubleNumber("¬ведите основание 2");
		double h = Reader.readDoubleNumber("¬ведите высота");
		double S = 0.5 * (a + b) * h;
		return S;
	}
 }
