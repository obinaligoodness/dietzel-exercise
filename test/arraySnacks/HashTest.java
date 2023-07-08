package arraySnacks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HashTest {
    @Test
    public void testThatWhenThereIsPoundSignItRemovesTheElementBeforeThePoundSign(){
        ArrayList<Character>letters = new ArrayList<>();
        letters.add('b');
        letters.add('#');
        letters.add('v');
    }

}