package ArrayTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JavaArrayTest {
    JavaArray javaArray;
    @BeforeEach
    void startAllTestWith(){
         javaArray = new JavaArray();
        assertNotNull(javaArray);
    }
    @Test
    void checkIfItMultiplies(){
        int[]numbers = {2,4,6,3,5,1};
        int[]expected={4,16,36,9,25,1};
       assertArrayEquals(expected,javaArray.Multiply(numbers));
    }
}
