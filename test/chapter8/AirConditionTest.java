package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest{
        private  AirCondition airCondition;
        @BeforeEach
        public void startUpWithThis(){
            airCondition = new AirCondition();
        }
        @Test
        public void airconditionCanBeTurnedOnTest(){
            airCondition = new AirCondition();
            assertFalse(airCondition.isOn());
            airCondition.turnOn();
            assertTrue(airCondition.isOn());

        }
        @Test
        public void airconditionCanBeTurnedOffTest(){
            airCondition = new AirCondition();
            assertFalse(airCondition.isOn());
            airCondition.turnOn();
            assertTrue(airCondition.isOn());

            airCondition.turnOff();
            assertFalse(airCondition.isOn());
        }
        @Test
        public void airconditionInitialTempTest(){
            airCondition.turnOn();
            assertEquals(16,airCondition.getTemp());

        }
        @Test
        public void airconditionTempCanIncreaseTest(){
            airCondition.turnOn();
            airCondition.increaseTemp();
            assertEquals(17,airCondition.getTemp());
            airCondition.increaseTemp();
            airCondition.increaseTemp();
            assertEquals(19,airCondition.getTemp());
        }
        @Test
        public void airconditionerWillNotIncreaseWhenOffTest(){
            airCondition.increaseTemp();
            assertNotEquals(17,airCondition.getTemp());
        }
        @Test
        public void airconditionerTempCanNotIncreaseAboveThirtyTest(){
            airCondition.turnOn();
            for (int i = 0; i < 13; i++) {
                airCondition.increaseTemp();
            }
            assertEquals(29,airCondition.getTemp());
            airCondition.increaseTemp();
            assertEquals(30,airCondition.getTemp());
            airCondition.increaseTemp();
            assertEquals(30,airCondition.getTemp());

        }
        @Test
        public void airconditionerTempRemainTheSameWayItWasWhenIsOffTest(){
            airCondition.turnOn();
            for (int i = 0; i < 10; i++) {
                airCondition.increaseTemp();

            }
            assertEquals(26,airCondition.getTemp());
            airCondition.turnOff();
            assertNotEquals(27,airCondition.getTemp());
            airCondition.turnOn();
            assertEquals(26,airCondition.getTemp());

        }
       @Test
       public void airconditionerCanDecreaseTest(){
        airCondition.turnOn();
        for (int i = 0; i < 4; i++) {
            airCondition.increaseTemp();
        }
        assertEquals(20,airCondition.getTemp());
        airCondition.decreaseTemp();
        assertEquals(19,airCondition.getTemp());
    }
    @Test
    public void airconditionerCantDecreaseWhenOffTest(){
        airCondition.turnOff();
        assertNotEquals(17,airCondition.getTemp());
    }
    @Test
    public void airconditionerCantBeDecreaseLowerThanSixteenTest(){
        airCondition.turnOn();
        airCondition.decreaseTemp();
        assertEquals(16,airCondition.getTemp());
    }

}

