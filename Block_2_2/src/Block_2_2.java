import java.lang.reflect.Array;

/**
 * @author ALEX
 * @version 0.0.1
 */
public class Block_2_2 {

	public static void main(String[] args) {
		int[] tmpArray = { 8, 2, 3, 4, 5, 1 };

		System.out.println("Ex1: " + minValueArray(tmpArray));
		System.out.println("Ex2: " + maxValueArray(tmpArray));
		System.out.println("Ex3: " + minIndexValueArray(tmpArray));
		System.out.println("Ex4: " + maxIndexValueArray(tmpArray));
		// System.out.println("Ex5: " + sumElementArrayChet(tmpArray));
		System.out.println("Ex5: " + sumElementArrayNechet(tmpArray));

		revertArray(tmpArray);
		System.out.println("Ex6: ");
		showArray(tmpArray);

		System.out.println("Ex7: ");
		System.out.println(countElementArrayNechet(tmpArray));

		System.out.println("Ex8 : ");
		int[] tmpArray1 = { 1, 2, 3, 4, 5 };
		tmpArray1 = revertPartArray(tmpArray1);
		showArray(tmpArray1);

		System.out.println("Ex9 bubble : ");
		int[] tmpArray2 = { 7, 2, -1, 4, 5 };
		tmpArray1 = bubbleSortArray(tmpArray1);
		showArray(tmpArray2);

		System.out.println("Ex9 select : ");
		tmpArray2 = selectSortArray(tmpArray2);
		showArray(tmpArray2);

		System.out.println("Ex9 insert: ");
		tmpArray2 = inserSortArray(tmpArray2);
		showArray(tmpArray2);

	}

	/**
	 * Method for print array in format style "{n1, n2, n3....}"
	 * 
	 * @param tmpArray1
	 *            array for show in console
	 */
	protected static void showArray(int[] tmpArray1) {
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

	/**
	 * Find min element in array
	 * 
	 * @param tmp
	 *            Array for find min value
	 * @return int min value in array
	 */
	protected static int minValueArray(int[] tmp) {
		int min = tmp[0];
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] < min) {
				min = tmp[i];
			}
		}
		return min;
	}

	/**
	 * Find max element in array
	 * 
	 * @param tmp
	 *            Array for find max value
	 * @return int max value in array
	 */
	protected static int maxValueArray(int[] tmp) {
		int max = tmp[0];
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] > max) {
				max = tmp[i];
			}
		}
		return max;
	}

	/**
	 * Find index for min element value
	 * 
	 * @param tmp
	 *            Array int to find
	 * @return min int index
	 */
	protected static int minIndexValueArray(int[] tmp) {
		int min = tmp[0];
		int minIndex = 0;
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] < min) {
				min = tmp[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	/**
	 * Find index for max element value
	 * 
	 * @param tmp
	 *            Array int to find
	 * @return max int index
	 */
	protected static int maxIndexValueArray(int[] tmp) {
		int max = tmp[0];
		int maxIndex = 0;
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] > max) {
				max = tmp[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	/**
	 * Method for calc sums element array even index
	 * 
	 * @param tmp
	 *            Array for calc even element
	 * @return sums element int
	 */
	protected static int sumElementArrayChet(int[] tmp) {
		int sum = 0;
		for (int i = 0; i < tmp.length; i = i + 2) {
			sum += tmp[i];
		}
		return sum;
	}

	/**
	 * Method for calc sums element array not even index
	 * 
	 * @param tmp
	 *            Array for calc not even element
	 * @return sums element int
	 */
	protected static int sumElementArrayNechet(int[] tmp) {
		int sum = 0;
		for (int i = 1; i < tmp.length; i = i + 2) {
			sum += tmp[i];
		}
		return sum;
	}

	/**
	 * Method for revert array with {1, 3, 4, 5} to {5, 4, 3, 1}
	 * 
	 * @param tmp
	 *            Arrray[int] for revert
	 * @return revert Arrray[int]
	 */
	protected static int[] revertArray(int[] tmp) {
		int[] tmpArray1 = new int[tmp.length];
		for (int i = tmp.length; i > 0; i--) {
			tmpArray1[tmp.length - i] = tmp[i - 1];
		}
		return tmpArray1;
	}

	/**
	 * Method for count event element
	 * 
	 * @param tmp
	 *            Array for counting even element
	 * @return count element int
	 */
	protected static int countElementArrayNechet(int[] tmp) {
		int count = 0;
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Method for revert array for simple with {1, 2, 3, 4} to {3, 4, 1, 2}
	 *
	 * @param tmp
	 *            Arrray[int] for revert
	 * @return revert Arrray[int]
	 */
	protected static int[] revertPartArray(int[] tmp) {

		int[] tmpArray = new int[tmp.length];
		int half = (int) Math.ceil((float) tmp.length / 2);
		for (int i = 0; i < tmp.length; i++) {
			if (i >= half) {
				tmpArray[i] = tmp[i - half];
			} else {
				if (i + half < tmp.length) {
					tmpArray[i] = tmp[i + half];
				} else {
					tmpArray[i] = tmp[i];
				}
			}
		}
		return tmpArray;

	}

	/**
	 * Method for sort array with type "bubble"
	 * 
	 * @param tmpArray1
	 *            Array for sort
	 * @return Array[int] sort
	 */
	protected static int[] bubbleSortArray(int[] tmpArray1) {
		for (int i = 0; i < tmpArray1.length; i++) {
			for (int j = 0; j < tmpArray1.length; j++) {
				if (tmpArray1[i] < tmpArray1[j]) {
					int tmp = tmpArray1[i];
					tmpArray1[i] = tmpArray1[j];
					tmpArray1[j] = tmp;
				}
			}
		}
		return tmpArray1;
	}

	/**
	 * Method for sort array with type "select"
	 * 
	 * @param tmpArray1
	 *            Array for sort
	 * @return Array[int] sort
	 */
	protected static int[] selectSortArray(int[] tmpArray1) {
		for (int min = 0; min < tmpArray1.length - 1; min++) {
			int least = min;
			for (int j = min + 1; j < tmpArray1.length; j++) {
				if (tmpArray1[j] < tmpArray1[least]) {
					least = j;
				}
			}
			int tmp = tmpArray1[min];
			tmpArray1[min] = tmpArray1[least];
			tmpArray1[least] = tmp;
		}
		return tmpArray1;
	}

	/**
	 * Method for sort array with type "insert"
	 * 
	 * @param tmpArray1
	 *            Array for sort
	 * @return Array[int] sort
	 */
	protected static int[] inserSortArray(int[] tmpArray1) {
		int temp, j;
		for (int i = 0; i < tmpArray1.length - 1; i++) {
			if (tmpArray1[i] > tmpArray1[i + 1]) {
				temp = tmpArray1[i + 1];
				tmpArray1[i + 1] = tmpArray1[i];
				j = i;
				while (j > 0 && temp < tmpArray1[j - 1]) {
					tmpArray1[j] = tmpArray1[j - 1];
					j--;
				}
				tmpArray1[j] = temp;
			}
		}

		return tmpArray1;
	}

}
