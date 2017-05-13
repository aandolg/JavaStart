import java.lang.reflect.Array;

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

	protected static void showArray(int[] tmpArray1) {
		System.out.print("{");
		for (int i = 0; i < tmpArray1.length; i++) {
			System.out.print(tmpArray1[i]);
			if (i < tmpArray1.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}");
		System.out.println();

	}

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

	protected static int minValueArray(int[] tmp) {
		int min = tmp[0];
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] < min) {
				min = tmp[i];
			}
		}
		return min;
	}

	protected static int maxValueArray(int[] tmp) {
		int max = tmp[0];
		for (int i = 1; i < tmp.length; i++) {
			if (tmp[i] > max) {
				max = tmp[i];
			}
		}
		return max;
	}

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

	protected static int sumElementArrayChet(int[] tmp) {
		int sum = 0;
		for (int i = 0; i < tmp.length; i = i + 2) {
			sum += tmp[i];
		}
		return sum;
	}

	protected static int sumElementArrayNechet(int[] tmp) {
		int sum = 0;
		for (int i = 1; i < tmp.length; i = i + 2) {
			sum += tmp[i];
		}
		return sum;
	}

	protected static int[] revertArray(int[] tmp) {
		int[] tmpArray1 = new int[tmp.length];
		for (int i = tmp.length; i > 0; i--) {
			tmpArray1[tmp.length - i] = tmp[i - 1];
		}
		return tmpArray1;
	}

	protected static int countElementArrayNechet(int[] tmp) {
		int count = 0;
		for (int i = 0; i < tmp.length; i++) {
			if (tmp[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

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
}
