package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    Fibonacci fibonacci;
    @BeforeEach
    void setUp(){
       fibonacci = new Fibonacci();
    }
}
