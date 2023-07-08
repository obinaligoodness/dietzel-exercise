package HackerRank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {
    MultiplicationTable multiplication;
    @BeforeEach
    void setUp(){
      multiplication = new MultiplicationTable();
    }
    @Test
 void testThatAUserCanOnlyEnterAPositiveInteger(){

        assertEquals(8,multiplication.rejectNegativeNumbers(8));
    }
    @Test
    void testThatTheOutputIsCorrect(){
        multiplication.rejectNegativeNumbers(5);
        int[]expected ={0,5,10,15,20,25,30,35,40,45,50};
        assertArrayEquals(expected,multiplication.displayOutput());
    }
}