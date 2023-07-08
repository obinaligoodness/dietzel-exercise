package arraySnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortTest {

    @Test
    public void testThatItArrangesNumbers() {
        int[]numbers = {68,54,1,0};
        assertSame (numbers,ArraySort.sorting(numbers));
    }

}