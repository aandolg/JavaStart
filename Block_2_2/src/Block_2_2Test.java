

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Block_2_2Test {
	
	@Test
	public void testInserSortArray() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int[] outArray = {-1, 2,  4, 5, 7 };
		assertArrayEquals(Block_2_2.inserSortArray(inArray), outArray);
	}

	@Test
	public void testMinValueArray() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int outvalue = -1;
		assertEquals(Block_2_2.minValueArray(inArray), outvalue);
	}

	@Test
	public void testMaxValueArray() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int outvalue = 7;
		assertEquals(Block_2_2.maxValueArray(inArray), outvalue);
	}

	@Test
	public void testMinIndexValueArray() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int outIndex = 2;
		assertEquals(Block_2_2.minIndexValueArray(inArray), outIndex);
	}

	@Test
	public void testMaxIndexValueArray() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int outIndex = 0;
		assertEquals(Block_2_2.maxIndexValueArray(inArray), outIndex);
	}

	@Test
	public void testSumElementArrayChet() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int outIndex = 11;
		assertEquals(Block_2_2.sumElementArrayChet(inArray), outIndex);
	}

	@Test
	public void testSumElementArrayNechet() {
		int[] inArray = {7, 2, -1, 4, 5 };
		int outValue = 6;
		assertEquals(Block_2_2.sumElementArrayNechet(inArray), outValue);
	}

	@Test
	public void testRevertArray() {
		int[] inArray = {1, 2, 3, 4};
		int[] outValue = {4, 3, 2, 1};
		assertArrayEquals(Block_2_2.revertArray(inArray), outValue);
		
	}

	@Test
	public void testCountElementArrayNechet() {
		int[] inArray = {1, 2, 3, 4};
		int outValue = 2;
		assertEquals(Block_2_2.countElementArrayNechet(inArray), outValue);
	}

	@Test
	public void testRevertPartArray() {
		//Check pair count array
		int[] inArray = {1, 2, 3, 4};
		int[] outValue = {3, 4, 1, 2};
		assertArrayEquals(Block_2_2.revertPartArray(inArray), outValue);
		//Check not pair count array
		int[] inArray1 = {1, 2, 3, 4, 5};
		int[] outValue1 = {4, 5, 3, 1, 2};
		assertArrayEquals(Block_2_2.revertPartArray(inArray1), outValue1);
	}

	@Test
	public void testBubbleSortArray() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int[] outArray = {-1, 2,  4, 5, 7 };
		assertArrayEquals(Block_2_2.inserSortArray(inArray), outArray);
	}

	@Test
	public void testSelectSortArray() {
		int[] inArray = { 7, 2, -1, 4, 5 };
		int[] outArray = {-1, 2,  4, 5, 7 };
		assertArrayEquals(Block_2_2.inserSortArray(inArray), outArray);
	}

}
