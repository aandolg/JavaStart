/**
 * 
 */

/**
 * @author AELEX
 *
 */
public class Polindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Первый*/
		 long number = Reader.readLongNumber("Введите число");
		String strr = Long.toString(number); 
		String reverse = "";
		for(int i = strr.length() - 1; i>=0; --i){
			reverse += strr.charAt(i);
		}
		
		if(strr.equals(reverse)) {
			System.out.println("Полиндром");
		} else {
			System.out.println("Не полиндром");
		}
		
		/*Второй*/
		int number = 321123;
		int temp = number;
		
		int b = 0;
		
		while (temp != 0) {
			b = b*10 + temp % 10;
			temp /= 10;
		}
		
		if (number == b) {
			System.out.println("Полидром");
		} else {
			System.out.println("Не полиндром");
		}
		
		/*Третий*/
		long number = Reader.readLongNumber("Введите число");
		String strr = Long.toString(number); 
		String reverse = new StringBuilder(strr).reverse().toString();
		
		if(strr.equals(reverse)) {
			System.out.println("Полиндром");
		} else {
			System.out.println("Не полиндром");
		}
	}

}
