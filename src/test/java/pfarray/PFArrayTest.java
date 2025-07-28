package pfarray;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PFArrayTest {

    @Test
    void testFindMax_HappyDay() {
        int[] input = {4, 7, 2};
        int result = PFArray.findMax(input);
        assertEquals(7, result);
    }

    @Test
    void testAddElement_HappyDay() {
        int[] input = {1, 2, 3};
        int newValue = 4;
        int[] result = PFArray.addElement(input, newValue);
        assertEquals(input.length + 1, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    void testFindMin_HappyDay() {
        int[] input = {4, 7, 2};
        int result = PFArray.findMin(input);
        assertEquals(2, result);
    }

    @Test
    void testCreateRandomArray_HappyDay() {
        int[] result = PFArray.generateRandomArray();
        assertNotNull(result);
        assertTrue(result.length >= 1 && result.length <= 100);
        for (int value : result) {
            assertTrue(value >= -100 && value <= 100);
        }
    }

    @Test
    void testFindMax_SingleElement() {
        int[] input = {47};
        int result = PFArray.findMax(input);
        assertEquals(47, result);
    }

    @Test
    void testFindMin_SingleElement() {
        int[] input = {47};
        int result = PFArray.findMin(input);
        assertEquals(47, result);
    }

    @Test
    void testRemoveElement() {
        int[] input = {4, 7, 2, 7};
        int numberToRemove = 7;
        boolean removeAll = true;
        int[] result = PFArray.removeElement(input, numberToRemove, removeAll);
        int[] expected = {4, 2};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRemoveElement_RemoveFirstOnly() {
        int[] input = {4, 7, 2, 7};
        int numberToRemove = 7;
        boolean removeAll = false;
        int[] result = PFArray.removeElement(input, numberToRemove, removeAll);
        int[] expected = {4, 2, 7};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRemoveElement_ElementNotFound() {
        int[] input = {4, 7, 2, 7};
        int numberToRemove = 10;
        boolean removeAll = false;
        int[] result = PFArray.removeElement(input, numberToRemove, removeAll);
        int[] expected = {4, 7, 2, 7};
        assertArrayEquals(expected, result);
    }

    @Test
    void testRemoveElement_EmptyArray() {
        int[] input = new int[0];
        int numberToRemove = 10;
        boolean removeAll = false;
        int[] result = PFArray.removeElement(input, numberToRemove, removeAll);
        int[] expected = new int[0];
        assertArrayEquals(expected, result);
    }

    @Test
    void testClearArray() {
        int[] input = {4, 7, 2, 7};
        int[] result = PFArray.clearArray(input);
        int[] expected = null;
        assertArrayEquals(expected, result);
    }

    @Test
    void testFindMax_EmptyArray_ThrowsException() {
        int[] input = new int[0];
        assertThrows(IllegalArgumentException.class, () -> PFArray.findMax(input));

    }

    @Test
    void testFindMin_EmptyArray_ThrowsException() {
        int[] input = new int[0];
        assertThrows(IllegalArgumentException.class, () -> PFArray.findMin(input));

    }

    @Test
    void testFindMax_NullArray_ThrowsException() {
        int[] input = null;
        assertThrows(IllegalArgumentException.class, () -> PFArray.findMax(input));
    }

    @Test
    void testFindMin_NullArray_ThrowsException() {
        int[] input = null;
        assertThrows(IllegalArgumentException.class, () -> PFArray.findMin(input));
    }

    @Test
    void testAddElement_NullArray_ThrowsException() {
        int[] input = null;
        assertThrows(IllegalArgumentException.class, () -> PFArray.addElement(input, 5));
    }

    @Test
    void testRemoveElement_NullArray_ThrowsException() {
        int[] input = null;
        assertThrows(IllegalArgumentException.class, () -> PFArray.removeElement(input, 5, true));
    }

    @Test
    void testCountElementsToRemove_RemoveAll() {
        int[] input = {2, 7, 2, 7};
        int numberToRemove = 2;
        boolean removeAll = true;
        int result = PFArray.countElementsToRemove(input, numberToRemove, removeAll);
        assertEquals(2, result);
    }

    @Test
    void testRemoveElement_NumberNotFound() {
        int[] input = {1, 2, 3};
        int numberToRemove = 9;
        boolean removeAll = true;
        int[] result = PFArray.removeElement(input, numberToRemove, removeAll);
        assertArrayEquals(input, result);
    }
    @Test
    void testFindMax_OnEmptyArrayAfterRemovingAllElements() {
        int[] input = {9, 9, 9};
        int[] emptied = PFArray.removeElement(input, 9, true);
        assertThrows(IllegalArgumentException.class, () -> PFArray.findMax(emptied));
    }
}



