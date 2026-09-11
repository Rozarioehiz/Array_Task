package arrayTest;

import arrays.Array;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {
    @Test
    public void returnSmallestInteger() {
        Array array = new Array();
        int[] numbers = {1, 2, 3, 4, 5, 3, 9, 10};
        int[] expected = {1};
        int[] actual = array.smallestNumber(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testForAverageOfAllArrays() {
        {
        }
        Array array = new Array();
        double[] numbers = {1, 2, 3, 4, 5, 3, 9, 10};
        double[] expected = {4.625};
        double[] actual = array.averageNumbers(numbers);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testForLargestNumberInAnArray() {
        Array array = new Array();
        int[] numbers = {1, 2, 3, 4, 5, 3, 9, 10};
        int[] expected = {10};
        int[] actual = array.largestNumber(numbers);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testForOccuringNumbersInAnArray() {
        Array array = new Array();
        int[] numbers = {1, 2, 3, 4, 5, 3, 9, 10};
        int actual = array.countOccurance(numbers, 2);

    }
    @Test
    public void containsElement(){
        Array array = new Array();
        int [] numbers = {1, 2, 3, 4, 5, 3, 9, 10};
        int target = 2;
        boolean expected = true;
        boolean actual = array.elementContainter(numbers, target);
        assertEquals(true, actual);

    }
}
