
public class JavaStart_block_1_1_Ex_4 implements calcingArea{
	@Override
	public double calcArea() {
		double a = Reader.readDoubleNumber("������� ��������� 1");
		double b = Reader.readDoubleNumber("������� ��������� 2");
		double h = Reader.readDoubleNumber("������� ������");
		double S = 0.5 * (a + b) * h;
		return S;
	}
 }
