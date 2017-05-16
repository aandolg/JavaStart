import java.awt.List;
import java.util.Arrays;

public class Block_3_1 {
	public static void main(String[] args) {
		String str = "Тут, написан текст через, запятую";
		System.out.println("exp 1: min length word " + minLengthWord(str));

		String[] arrStr = { "Массив", "строк", "условие" };
		int n = 5;
		System.out.println("exp 2:");
		showArray(replaseLastThreeCharByLength(arrStr, n));

		String str1 = "Тут,написан текст через, запятую;";
		System.out.println("exp 3: " + addWhiteSpaceAfterPunctuation(str1));

		String str2 = "Тут,написан текст через, запятую;";
		System.out.println("exp 4: " + getOnceRepeatChar(str2));

		String str3 = "Тут, написан текст через, запятую  asdasd";
		System.out.println("exp 5:" + str3 + " [count word  " + getCountWordInString(str3) + "]");

		String str4 = "Тут, написан текст через, запятую  asdasd";
		System.out.println("exp 6:" + str4 + "[" + subStr(str4, 2, 2) + "]");

		String str5 = "Тут, написан текст через, запятую  asdasd";
		System.out.println("exp 7 v.1:" + str5 + "[" + stringReverce(str5) + "]");

		String str6 = "Тут, написан текст через, запятую  asdasd";
		System.out.println("exp 7 v.2:" + str6 + "[" + stringReverce2(str6) + "]");

		String str7 = "Тут, написан текст через, запятую  asdasd";
		System.out.println("exp 8:" + str7 + "[" + deleteLastWord(str7) + "]");
	}

	public static int minLengthWord(String str) {
		char[] ch = stringToCharArray(str);
		int min = str.length();
		int tmp = 0;
		for (int i = 0; i < ch.length; i++) {
			if (checkCharPonktuation(ch[i])) {
				tmp++;
			} else {
				if (min > tmp && tmp > 0) {
					min = tmp;
					tmp = 0;
				}
			}
		}
		return min;
	}

	public static String[] replaseLastThreeCharByLength(String[] arrStr, int n) {
		for (int i = 0; i < arrStr.length; i++) {
			int length = arrStr[i].length() - 1;
			if (length + 1 == n) {
				char[] tmp = new char[length];
				tmp = arrStr[i].toCharArray();
				for (int j = 0; j < 3; j++) {
					tmp[length - j] = '$';
				}
				arrStr[i] = new String(tmp);
			}
		}
		return arrStr;
	}

	public static String addWhiteSpaceAfterPunctuation(String str) {
		// char[] ch = new char[str.length() - 1];
		// ch = str.toCharArray();
		char[] ch = stringToCharArray(str);
		String ret = "";
		for (int i = 0; i < ch.length; i++) {
			ret += ch[i];

			if (i < ch.length - 1 && !checkCharPonktuation(ch[i]) && ch[i + 1] != ' ') {
				ret += ' ';
			}

		}
		return ret;
	}

	private static String getOnceRepeatChar(String str) {
		char[] ch = stringToCharArray(str);
		char[] arrUniq = new char[ch.length - 1];
		int countIndex = 0;
		for (int i = 0; i < ch.length; i++) {
			if (checkChar(ch[i], arrUniq)) {
				arrUniq[countIndex] = ch[i];
				countIndex++;
			}
		}

		return new String(arrUniq);
	}

	private static int getCountWordInString(String str) {
		char[] ch = stringToCharArray(str);
		int countWord = 0;
		boolean prevCharIsSymbol = false;
		for (int i = 0; i < ch.length; i++) {
			if (prevCharIsSymbol && (!checkCharPonktuation(ch[i]) || i == ch.length - 1)) {
				countWord++;
			}
			prevCharIsSymbol = checkCharPonktuation(ch[i]);
		}
		return countWord;
	}

	private static String subStr(String str, int startPosition, int length) {
		char[] ch = stringToCharArray(str);
		String ret = new String();
		for (int i = 0; i < ch.length; i++) {
			if (i >= startPosition - 1 && i <= startPosition - 1 + length - 1) {
				continue;
			}
			ret += ch[i];
		}
		return ret;
	}

	private static String stringReverce(String str) {
		char[] ch = stringToCharArray(str);
		String ret = new String();
		for (int i = ch.length - 1; i >= 0; i--) {
			ret += ch[i];
		}
		return ret;
	}

	private static String stringReverce2(String str) {
		char[] ch = stringToCharArray(str);
		for (int i = 0; i < ch.length / 2; i++) {
			char t = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = t;
		}
		return new String(ch);
	}

	private static String deleteLastWord(String str) {
		char[] ch = stringToCharArray(str);
		String strRet = new String();
		int index = 0;
		boolean prevCharIsSymbol = true;
		for (int i = ch.length - 1; i >= 0; i--) {
			if (prevCharIsSymbol) {
				prevCharIsSymbol = checkCharPonktuation(ch[i]);
				continue;
			}
			index = i;
			break;
		}
		
		for (int i = 0; i < index; i++) {
			strRet += ch[i];
		}
		return strRet;
	}

	private static char[] stringToCharArray(String str) {
		char[] ch = new char[str.length() - 1];
		ch = str.toCharArray();
		return ch;
	}

	/**
	 * Method for print array in format style "{n1, n2, n3....}"
	 * 
	 * @param tmpArray1
	 *            array for show in console
	 */
	protected static void showArray(char[] tmpArray1) {
		System.out.print("{");
		for (int i = 0; i < tmpArray1.length; i++) {
			System.out.print(tmpArray1[i]);
			if (i < tmpArray1.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.print("}");
		System.out.println();

	}

	protected static void showArray(String[] tmpArray1) {
		System.out.print("{");
		for (int i = 0; i < tmpArray1.length; i++) {
			System.out.print(tmpArray1[i]);
			if (i < tmpArray1.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.print("}");
		System.out.println();

	}

	private static boolean checkCharPonktuation(char ch) {
		char[] poncktuation = { ' ', ',', ';', '.' };
		return checkChar(ch, poncktuation);
	}

	private static boolean checkChar(char ch, char[] arrCharForCheck) {
		boolean result = true;
		for (int i = 0; i < arrCharForCheck.length; i++) {
			if (ch == arrCharForCheck[i]) {
				result = false;
				break;
			}
		}
		return result;
	}

}
