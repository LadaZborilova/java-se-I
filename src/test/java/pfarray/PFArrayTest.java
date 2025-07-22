package pfarray;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PFArrayTest {

    @Test
    void testFindMaxHappyDay() {
        int[] input = {4, 7, 2};
        int result = PFArray.findMax(input);
        assertEquals(7, result);
    }

    @Test
    void testAddElementHappyDay() {
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
    void testFindMinHappyDay() {
        int[] input = {4, 7, 2};
        int result = PFArray.findMin(input);
        assertEquals(2, result);
    }

    @Test
    void testCreateRandomArrayHappyDay() {
        int[] result = PFArray.generateRandomArray();
        assertNotNull(result);
        assertTrue(result.length >= 1 && result.length <= 100);
        for (int value : result) {
            assertTrue(value >= -100 && value <= 100);
        }
    }
}
