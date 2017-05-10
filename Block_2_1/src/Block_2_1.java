import java.util.HashMap;
import java.util.Map;

public class Block_2_1 {

	public static void main(String[] args) {
		Map<String, ÑityCalculate> cityHashmap = new HashMap<String, ÑityCalculate>();
		cityHashmap.put("Äíåïðîïåòðîâñê", new ÑityCalculate("Äíåïð", 1.2));
		cityHashmap.put("Õàðüêîâ", new ÑityCalculate("Õàðüêîâ", 1.5));
		int number = 5;
		
		for(int i = number; i >= 1; i--) {
			for (int j = i; j <= number; j++){
				System.out.print(j + "");
			}
			System.out.println();
		}
		
		/*while (true) {
			String keyCity = Reader.readStringNumber("Ââåäèòå íàçâàíèå ãîðîäà");
			ÑityCalculate cityFind = cityHashmap.get(keyCity);
			if (cityFind != null) {
				cityFind.calcPopulation();
				break;
			} else {
				System.out.println("Ãîðîä íå îáíàðóæåí.");
				System.out.println();
				System.out.println("Äîñòóïíûå ãîðîäà: " );
				for ( String key : cityHashmap.keySet() ) {
				    System.out.println( " " + key );
				}
			}
		}*/
	}
}
