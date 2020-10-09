import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayHelperTest {

	@Test
	void insertElementTest() {
		int[] arr = { 1, 6, 3, 2 };

		/*
		 * ArrayHelper helper = new ArrayHelper(); helper.insertElement(arr,8,2);
		 */
		int[] expected = { 1, 6, 8, 3, 2 };
		int[] res = ArrayHelper.insertElement(arr, 8, 2);
		assertArrayEquals(expected, res);

		expected = new int[] { 1, 6, 3, 2 };
		res = ArrayHelper.insertElement(arr, 8, 20);
		assertArrayEquals(expected, res);

		int[] emptyArr = {};
		expected = new int[] { 8 };
		res = ArrayHelper.insertElement(emptyArr, 8, 0);
		assertArrayEquals(expected, res);
	}

	@Test
	void removeElementTest() {
		// src - {8,4,1,56,8,3,2,4,6,7,98,3,2} - 13
		// position - 4
		// res - {8,4,1,56,3,2,4,6,7,98,3,2} - 12

		int[] src = { 8, 4, 1, 56, 8, 3, 2, 4, 6, 7, 98, 3, 2 };
		int[] expected = { 8, 4, 1, 56, 3, 2, 4, 6, 7, 98, 3, 2 };

		int[] res = ArrayHelper.removeElement(src, 4);

		assertNotNull(res);
		assertFalse(res.length == 0);
		assertArrayEquals(expected, res);

		int[] emptyArr = {};
		res = ArrayHelper.removeElement(emptyArr, 4);
		assertNotNull(res);
		assertTrue(res.length == 0);

		int[] oneElementArray = { 10 };
		res = ArrayHelper.removeElement(oneElementArray, 0);
		assertNotNull(res);
		assertTrue(res.length == 0);
	}
}
