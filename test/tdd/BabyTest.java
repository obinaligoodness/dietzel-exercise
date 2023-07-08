package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BabyTest {
@Test
    public void requiredargsConstructorTest(){
    Baby babym =new Baby(7);
    assertEquals(7,babym.getWeightInKg());
    assertEquals(0,babym.getAge());
    assertEquals(null,babym.getName());
}
}