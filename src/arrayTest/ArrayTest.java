package arrayTest;

import arrays.Array;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTest {
    @Test
    public void returnSmallestInteger(){
        Array array = new Array();
        int [] numbers = {1,2,3,4,5,3,9,10};
        int [] expected = {1};
        int [] actual =  array.smallestNumber(numbers);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testForAverageOfAllArrays(){{}
        Array array = new Array();
        double [] numbers = {1,2,3,4,5,3,9,10};
        double [] expected = {4.625};
        double [] actual = array.averageNumbers(numbers);
        assertArrayEquals(expected,actual, 0.0001);
    }


}
