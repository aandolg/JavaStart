import java.util.HashMap;
import java.util.Map;

public class Block_2_1 {

	public static void main(String[] args) {
		Map<String, �ityCalculate> cityHashmap = new HashMap<String, �ityCalculate>();
		cityHashmap.put("��������������", new �ityCalculate("�����", 1.2));
		cityHashmap.put("�������", new �ityCalculate("�������", 1.5));
		int number = 5;
		
		for(int i = number; i >= 1; i--) {
			for (int j = i; j <= number; j++){
				System.out.print(j + "");
			}
			System.out.println();
		}
		
		/*while (true) {
			String keyCity = Reader.readStringNumber("������� �������� ������");
			�ityCalculate cityFind = cityHashmap.get(keyCity);
			if (cityFind != null) {
				cityFind.calcPopulation();
				break;
			} else {
				System.out.println("����� �� ���������.");
				System.out.println();
				System.out.println("��������� ������: " );
				for ( String key : cityHashmap.keySet() ) {
				    System.out.println( " " + key );
				}
			}
		}*/
	}
}
