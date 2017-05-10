public class JavaStart_block_1_1_Ex_6 {
	static String calcTime (int time) {
		int hourPast = Math.floorDiv(3497, 3600);
		int minPast = Math.floorDiv(3497, 60);
		int secondPast = Math.floorMod(time, 60);

		return "Прошло часов:" + hourPast + " минут:" + minPast + " секунд: " + secondPast;
	}
}

