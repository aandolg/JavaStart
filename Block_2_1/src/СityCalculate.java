public class СityCalculate {
	private String name;
	private double procent;
	private int year = 2016;

	public СityCalculate(String name, double procent) {
		this.name = name; 
		this.procent = procent;
	}

	public void calcPopulation(){
		int population = (int)Reader.readDoubleNumber("Введите популяцию для " + this.name);
		int nextYear ;
		while (true) {
			nextYear = (int)Reader.readDoubleNumber("Введите год для " + this.name);
			if(nextYear <= this.year)
			{
				System.out.println("Год не актуален");
			} else {
				break;
			}
		}
	
		int count = this.year;
		System.out.println("Город" + this.name);
		do {
			population = (int) (population * (1 + this.procent/100));
			System.out.println("Год " + count + " популяция " + population);
			count ++;
		} while (count <= nextYear);
	}
}