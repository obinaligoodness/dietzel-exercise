package arraySnacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LcmTest {
    private Lcm lcm;
    @Test
    public void testThatWhenAnArrayIsPassedIntoAMethodItReturnsTheLcm() {
        int num = 121;
        assertArrayEquals(new int[]{11,11}, Lcm.getLCM(num));
    }

}