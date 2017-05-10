public class JavaStart_block_1_1 {

	public static void main(String[] args) {
		
		System.out.println("площади треугольника");
		JavaStart_block_1_1_Ex_3 triangle = new JavaStart_block_1_1_Ex_3();
		System.out.println("S = triangle" + triangle.calcArea());
		
		System.out.println("площади трапеции");
		JavaStart_block_1_1_Ex_4 trapeze = new JavaStart_block_1_1_Ex_4();
		System.out.println("S = trapeze" + trapeze.calcArea());
		
		System.out.println("площади круга");
		JavaStart_block_1_1_Ex_5 circle = new JavaStart_block_1_1_Ex_5();
		System.out.println("S = circle" + circle.calcArea());
		
		System.out.println("— начала суток прошло n");
		System.out.println(JavaStart_block_1_1_Ex_6.calcTime(3487));
		
	}

}
