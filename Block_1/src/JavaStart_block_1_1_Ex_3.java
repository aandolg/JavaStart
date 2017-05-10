
public class JavaStart_block_1_1_Ex_3 implements calcingArea{

	@Override
	public double calcArea() {
		double a = 0;
		double h = 0;
		a = Task_2.readDoubleNumber("¬ведите высоту: ");
		h = Task_2.readDoubleNumber("¬ведите основу: ");
		return Task1.P(a, h);
	}
	
}
