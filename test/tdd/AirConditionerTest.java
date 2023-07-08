package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AirConditionerTest {
    @Test
    public void CheckIsOn() {
        AirConditioner airConditioner = new AirConditioner("LG");
        airConditioner.setOn(false);
        boolean ac = airConditioner.getOn();
        assertFalse(ac);
    }

    @Test
    public void checkTemperature() {
        AirConditioner airConditioner = new AirConditioner("LG");
        airConditioner.setTemperature(18);
        airConditioner.setTemperature(35);
        int temperature = airConditioner.getTemperature();
        assertEquals(18, temperature);
    }

    @Test
    public void increaseTemperatureCheck() {
        AirConditioner airConditioner = new AirConditioner("LG");
        airConditioner.setTemperature(18);
        airConditioner.increaseTemperature();
        int temperature = airConditioner.getTemperature();
        assertEquals(19, temperature);
    }

    @Test
    public void increaseTemperatureCheckForNumbersHigherThan() {
        AirConditioner airConditioner = new AirConditioner("LG");
        airConditioner.setTemperature(30);
        airConditioner.increaseTemperature();
        int temperature = airConditioner.getTemperature();
        assertEquals(30, temperature);
    }

    @Test
    public void decreaseTemperatureCheckForNumbersHigherThan() {
        AirConditioner airConditioner = new AirConditioner("LG");
        airConditioner.setTemperature(30);
        airConditioner.decreaseTemperature();
        int temperature = airConditioner.getTemperature();
        assertEquals(29, temperature);
    }
    @Test
    public void checkProductName() {
        AirConditioner airConditioner = new AirConditioner("LG");
        airConditioner.setProductName("LG");
       String productName= airConditioner.getProductName();
       assertEquals("LG",productName);
}

}