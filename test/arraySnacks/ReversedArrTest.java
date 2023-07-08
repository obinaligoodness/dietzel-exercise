package arraySnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversedArrTest {
    private ReversedArr reversedArr;
    @Test
    public void testThatWhenAnArrayIsPassedIntoAMethodItIsReversed(){
        int[] numbers = {2,3,4,5};
        assertArrayEquals(new int[]{5,4,3,2},ReversedArr.reversed(numbers));
    }
    @Test
    public void testThatWhenAnArrayWithSimilarNumbersIsPassedIntoAMethodItIsReversed(){
        int[] numbers = {2,3,4,5,5};
        assertArrayEquals(new int[]{5,5,4,3,2},ReversedArr.reversed(numbers));
    }
    @Test
    public void testThatWhenAnArrayWithNegativeNumberIsPassedIntoAMethodItIsReversed(){
        int[] numbers = {-2,3,4,-5};
        assertArrayEquals(new int[]{-5,4,3,-2},ReversedArr.reversed(numbers));
    }
}