package ClassWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bikes bikes;

    @BeforeEach
    public void setUp() {
        bikes = new Bikes();
    }

    @Test
    public void bikeCanBeTurnedOnTest() {
        assertFalse(bikes.isOn());

        bikes.turnOn();
        assertTrue(bikes.isOn());
    }

    @Test
    public void bikeCanBeTurnedOffTest() {
        bikes.turnOn();

        bikes.turnOff();
        assertFalse(bikes.isOn());
    }

    @Test
    public void bikeCanBeAcceleratedOnGearOneTest() {
        bikes.turnOn();
        assertEquals(0, bikes.getSpeed());
        assertEquals(1, bikes.getGear());

        bikes.increaseSpeed();
        assertEquals(1, bikes.getSpeed());
    }

    @Test
    public void bikeWillNotAccelerateWhenOffTest() {
        assertFalse(bikes.isOn());
        assertEquals(0, bikes.getSpeed());

        bikes.increaseSpeed();
        assertEquals(0, bikes.getSpeed());

    }

    @Test
    public void bikeCanChangeFromGearOneToGearTwoAutomaticTest() {
        bikes.turnOn();
        assertEquals(1, bikes.getGear());
        for (int i = 0; i < 20; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(20, bikes.getSpeed());
        assertEquals(1, bikes.getGear());
        bikes.increaseSpeed();
        assertEquals(2, bikes.getGear());
        assertEquals(21, bikes.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearTwoTest() {
        bikes.turnOn();
        for (int i = 0; i < 21; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(21, bikes.getSpeed());
        assertEquals(2, bikes.getGear());

        bikes.increaseSpeed();
        assertEquals(2, bikes.getGear());
        assertEquals(23, bikes.getSpeed());

    }

    @Test
    public void bikeCanChangeFRomGearTwoToGearThreeTest() {
        bikes.turnOn();
        for (int i = 0; i < 25; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(29, bikes.getSpeed());
        assertEquals(2, bikes.getGear());

        bikes.increaseSpeed();
        assertEquals(31, bikes.getSpeed());
        assertEquals(3, bikes.getGear());

    }

    @Test
    public void bikeCanChangeFromGearThreeToGearFourTest() {
        bikes.turnOn();
        for (int i = 0; i < 29; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(40, bikes.getSpeed());
        assertEquals(3, bikes.getGear());

        bikes.increaseSpeed();
        assertEquals(43, bikes.getSpeed());
        assertEquals(4, bikes.getGear());

        bikes.increaseSpeed();
        assertEquals(47, bikes.getSpeed());
        assertEquals(4, bikes.getGear());
    }

    @Test
    public void bikeCanDecelerateOnGearOneTest() {
        bikes.turnOn();
        assertEquals(0, bikes.getSpeed());
        for (int i = 0; i < 10; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(10, bikes.getSpeed());
        assertEquals(1, bikes.getGear());

        bikes.decreaseSpeed();
        assertEquals(9, bikes.getSpeed());
        assertEquals(1, bikes.getGear());
    }

    @Test
    public void bikeCanDecelerateOnGearTwoTest() {
        bikes.turnOn();
        assertEquals(0, bikes.getSpeed());
        for (int i = 0; i < 24; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(27, bikes.getSpeed());
        assertEquals(2, bikes.getGear());

        bikes.decreaseSpeed();
        assertEquals(25, bikes.getSpeed());
        assertEquals(2, bikes.getGear());

    }

    @Test
    public void bikeCanDecelerateOnGearThreeTest() {
        bikes.turnOn();
        assertEquals(0, bikes.getSpeed());
        for (int i = 0; i < 27; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(34, bikes.getSpeed());
        assertEquals(3, bikes.getGear());

        bikes.decreaseSpeed();
        assertEquals(31, bikes.getSpeed());
        assertEquals(3, bikes.getGear());

    }
    @Test
    public void bikeCanDecelerateOnGearFourTest() {
        bikes.turnOn();
        assertEquals(0, bikes.getSpeed());
        for (int i = 0; i < 32; i++) {
            bikes.increaseSpeed();
        }
        assertEquals(51, bikes.getSpeed());
        assertEquals(4, bikes.getGear());

        bikes.decreaseSpeed();
        assertEquals(47, bikes.getSpeed());
        assertEquals(4, bikes.getGear());

    }


}