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
}
