package arraySnacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraySnackTest {
    ArraySnack arraySnack;
    @BeforeEach
    void setUp(){
         arraySnack = new ArraySnack();
    }
    @Test
    void testThatTheMethodsReturnTheLargestNumber(){
        int[]numbers = {2,3,6,3,5,1};
        assertEquals(6,arraySnack.largestElement(numbers));
    }
    @Test
    void testThatTheMethodReturnReversed(){
        int[]numbers = {2,3,6,3,5,1};
        int [] expected = {1,5,3,6,3,2};
        assertArrayEquals(expected,arraySnack.reverse(numbers));
    }
}
