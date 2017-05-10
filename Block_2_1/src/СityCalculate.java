public class �ityCalculate {
	private String name;
	private double procent;
	private int year = 2016;

	public �ityCalculate(String name, double procent) {
		this.name = name; 
		this.procent = procent;
	}

	public void calcPopulation(){
		int population = (int)Reader.readDoubleNumber("������� ��������� ��� " + this.name);
		int nextYear ;
		while (true) {
			nextYear = (int)Reader.readDoubleNumber("������� ��� ��� " + this.name);
			if(nextYear <= this.year)
			{
				System.out.println("��� �� ��������");
			} else {
				break;
			}
		}
	
		int count = this.year;
		System.out.println("�����" + this.name);
		do {
			population = (int) (population * (1 + this.procent/100));
			System.out.println("��� " + count + " ��������� " + population);
			count ++;
		} while (count <= nextYear);
	}
}